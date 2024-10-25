package net.mooctest;

import static org.junit.Assert.*;
import java.io.IOException;

import org.junit.Test;

public class BloomMetadataTest {

	@Test
    public void testCreateNew() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(BloomMetadata.VERSION, metadata.version);
        assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES, metadata.headerLength);
        assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES + 2, metadata.totalLength);
        assertEquals(2, metadata.hashFns);
        assertEquals(BucketSize.ONE, metadata.bucketSize);
    }

}
