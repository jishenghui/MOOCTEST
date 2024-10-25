/*
 * Copyright 2010 The Greplin Bloom Filter Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.mooctest;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Represents the metadata associated with a serialized bloom filter.
 * <p/>
 * The old header format was:
 * 4 bytes for the number of hash Fns
 * 4 bytes for the total file size (data + metadata) in bits
 * That header format always assumed 4-bit buckets
 * <p/>
 * The header format is now as follows:
 * 8 bytes of zeroes (to distinguish this format from the old one)
 * 3 bytes for the 'magic word' which is: 0xB1 0xF1 0xCA
 * 1 byte for the header version (currently 2 - implicitly 1 in the old header format)
 * 4 bytes for header length in bytes (currently 32 bytes)
 * 4 bytes for real-size in bytes (total size of data + metadata)
 * 4 bytes for the number of hash fns
 * 4 bytes for the number of counting-bits in each bucket
 * 4 bytes of 0 padding to make the whole header 32-bytes even
 * The new format has the first two bytes as '0', which the old format will never have - so we can safely identify
 * which is which. If we detect the old format, we can safely assume there are four bits per bucket.
 * This is a little convoluted, but it's the safest way to guarantee backwards compatibility with the old format
 */
class BloomMetadata {

    //常量定义
    // 整型变量在内存中占用的大小，以字节为单位
    public static final int INT_SIZE = 4;
    // 每个字节包含的位数
    public static final int BITS_IN_BYTE = 8;
    // 当前数据结构或算法的版本号，用于兼容性判断
    public static final byte VERSION = 2;
    // 用于标识数据的魔数，是一种格式化标识
    public static final byte[] MAGIC_WORD = {(byte) 0xB1, (byte) 0xF1, (byte) 0xCA};
    // 预期的头部信息长度，用于验证数据的完整性
    public static final int EXPECTED_HEADER_BYTES = 32;

    // 当前使用的版本号
    public final byte version;
    // 头部信息的长度，包含元数据
    public final int headerLength;
    // 整个数据的总长度，包括头部和数据体
    public final int totalLength;
    // 哈希函数的数量，影响数据分布的均匀性
    public final int hashFns;
    // 桶的大小，决定了数据存储的基本单元
    public final BucketSize bucketSize;

    // 单个桶中能存储的最大计数值
    public final int maxCountInBucket;
    // 每个字节中包含的桶的数量，与bucketSize共同决定存储效率
    public final int bucketsPerByte;
    // 桶的总数量，反映了数据结构的容量
    public final int bucketCount;


    /**
     * 从文件中读取Bloom过滤器的元数据头部
     *
     * @param buffer 随机访问文件对象
     * @return 读取到的BloomMetadata对象
     * @throws IOException 如果读取或解析发生错误
     */
    public static BloomMetadata readHeader(RandomAccessFile file) throws IOException {
        try {
//            byte version = file.readByte();
//            int headerLength = file.readInt();
//            int totalLength = file.readInt();
//            int hashFns = file.readInt();
//            int bucketBits = file.readInt();
            final int firstInt = file.readInt();
            final int secondInt = file.readInt();

            if (firstInt == 0 && secondInt == 0) {
                return readNewStyleHeader(file);
            } else {
                return readOldStyleHeader(file, firstInt, secondInt);
            }
//            BucketSize bucketSize = BucketSize.fromBits(bucketBits);

//            return new BloomMetadata(file, version, headerLength, totalLength, hashFns, bucketSize);
        } catch (EOFException e) {
            System.err.println("读取文件时遇到文件末尾异常");
            throw e;
        }
    }



    /**
     * 创建一个新的Bloom过滤器元数据对象
     *
     * @param buckets   桶的数量
     * @param hashFns   哈希函数的数量
     * @param countBits 每个桶计数的位数
     * @return 创建的BloomMetadata对象
     * @throws IOException 如果创建过程中发生错误
     */
//    C:\Users\JSH.HP\AppData\Local\Temp\bloomMetadataTest18392291157193731573.tmp
    public static BloomMetadata createNew(final int buckets, final int hashFns, final BucketSize countBits)
            throws IOException {
        return new BloomMetadata(null, VERSION, EXPECTED_HEADER_BYTES,
                EXPECTED_HEADER_BYTES + bytes(buckets * countBits.getBits()), hashFns, countBits);
    }


    /**
     * 根据指定的总长度创建一个新的Bloom过滤器元数据对象
     *
     * @param totalLength 总长度
     * @param hashFns     哈希函数的数量
     * @param countBits   每个桶计数的位数
     * @return 创建的BloomMetadata对象
     * @throws IOException 如果创建过程中发生错误
     */
    public static BloomMetadata createNewWithLength(final int totalLength, final int hashFns, final BucketSize countBits)
            throws IOException {
        return new BloomMetadata(null, VERSION, EXPECTED_HEADER_BYTES, totalLength, hashFns, countBits);
    }


    /**
     * 构造函数，用于创建BloomMetadata对象
     *
     * @param file         文件对象，可以为null
     * @param version      版本号
     * @param headerLength 头部长度
     * @param totalLength  总长度
     * @param hashFns      哈希函数数量
     * @param bucketSize   桶大小配置
     * @throws IOException 如果创建过程中发生错误
     */
    public BloomMetadata(RandomAccessFile file,
                         byte version, int headerLength, int totalLength, int hashFns, BucketSize bucketSize)
            throws IOException {
        this.version = version;
        this.headerLength = headerLength;
        this.totalLength = totalLength;
        this.hashFns = hashFns;
        this.bucketSize = bucketSize;
        this.maxCountInBucket = (1 << this.bucketSize.getBits()) - 1;
        this.bucketsPerByte = BITS_IN_BYTE / this.bucketSize.getBits();
        // (总长度-标题长度)*每字节的桶
        this.bucketCount = (this.totalLength - this.headerLength) * this.bucketsPerByte;

        if (hashFns <= 0) {
            throw new InvalidBloomFilter("Invalid number of hashFns (" + hashFns + " bytes)");
        }

        if (this.totalLength < this.headerLength) {
            throw new InvalidBloomFilter("Impossibly short size (" + totalLength + " bytes)");
        }

        if (file != null && file.length() != totalLength) {
            throw new InvalidBloomFilter("Expected a file length of " + totalLength + " but only got " + file.length());
        }
    }


    /**
     * 计算给定位数需要的字节数
     *
     * @param bits 位数
     * @return 需要的字节数
     */
    public static int bytes(int bits) {
        return bits / BITS_IN_BYTE + (bits % BITS_IN_BYTE == 0 ? 0 : 1);
    }


    /**
     * 读取旧版本格式的Bloom过滤器头部
     *
     * @param file     文件对象
     * @param hashFns  哈希函数数量
     * @param realSize 实际大小
     * @return 旧版本格式的BloomMetadata对象
     * @throws IOException 如果读取过程中发生错误
     */
    public static BloomMetadata readOldStyleHeader(RandomAccessFile file, int hashFns, int realSize)
            throws IOException {
        return new BloomMetadata(file, (byte) 1, 2 * INT_SIZE, bytes(realSize), hashFns, BucketSize.FOUR);
    }


    /**
     * 读取新版本格式的Bloom过滤器头部
     *
     * @param buffer 随机访问文件对象
     * @return 新版本格式的BloomMetadata对象
     * @throws IOException 如果读取过程中发生错误
     */
    public static BloomMetadata readNewStyleHeader(RandomAccessFile buffer) throws IOException {

        // verify the magic word is present and intact
        final byte[] shouldBeMagicWord = new byte[MAGIC_WORD.length];
        buffer.read(shouldBeMagicWord);
        if (!Arrays.equals(MAGIC_WORD, shouldBeMagicWord)) {
            throw new InvalidBloomFilter("Invalid Magic Word " + Arrays.toString(shouldBeMagicWord));
        }

        // verify the version is correct
        final byte version = buffer.readByte();
        if (!(version == VERSION)) {
            throw new InvalidBloomFilter("Unrecognized version (" + version + ")");
        }

        final int headerLen = buffer.readInt();
        if (headerLen != EXPECTED_HEADER_BYTES) {
            throw new InvalidBloomFilter("Unexpected header length (" + headerLen + " bytes)");
        }

        final int realSize = buffer.readInt();

        final int hashFns = buffer.readInt();

        final int bucketSizeInt = buffer.readInt();
        final BucketSize bucketSize = BucketSize.getBucketSize(bucketSizeInt);
        if (bucketSize == null) {
            throw new InvalidBloomFilter("Invalid bucketSize (" + bucketSize + " bytes)");
        }

        if (buffer.readInt() != 0) {
            throw new InvalidBloomFilter("Invalid end padding");
        }

        return new BloomMetadata(buffer, version, headerLen, realSize, hashFns, bucketSize);
    }


    /**
     * 获取版本号
     *
     * @return 版本号
     */
    public byte getVersion() {
        return version;
    }


    /**
     * 获取头部长度
     *
     * @return 头部长度
     */
    public int getHeaderLength() {
        return headerLength;
    }


    /**
     * 获取总长度
     *
     * @return 总长度
     */
    public int getTotalLength() {
        return totalLength;
    }


    /**
     * 获取哈希函数数量
     *
     * @return 哈希函数数量
     */
    public int getHashFns() {
        return hashFns;
    }


    /**
     * 获取桶大小配置
     *
     * @return 桶大小配置
     */
    public BucketSize getBucketSize() {
        return bucketSize;
    }


    /**
     * 获取每个桶的最大计数
     *
     * @return 每个桶的最大计数
     */
    public int getMaxCountInBucket() {
        return maxCountInBucket;
    }


    /**
     * 获取每个字节中的桶数量
     *
     * @return 每个字节中的桶数量
     */
    public int getBucketsPerByte() {
        return bucketsPerByte;
    }


    /**
     * 获取总桶数量
     *
     * @return 总桶数量
     */
    public int getBucketCount() {
        return bucketCount;
    }


    /**
     * 将当前元数据对象写入文件
     *
     * @param file 文件对象
     * @throws IOException 如果写入过程中发生错误
     */
    public void writeToFile(RandomAccessFile file) throws IOException {
        if (getVersion() == 1) {
            assert getHeaderLength() == 2 * INT_SIZE;
            file.writeInt(getHashFns());
            file.writeInt(getTotalLength() / BITS_IN_BYTE);
        } else {
            assert getVersion() == VERSION;
            file.writeInt(0);                         // 4 bytes
            file.writeInt(0);                         // 8 bytes
            file.write(MAGIC_WORD);                   // 11 bytes
            file.writeByte(VERSION);                  // 12 bytes
            file.writeInt(EXPECTED_HEADER_BYTES);     // 16 bytes
            file.writeInt(getTotalLength());          // 20 bytes
            file.writeInt(getHashFns());              // 24 bytes
            file.writeInt(getBucketSize().getBits()); // 28 bytes
            file.writeInt(0);                         // 32 bytes
        }

    }
}
