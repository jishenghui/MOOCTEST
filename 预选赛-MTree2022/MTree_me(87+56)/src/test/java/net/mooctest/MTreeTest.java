package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class MTreeTest {

    Pair pair;
    MTree tree;

    @Before
    public void setUp() throws Exception {
        pair = new Pair<Integer>(1, 2);
        tree = new MTree<>(new DistanceFunction<String>() {
            @Override
            public double calculate(String s1, String s2) {
                return 1.0 - (double) levenshtein(s1, s2) / Math.max(s1.length(), s2.length());
            }
        },null);
    }

    // Levenshtein 距离计算方法
    private int levenshtein(String s1, String s2) {
        int[][] distance = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            distance[i][0] = i;
        }

        for (int j = 0; j <= s2.length(); j++) {
            distance[0][j] = j;
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                distance[i][j] = Math.min(
                        Math.min(distance[i - 1][j] + 1, distance[i][j - 1] + 1),
                        distance[i - 1][j - 1] + cost);
            }
        }

        return distance[s1.length()][s2.length()];
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testPair() {
        try {
            pair.get(3);
        } catch (IllegalArgumentException e) {
            System.out.println("越界");
        }
        assertEquals(1, pair.get(0));
        assertEquals(2, pair.get(1));
    }

    @Test(timeout = 1000)
    public void testUtils() {
        ArrayDeque integers = new ArrayDeque();
        integers.add(6);
        integers.add(2);
        integers.add(5);
        integers.add(4);
        integers.add(1);
        integers.add(3);
        integers.add(7);
        Pair testpair = Utils.minMax(integers);
        assertEquals(1, testpair.get(0));
        assertEquals(7, testpair.get(1));
        assertNull(Utils.minMax(new ArrayDeque()));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(7);
        List<Integer> test = Utils.randomSample(list, 7);
        assertEquals(7, test.size());
        List<Integer> test1 = Utils.randomSample(list, 3);
        assertEquals(3, test1.size());
        for (int i = 1; i <= 7; i++) {
            assertTrue(test.contains(i));
        }
        assertEquals(0, Utils.randomSample(new ArrayList<>(), 2).size());
        assertEquals(0, Utils.randomSample(list, 0).size());
    }

    @Test
    public void testFunctions() {
        PartitionFunctions.BalancedPartition test = new PartitionFunctions.BalancedPartition();
        HashSet<Integer> dataSet = new HashSet<>();
        dataSet.add(1);
        dataSet.add(2);
        dataSet.add(3);
        dataSet.add(5);
        dataSet.add(4);

        Pair testpair = test.process(pair, dataSet, new DistanceFunction() {
            @Override
            public double calculate(Object data1, Object data2) {
                return 0;
            }
        });
        assertEquals("[1, 3, 5]", testpair.first.toString());
        assertEquals("[2, 4]", testpair.second.toString());


        PromotionFunctions.RandomPromotion promotion = new PromotionFunctions.RandomPromotion();
        testpair = promotion.process(dataSet, new DistanceFunction() {
            @Override
            public double calculate(Object data1, Object data2) {
                return 0;
            }
        });
        assertTrue((1 <= (int) testpair.first) && ((int) testpair.first <= 5));
        assertTrue((1 <= (int) testpair.second) && ((int) testpair.second <= 5));
        assertTrue(testpair.first != testpair.second);

    }

    @Test
    public void testComposedSplitFunction() {
        HashSet<Integer> dataSet = new HashSet<>();
        dataSet.add(1);
        dataSet.add(2);
        dataSet.add(3);
        dataSet.add(5);
        dataSet.add(4);
        ComposedSplitFunction function = new ComposedSplitFunction<>(new PromotionFunctions.RandomPromotion<>(), new PartitionFunctions.BalancedPartition<>());
        SplitFunction.SplitResult<Integer> o = function.process(dataSet, new DistanceFunction() {
            @Override
            public double calculate(Object data1, Object data2) {
                return 0;
            }
        });
        assertTrue((1 <= (int) o.promoted.first) && ((int) o.promoted.first <= 5));
        assertTrue((1 <= (int) o.promoted.second) && ((int) o.promoted.second <= 5));
        assertFalse(o.promoted.first.equals(o.promoted.second));
        assertEquals("[1, 3, 5]", o.partitions.first.toString());
        assertEquals("[2, 4]", o.partitions.second.toString());

    }


    @Test
    public void testAdd() {
//        char[][]use=new char[99][9];
//        Random r=new Random();
//        for (int i = 0; i < 99; i++) {
//            for (int j = 0; j < 9; j++) {
//                use[i][j]=(char)( r.nextInt(26)+(int)'a');
//            }
//            System.out.print("\""+String.copyValueOf(use[i])+"\""+",");
//        }

        String[]s1={"floxxvjc","nuvedgcu","ytrwknwp","tnioicye","jjmzmspb","hxmlonxq","gngtfmtg","lgcbznpt","mizjcfad","wrwaajbo","mmuioyrk","reccneob","cxpyfpvw","apkcrfbu","fprtvxtf","ffbjlmsj","joubrdpx","sqgwlbni","ysziywmy","xthixyuv","tbtmgwme","uocqdoim","ynvypowf","xzsmgxqy","lmayascm","tanghmwx","cvufmtlg","odjjyiis","lhxidsyh","vpzesrew","vnekiwwc","zrrfbale","hrooxpfp","btoeepnm","idvxbbio","jnujsfaz","swdonadm","agblmalt","jkkqmsxj","ulazbmto","dawaeyaz","zyddirui","bgwwhkkc","htqpvmxw","bracwtlt","vpeyfmfe","ogntoqap","seuqvvbt","jfvhcopx","lqexiybx","zavvmyzb","qiactplp","wvnsguwv","choinieu","srdqtwtr","hkprmvfd","rzbtosvj","teoqerty","qqzxywxr","upeqpvas","lzrzpxxg","vxnztimw","gjneslwl","wobxmubd","fdltvhok","eiovqnee","deypdysg","kfasldwp","jbpcjnop","aaugrnco","ykermtcu","ivarfwlc","yozungsh","kxgssvwc","wdousant","uszrnofl","uolrzvbl","wljwhuyf","culejyzv","jojlrgjz","itsntpbs","nuimqpzz","nfpgjpqy","ujmqbzmm","wnknnunt","gwqliaoy","iysywbzg","lsiilkkb","nwdodzkm","bwwlsylb","klascgfh","irkcyaxx","ggvxxjuo","pesowmfv","kvehwzkt","onjjmwiq","efluhbvs","gkxnpffb","xzxfnize"};
        String[]s2={"bnairuugz","spifbirer","fhtzyrfgm","akjhnmipk","iifefesjq","ovorubnjh","ibofflxlb","npuaqgtbu","kyvromhvo","xtdwsxopk","vsmeibcnm","topwruuna","ijxtwhqhb","trorawhkq","mmzfeqvqi","nkrcvngjl","orsrqsdbq","jvphlxwwp","joapurmwv","bhpnkgouu","gkddveguy","hxfbrdlka","bvzbzeuyz","jgfrbdszj","fstqcmaoc","aanwdyvpm","cnpkqdmmc","gnpuswcct","ihkejxank","juentqncr","tvsmsizwp","anldkbypx","acnprlqkl","fwdtqefom","mvqbgjjfq","yczfulmdj","jjgtzplzr","qbpcdhoxv","lfmpcwemr","uiovxvaxh","rlrkiolrz","aqalatssg","oisfbejnb","anezpxfrp","bjddczfrx","amjjdwdpo","zwxisdisw","jfuwidlzq","nbmqceevh","nwwwmkoxu","dvkgbjfkk","ufflynpdy","sganlejvm","hdgxscqjj","swsshunhh","xzmrmplzj","evwxlhorm","qfpsivyeh","ymzbccjhl","xiuvpeiol","gmvvsblnn","tzjormzeb","zngosfvbm","hkvfwbajc","ledacslwo","xbsdusnwy","kcdwxergp","ezmcxuymh","oyhbwcgfn","apwlxxdwy","etlpjrmmq","stokdsejg","dftpzgrif","phbvrnjdv","kltqarfwr","oikymhbhv","ohqausgve","jwozuikyo","jmalmfzlt","dbzloxowi","oasyuwhyt","zgrzadgws","mvvrarwzx","ukqdadiei","ieknrbixx","cyulsvwvl","piqcvojtb","mbmgixrxu","veagehpvj","olxarlxtf","onnsmcghr","zedqvthid","uxohgwwjl","eknlnvtmz","wbwgonezj","uziomkmyh","xdgfgduba","zgldmtetd","jusdswzry"};
        assertEquals(s1.length,s2.length);
        for (int i = 0; i < s1.length; i++) {
            tree.add(s1[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            tree.add(s2[i]);
        }
        assertEquals(50,tree.minNodeCapacity);
        assertEquals(99,tree.maxNodeCapacity);

        LinkedList<String>notout=new LinkedList<>();
        for (int i = 0; i < s1.length; i++) {
            if(!tree.remove(s1[i])){
                notout.add(s1[i]);
                assertFalse(tree.remove(s1[i]));
            }
            if(!tree.remove(s2[s2.length-1-i])){
                notout.add(s2[s2.length-1-i]);
                assertFalse(tree.remove(s2[s2.length-1-i]));
            }
        }
        int num=notout.size();
        for(String s:notout){
            assertTrue(tree.remove(s));
            num--;

        }
        assertEquals(0,num);
        assertFalse(tree.remove("a"));
        assertNull(tree.root);
        tree._check();
    }

    @Test
    public void test(){
        String[]s1={"floxxvjc","nuvedgcu","ytrwknwp","tnioicye","jjmzmspb","hxmlonxq","gngtfmtg","lgcbznpt","mizjcfad","wrwaajbo","mmuioyrk","reccneob","cxpyfpvw","apkcrfbu","fprtvxtf","ffbjlmsj","joubrdpx","sqgwlbni","ysziywmy","xthixyuv","tbtmgwme","uocqdoim","ynvypowf","xzsmgxqy","lmayascm","tanghmwx","cvufmtlg","odjjyiis","lhxidsyh","vpzesrew","vnekiwwc","zrrfbale","hrooxpfp","btoeepnm","idvxbbio","jnujsfaz","swdonadm","agblmalt","jkkqmsxj","ulazbmto","dawaeyaz","zyddirui","bgwwhkkc","htqpvmxw","bracwtlt","vpeyfmfe","ogntoqap","seuqvvbt","jfvhcopx","lqexiybx","zavvmyzb","qiactplp","wvnsguwv","choinieu","srdqtwtr","hkprmvfd","rzbtosvj","teoqerty","qqzxywxr","upeqpvas","lzrzpxxg","vxnztimw","gjneslwl","wobxmubd","fdltvhok","eiovqnee","deypdysg","kfasldwp","jbpcjnop","aaugrnco","ykermtcu","ivarfwlc","yozungsh","kxgssvwc","wdousant","uszrnofl","uolrzvbl","wljwhuyf","culejyzv","jojlrgjz","itsntpbs","nuimqpzz","nfpgjpqy","ujmqbzmm","wnknnunt","gwqliaoy","iysywbzg","lsiilkkb","nwdodzkm","bwwlsylb","klascgfh","irkcyaxx","ggvxxjuo","pesowmfv","kvehwzkt","onjjmwiq","efluhbvs","gkxnpffb","xzxfnize"};
        String[]s2={"bnairuugz","spifbirer","fhtzyrfgm","akjhnmipk","iifefesjq","ovorubnjh","ibofflxlb","npuaqgtbu","kyvromhvo","xtdwsxopk","vsmeibcnm","topwruuna","ijxtwhqhb","trorawhkq","mmzfeqvqi","nkrcvngjl","orsrqsdbq","jvphlxwwp","joapurmwv","bhpnkgouu","gkddveguy","hxfbrdlka","bvzbzeuyz","jgfrbdszj","fstqcmaoc","aanwdyvpm","cnpkqdmmc","gnpuswcct","ihkejxank","juentqncr","tvsmsizwp","anldkbypx","acnprlqkl","fwdtqefom","mvqbgjjfq","yczfulmdj","jjgtzplzr","qbpcdhoxv","lfmpcwemr","uiovxvaxh","rlrkiolrz","aqalatssg","oisfbejnb","anezpxfrp","bjddczfrx","amjjdwdpo","zwxisdisw","jfuwidlzq","nbmqceevh","nwwwmkoxu","dvkgbjfkk","ufflynpdy","sganlejvm","hdgxscqjj","swsshunhh","xzmrmplzj","evwxlhorm","qfpsivyeh","ymzbccjhl","xiuvpeiol","gmvvsblnn","tzjormzeb","zngosfvbm","hkvfwbajc","ledacslwo","xbsdusnwy","kcdwxergp","ezmcxuymh","oyhbwcgfn","apwlxxdwy","etlpjrmmq","stokdsejg","dftpzgrif","phbvrnjdv","kltqarfwr","oikymhbhv","ohqausgve","jwozuikyo","jmalmfzlt","dbzloxowi","oasyuwhyt","zgrzadgws","mvvrarwzx","ukqdadiei","ieknrbixx","cyulsvwvl","piqcvojtb","mbmgixrxu","veagehpvj","olxarlxtf","onnsmcghr","zedqvthid","uxohgwwjl","eknlnvtmz","wbwgonezj","uziomkmyh","xdgfgduba","zgldmtetd","jusdswzry"};
        assertEquals(s1.length,s2.length);
        for (int i = 0; i < s1.length; i++) {
            tree.add(s1[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            tree.add(s2[i]);
        }
        MTree.Query query=tree.getNearestByRange(s1[1],3.5);
        MTree.Query query1=tree.getNearestByRange(s1[1],3);
        MTree.Query query2=tree.getNearest(s1[1]);
        Iterator iterator=query1.iterator();
        iterator.next();
        System.out.println();
        tree._check();
    }

}