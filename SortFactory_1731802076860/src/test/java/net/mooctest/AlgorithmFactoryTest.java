package net.mooctest;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Future;

import static org.junit.Assert.*;

public class AlgorithmFactoryTest {
    ByteArrayOutputStream outContent;
    Random random = new Random();
    String lineSeparator = System.lineSeparator();//操作系统换行符
    PrintStream printStream;

    //捕获控制台输出，每个方法仅限使用一次(没有出缓,保守点)
    public void GetOutPutBefore() {
        outContent = new ByteArrayOutputStream();
        printStream = new PrintStream(outContent);
        System.setOut(printStream);
    }

    public String GetOutPutAfter() {
        return outContent.toString();//获取输出的内容
    }

    //关闭流
    public void GetOutPutEnd() throws IOException {
        outContent.close();
        printStream.close();
    }

    @Test
    public void test() throws Exception {
        int ex = 0;
        AlgorithmFactory factory = new AlgorithmFactory();
        Algorithm algorithm1 = factory.getAlgorithm("QuickSort");
        assertTrue(algorithm1 instanceof OptimizedQuickSort);
        Algorithm algorithm2 = factory.getAlgorithm("Bubblesort");
        assertTrue(algorithm2 instanceof BubbleSort);
        Algorithm algorithm3 = factory.getAlgorithm("Parallelmergesort");
        assertTrue(algorithm3 instanceof ParallelMergeSort);
        AlgorithmManager algorithmManager = new AlgorithmManager();
        algorithmManager.addAlgorithm(algorithm1);
        algorithmManager.addAlgorithm(algorithm2);
        algorithmManager.addAlgorithm(algorithm3);
        assertEquals(null, algorithmManager.getAlgorithm("a"));
        assertEquals(algorithm3, algorithmManager.getAlgorithm("Parallel Merge Sort"));
        assertEquals(algorithm2, algorithmManager.getAlgorithm("Bubble Sort"));
        assertEquals(algorithm1, algorithmManager.getAlgorithm("Optimized Quick Sort"));


        ArrayDataStructure arrayDataStructure = new ArrayDataStructure(10);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayDataStructure.add(i);
            array[i] = i;
        }
        assertArrayEquals(array, arrayDataStructure.toArray());
        arrayDataStructure.add(11);
        arrayDataStructure.set(0, 100);
        assertEquals(100, arrayDataStructure.get(0));
        assertEquals(10, algorithmManager.searchData("Bubble Sort", arrayDataStructure, 11));
        algorithmManager.sortData("Bubble Sort", arrayDataStructure);
        assertEquals(100, arrayDataStructure.get(10));

        arrayDataStructure.set(0, 101);
        algorithmManager.sortData("Optimized Quick Sort", arrayDataStructure);
        assertEquals(101, arrayDataStructure.get(10));

        arrayDataStructure.set(0, 102);
        algorithmManager.sortData("Parallel Merge Sort", arrayDataStructure);
        assertEquals(102, arrayDataStructure.get(10));

        assertEquals(11, arrayDataStructure.size());
        arrayDataStructure.fromArray(array);
        assertArrayEquals(array, arrayDataStructure.toArray());


        BSTDataStructure bstDataStructure = new BSTDataStructure();
        int[] array2 = new int[]{6, 3, 5, 4, 2, 11, 1, 8, 13, 7, 8, 10, 12, 15, 14, 0};
        for (int i = 0; i < array2.length - 1; i++) {
            bstDataStructure.add(array2[i]);
        }
        assertEquals(15, bstDataStructure.size());
        assertEquals(16, bstDataStructure.addRecursive(null, 16).data);
        try {
            assertArrayEquals(array2, bstDataStructure.toArray());
        } catch (AssertionError e) {
            ex++;
        }
        array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 0};
        assertArrayEquals(array2, bstDataStructure.toArray());
        bstDataStructure.fromArray(new int[]{});
        assertEquals(0, bstDataStructure.size());
        bstDataStructure.fromArray(array2);
        Arrays.sort(array2);
        assertArrayEquals(array2, bstDataStructure.toArray());


        HashTableDataStructure hashTableDataStructure = new HashTableDataStructure();
        array2 = new int[]{6, 3, 5, 4, 2, 11, 1, 8, 0};
        hashTableDataStructure.fromArray(array2);
        int[] array1 = {6, 3, 5, 4, 2, 11, 1, 8, 0};
        assertArrayEquals(array1, hashTableDataStructure.toArray());
        assertEquals(9, hashTableDataStructure.size());
        hashTableDataStructure.add(9);
        assertEquals(9, hashTableDataStructure.get(9));
        hashTableDataStructure.set(9, 1000);
        assertEquals(1000, hashTableDataStructure.get(9));
        ParallelMergeSort parallelMergeSort = new ParallelMergeSort(100);
        int search = parallelMergeSort.search(hashTableDataStructure, 8);
        hashTableDataStructure.fromArray(array1);
        search = parallelMergeSort.search(hashTableDataStructure, 4);
        assertEquals(-1, search);
        search = parallelMergeSort.search(hashTableDataStructure, 3);
        assertEquals(-1, search);


        HeapDataStructure heap = new HeapDataStructure();
        int[] array5 = heap.toArray();
        assertNotNull(array5);
        assertEquals(0, array5.length);
        heap.add(3);
        heap.add(1);
        heap.add(4);
        heap.add(1);
        heap.add(5);
        array5 = heap.toArray();
        assertNotNull(array5);
        assertEquals(5, array5.length);
        assertArrayEquals(new int[]{1, 1, 4, 3, 5}, array5);
        heap.fromArray(new int[]{3, 1, 4, 1, 5});
        assertEquals(5, heap.size());
        array5 = heap.toArray();
        assertNotNull(array5);
        assertEquals(5, array5.length);
        assertArrayEquals(new int[]{1, 1, 4, 3, 5}, array5);
        heap.fromArray(new int[]{});
        assertEquals(0, heap.size());
        heap.add(2);
        assertEquals(1, heap.size());
        array5 = heap.toArray();
        assertNotNull(array5);
        assertEquals(1, array5.length);
        assertArrayEquals(new int[]{2}, array5);


        LinkedListDataStructure linkedStructure = new LinkedListDataStructure();
        array2 = new int[]{6, 3, 5, 4, 2, 11, 1, 8, 0};
        linkedStructure.fromArray(array2);
        assertArrayEquals(array2, linkedStructure.toArray());
        assertEquals(9, linkedStructure.size());
        for (int i = 0; i < array2.length; i++) {
            assertEquals(array2[i], linkedStructure.get(i));
            linkedStructure.set(i, i);
            assertEquals(i, linkedStructure.get(i));
        }
        linkedStructure = new LinkedListDataStructure();
        linkedStructure.fromArray(array2);
        QuickSort quickSort = new QuickSort();
        quickSort.sort(linkedStructure);
        Arrays.sort(array2);
        assertArrayEquals(array2, linkedStructure.toArray());
        assertEquals("Quick Sort", quickSort.getName());
        assertEquals(-1, quickSort.binarySearch(hashTableDataStructure, 10, 9, 1));
        assertEquals(1, quickSort.binarySearch(linkedStructure, 0, 9, 1));
        assertEquals(7, quickSort.binarySearch(linkedStructure, 0, 9, 8));
        AlgorithmPerformance algorithmPerformance = quickSort.evaluatePerformance(linkedStructure);
        algorithmPerformance.report();
        AlgorithmPerformance algorithmPerformance1 = new AlgorithmPerformance(0, 0, 0, 0, 0);
        assertEquals(0, algorithmPerformance1.getTimeTaken());
        assertEquals(0, algorithmPerformance1.getComparisons());
        assertEquals(0, algorithmPerformance1.getSwaps());
        assertEquals(0, algorithmPerformance1.getMemoryUsed());
        assertEquals(0, algorithmPerformance1.getThreadCount());
        OptimizedQuickSort optQuickSort = new OptimizedQuickSort();
        array2 = new int[]{6, 3, 5, 4, 2, 11, 1, 8, 0};
        linkedStructure.fromArray(array2);
        assertEquals(1, optQuickSort.medianOfThree(linkedStructure, 5, 8));
        assertEquals(-1, optQuickSort.search(hashTableDataStructure, 3));
        assertEquals(-1, optQuickSort.search(hashTableDataStructure, 11));
        assertEquals(4, optQuickSort.search(hashTableDataStructure, 2));

        optQuickSort.sort(linkedStructure);
        Arrays.sort(array2);
        assertArrayEquals(array2, linkedStructure.toArray());
        int partition = optQuickSort.partition(linkedStructure, 0, 8);
        assertEquals(4, partition);


        ConcurrentAlgorithmManager concurrentAlgorithmManager = new ConcurrentAlgorithmManager(3);
        concurrentAlgorithmManager.addAlgorithm(algorithm1);
        concurrentAlgorithmManager.addAlgorithm(algorithm2);
        concurrentAlgorithmManager.addAlgorithm(algorithm3);
        Future<Integer> bubbleSort = concurrentAlgorithmManager.parallelSearch("Bubble Sort", hashTableDataStructure, 10);
        Future<AlgorithmPerformance> bubbleSort1 = concurrentAlgorithmManager.parallelSort("Bubble Sort", hashTableDataStructure);


//        MultiThreadedSearch searcher = new MultiThreadedSearch(4);
//        int[] data = {10, 20, 30, 40, 50};
//        int target = 25;
//        int result = searcher.parallelSearch(data, target);
//        data = new int[]{};
//        target = 10;
//        result = searcher.parallelSearch(data, target);
//        assertEquals(-1, result);
//        assertEquals(-1, result);
//        data = new int[]{30};
//        target = 30;
//        result = searcher.parallelSearch(data, target);
//        assertEquals(0, result);
//        data = new int[]{30, 20, 30, 40};
//        target = 30;
//        result = searcher.parallelSearch(data, target);
//        assertEquals(0, result);
//
//        searcher.shutdown();


        int[] arrmax = new int[]{2311, 1130, 3751, 1974, 8932, 4509, 3527, 4169, 2771, 2616, 7303, 2375, 8424, 2911, 4905, 1030, 6482, 4584, 878, 2668, 4420, 5461, 9389, 1823, 9761, 5781, 7075, 3454, 8269, 8321, 1332, 4702, 3849, 546, 5605, 1342, 3563, 5969, 5129, 3227, 702, 8670, 6281, 6208, 1231, 7087, 175, 1561, 4048, 601, 6510, 7774, 3528, 5179, 6757, 3701, 3573, 2404, 6766, 6564, 6007, 9593, 7602, 3038, 2585, 7374, 14, 6767, 9083, 5096, 2302, 1033, 2006, 3745, 3571, 1047, 3290, 677, 4350, 6302, 6041, 377, 4376, 9847, 4833, 736, 3009, 7892, 7386, 4861, 1138, 216, 532, 4327, 4747, 9043, 2312, 945, 9356, 1700, 3762, 620, 1449, 224, 8488, 4691, 7673, 9341, 5497, 1235, 5156, 2728, 892, 1285, 6541, 6324, 7048, 2629, 1536, 6621, 3652, 6915, 2684, 1295, 3604, 4190, 6827, 9333, 8190, 2619, 5328, 7916, 178, 199, 5470, 3672, 495, 9529, 2673, 6674, 4055, 6337, 8167, 6560, 2895, 7425, 9587, 1485, 347, 3881, 2582, 2280, 8170, 1007, 9998, 6151, 9756, 7278, 1420, 6515, 6367, 796, 9967, 8183, 147, 3239, 5101, 9970, 7153, 8088, 9898, 48, 6028, 2028, 8765, 2877, 3079, 5876, 6887, 373, 2546, 4111, 5830, 4157, 1580, 139, 676, 140, 3100, 7821, 2827, 1536, 6093, 8425, 9177, 1421, 2156, 6214, 2744, 1406, 9114, 5141, 2061, 8682, 7400, 3769, 6602, 9711, 2573, 5460, 3384, 5207, 7787, 6105, 5491, 7660, 3356, 2261, 6715, 9665, 6630, 8374, 7793, 8542, 4343, 3015, 8754, 375, 1295, 492, 8815, 4445, 3797, 6036, 9919, 7297, 3631, 9885, 2565, 4159, 8477, 7998, 2862, 4298, 7716, 4893, 7891, 6054, 8302, 7154, 2415, 6715, 4036, 4517, 3713, 2228, 2936, 9144, 2916, 1778, 1687, 2655, 574, 2704, 3139, 4834, 1415, 1912, 2713, 7511, 8238, 976, 2234, 2076, 7722, 3467, 5165, 9316, 1560, 4679, 5544, 5816, 4777, 5908, 4001, 2052, 9349, 7690, 8153, 3466, 5319, 9017, 1421, 7323, 3466, 2434, 3830, 4943, 3335, 8131, 727, 1040, 7866, 3690, 492, 9298, 1262, 9959, 336, 6100, 9819, 7689, 27, 2349, 6407, 4033, 7018, 6702, 8044, 2784, 2856, 2227, 2591, 7301, 9981, 2472, 4961, 494, 66, 2251, 5455, 1934, 9900, 3070, 2814, 8196, 8481, 3050, 2445, 8861, 9483, 6431, 5869, 7271, 6505, 8338, 915, 2087, 4687, 6303, 3430, 2974, 1107, 1268, 353, 1323, 8183, 7263, 888, 4834, 8787, 763, 7191, 2973, 9160, 7855, 8536, 8867, 5878, 9758, 3181, 2017, 6088, 5022, 377, 5382, 6041, 9741, 813, 9821, 1530, 5507, 7644, 8688, 5290, 8539, 1748, 5430, 602, 2358, 4273, 7472, 7422, 737, 6753, 358, 7196, 7243, 4032, 7149, 5176, 2648, 8100, 9442, 4552, 1692, 1564, 7970, 4993, 6270, 7917, 2778, 9290, 2976, 2043, 5172, 5726, 9109, 8460, 6286, 504, 2748, 6681, 9972, 4137, 9312, 2790, 948, 8011, 9133, 3815, 2675, 2553, 8008, 6825, 3241, 6367, 5432, 7797, 1708, 6518, 3281, 6249, 1832, 3745, 1082, 411, 4842, 2794, 2673, 4246, 8042, 7281, 3068, 2050, 1421, 574, 3651, 8545, 146, 8981, 8419, 2372, 6860, 1245, 3944, 8752, 4026, 8804, 979, 2671, 3220, 4557, 6152, 7437, 5236, 4009, 8100, 4678, 2139, 1550, 3562, 958, 9998, 6378, 5426, 3031, 8912, 7100, 6573, 8504, 5186, 1411, 433, 1128, 9007, 7411, 1641, 321, 9827, 6092, 7892, 2601, 810, 335, 7172, 8611, 3154, 4340, 2910, 3130, 881, 8849, 3257, 7069, 6769, 1728, 9723, 9825, 518, 545, 4684, 7545, 928, 3590, 6900, 7907, 4913, 8501, 9126, 4794, 7513, 3101, 2119, 6908, 8691, 1354, 4926, 2810, 4712, 8450, 2190, 1120, 4118, 2957, 5393, 8700, 955, 684, 6474, 1519, 773, 4455, 9016, 2590, 8143, 6351, 4377, 8896, 7970, 4131, 7521, 4530, 6704, 1523, 72, 407, 3712, 2884, 6178, 1877, 7528, 6306, 116, 4285, 6483, 5678, 3274, 3142, 8304, 1446, 2131, 9929, 8649, 1826, 8162, 6756, 4310, 1126, 5209, 3110, 2767, 9447, 9811, 5760, 6191, 8552, 5200, 8497, 4589, 1962, 256, 1864, 9762, 3441, 560, 4256, 9051, 6970, 9877, 4883, 5377, 2999, 6907, 5933, 8038, 356, 3907, 6003, 6905, 500, 968, 9351, 1199, 996, 2097, 5862, 2851, 8070, 7059, 4745, 3630, 3882, 5938, 927, 4654, 2761, 1783, 6873, 6686, 2060, 368, 4136, 9717, 7540, 5095, 8310, 723, 187, 9368, 8285, 9191, 1273, 8405, 5672, 1064, 5094, 7360, 3138, 3058, 4322, 2886, 978, 968, 1193, 835, 9732, 7563, 8846, 3638, 2896, 7897, 1071, 7108, 7860, 2514, 5411, 7892, 5081, 1866, 4144, 9622, 5202, 8509, 11, 7897, 1342, 7172, 8698, 1717, 9087, 6607, 8106, 1670, 9867, 1287, 5187, 3277, 4351, 5510, 4764, 7263, 1217, 7194, 1136, 7162, 3288, 3770, 2532, 8724, 7341, 7979, 490, 4847, 6151, 7070, 1108, 4393, 1309, 4945, 2772, 3186, 3182, 3124, 5446, 725, 19, 3047, 9902, 6699, 1665, 9220, 1373, 7280, 4578, 9937, 1018, 2312, 3953, 9964, 330, 1062, 5603, 7408, 8157, 5955, 4971, 5248, 7337, 862, 3159, 6522, 8157, 2941, 146, 985, 8780, 4763, 3562, 222, 8608, 6522, 7263, 7660, 9128, 6490, 7777, 9695, 8228, 1564, 8211, 4223, 8174, 8751, 8632, 3306, 4503, 2725, 9101, 7365, 2913, 4239, 6581, 9362, 3942, 9072, 9725, 8731, 640, 7465, 6232, 6517, 2805, 9541, 5844, 5084, 2389, 3075, 8385, 8093, 8648, 6160, 268, 8981, 8303, 8826, 4785, 9116, 5545, 4438, 1225, 9989, 9044, 3874, 5332, 7347, 8330, 2848, 8967, 8985, 9831, 5553, 9965, 2106, 3717, 5810, 4114, 569, 6227, 291, 9960, 7171, 8646, 7087, 3705, 1151, 3261, 6839, 5848, 6548, 8711, 3015, 3424, 2720, 1991, 2479, 1697, 4386, 2009, 7476, 6993, 4864, 117, 5365, 7982, 2854, 6286, 3022, 6193, 62, 5732, 8667, 7757, 4236, 9699, 5083, 7503, 9789, 5824, 4681, 3372, 6057, 8080, 8648, 3826, 1484, 3622, 9575, 3455, 522, 4023, 9357, 2274, 8903, 1398, 1924, 2376, 2052, 5665, 3402, 1506, 914, 7817, 701, 6940, 9213, 5508, 3154, 4570, 6258, 1438, 900, 7515, 9823, 2129, 7936, 5758, 4320, 4472, 7438, 3336, 528, 136, 1851, 2411, 4462, 3396, 509, 4202, 4638, 6213, 3084, 5191, 8929, 5526, 8059, 3299, 4502, 1618, 1578, 2765, 6896, 3146, 3528, 8376, 7227, 3973, 4520, 9394, 9679, 9296, 9547, 991, 5018, 3706, 1533, 6402, 9649, 1833, 735, 6063, 3930, 2990, 4000, 998, 7897, 4842, 1273, 6461, 7328, 7542, 5417, 8421, 8183, 9020, 5401, 9837, 2831, 4115, 2219, 5907, 7204, 5131, 1533, 7450, 4044, 9052, 6955, 9425, 3731, 7116, 3117, 7203, 856, 5751, 8262, 6686, 1642, 3990, 1933, 5602, 4600, 1374, 4527, 2377, 4405, 2096, 1982, 5895, 6859};

        LinkedListDataStructure sorttest = new LinkedListDataStructure();
        sorttest.fromArray(arrmax);
        assertEquals(-1, optQuickSort.search(sorttest, arrmax[245]));
        assertEquals(124, optQuickSort.search(sorttest, arrmax[124]));
        assertEquals(-1, optQuickSort.search(sorttest, arrmax[874]));
        assertEquals(-1, optQuickSort.search(sorttest, arrmax[587]));
        QuickSort quickSort1 = new QuickSort();

        assertEquals(-1, quickSort1.search(sorttest, arrmax[245]));
        assertEquals(124, quickSort1.search(sorttest, arrmax[124]));
        assertEquals(-1, quickSort1.search(sorttest, arrmax[74]));
        assertEquals(-1, quickSort1.search(sorttest, arrmax[9]));
        quickSort1.sort(sorttest);
        Arrays.sort(arrmax);
        assertArrayEquals(arrmax, sorttest.toArray());

        try {
            Algorithm algorithm4 = factory.getAlgorithm("zzz");
        } catch (AlgorithmNotFoundException e) {
            ex++;
        }
        try {
            algorithmManager.sortData("zzz", null);
        } catch (AlgorithmNotFoundException e) {
            ex++;
        }
        try {
            algorithmManager.searchData("zzz", null, 0);
        } catch (AlgorithmNotFoundException e) {
            ex++;
        }
        try {
            algorithmManager.searchData("Bubble Sort", null, 0);
        } catch (NullPointerException e) {
            ex++;
        }


        try {
            arrayDataStructure.get(1000);
        } catch (ArrayIndexOutOfBoundsException e) {
            ex++;
        }
        try {
            arrayDataStructure.set(1000, 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            ex++;
        }
        try {
            arrayDataStructure.get(-1);
        } catch (ArrayIndexOutOfBoundsException e) {
            ex++;
        }


        try {
            bstDataStructure.get(-1);
        } catch (UnsupportedOperationException e) {
            ex++;
        }
        try {
            bstDataStructure.set(-1, 2);
        } catch (UnsupportedOperationException e) {
            ex++;
        }


        try {
            heap.set(-1, 2);
        } catch (UnsupportedOperationException e) {
            ex++;
        }
        try {
            heap.get(2);
        } catch (UnsupportedOperationException e) {
            ex++;
        }


        try {
            linkedStructure.get(10);
        } catch (ArrayIndexOutOfBoundsException e) {
            ex++;
        }
        try {
            linkedStructure.set(10, 11);
        } catch (ArrayIndexOutOfBoundsException e) {
            ex++;
        }


        try {
            new ConcurrentAlgorithmManager(222).parallelSort("11", new BSTDataStructure());
        } catch (AlgorithmNotFoundException e) {
            ex++;
        }
        try {
            new ConcurrentAlgorithmManager(222).parallelSearch("11", new BSTDataStructure(), 11);
        } catch (AlgorithmNotFoundException e) {
            ex++;
        }


        assertEquals(16, ex);

    }


}
