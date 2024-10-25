package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import static org.junit.Assert.assertEquals;

public class TreeTest {

    private Tree tree;

    @Before
    public void setUp() throws Exception {
        tree = new Tree();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestTree() throws Exception {
        try {
            tree.searchWord("a");
        } catch (Exception e) {
//            System.out.println("tree.root==null");
        }
        int[] num = new int[]{-1901078195, 1955646685, -179295573, -1020878520, 330564508, 2078495978, -739664000, -573113357, 10297657, -181343946, 1833109475, -945877628, -1670541901, 1146190243, 809567499, -578123780, -2081617855, -1337160138, 465218225, 1565779025, 1554341383, -2003378678, -1337852686, 1057805442, 1518924952, -685907578, 73132154, 320029419, 404289723, -885140526, 1132271839, -1736019238, 1106851186, 1251071878, 1167282506, -1751837087, -1455696073, -950717788, 255404892, -1489605267, -1013997688, 1275581896, 1412194382, -1536310761, -1977660250, -1200119139, 1417478234, 324589113, 530135448, 1215505811, 325991513, -1925245372, 130185846, 1870771918, 1265083821, -69163695, -412550941, -632801695, 517998688, 1050777205, 1589400794, 1828771771, 957957005, 320792408, 1112378798, -2116046751, 1561773054, -1384116216, 745649995, -1851458083, -1414626026, 1588673546, -1983627327, 523851509, -1121010703, 1423933618, 340363523, -197182432, -166686519, -565074764, 1635441387, -347555019, -757953893, 1699564794, 881914240, 337058405, -1147432695, 1986110135, -1343050885, -1976189333, -554588031, -1234319685, 184655112, -308232191, -1713517409, 2085266953, -455701815, -751115115, -1249342256, 1617232806,};
        for (int i = 0; i < 20; i++) {
            String s = Integer.toString(num[i]);
            tree.insertWord(s);
        }
        assertEquals(20, tree.getSize());
        assertEquals(5, tree.getHeight());
        assertEquals(false, tree.searchWord("a"));
        assertEquals(true, tree.searchWord(Integer.toString(num[5])));
        assertEquals(true, tree.deleteWord(Integer.toString(num[5])));
        assertEquals(false, tree.deleteWord(Integer.toString(num[5])));
        assertEquals(false, tree.searchWord(Integer.toString(num[5])));
        assertEquals(19, tree.getSize());
        assertEquals("               -739664000                               \n" +
                "              / \\               \n" +
                "             /   \\              \n" +
                "            /     \\             \n" +
                "           /       \\            \n" +
                "          /         \\           \n" +
                "         /           \\          \n" +
                "        /             \\         \n" +
                "       /               \\        \n" +
                "       -179295573               1955646685               \n" +
                "      / \\             / \\       \n" +
                "     /   \\           /   \\      \n" +
                "    /     \\         /     \\     \n" +
                "   /       \\       /       \\    \n" +
                "   -1337160138       -1901078195       10297657       465218225       \n" +
                "  / \\     / \\     / \\     / \\   \n" +
                " /   \\   /   \\   /   \\   /   \\  \n" +
                " -1020878520   -1670541901   -181343946   -573113357   -945877628   1565779025   330564508   809567499   \n" +
                "            / \\     / \\         \n" +
                "            -2081617855 -578123780     1146190243 1833109475         \n" +
                "                                                                \n", tree.toString());

        for (int i = 0; i < 5; i++) {
            assertEquals(true, tree.deleteWord(Integer.toString(num[i])));
        }
        for (int i = 6; i < 20; i++) {
            assertEquals(true, tree.deleteWord(Integer.toString(num[i])));
        }
        assertEquals(0, tree.getSize());
    }

    @Test
    public void testDeleteWord() throws Exception {
        tree.insertWord("1");
        tree.insertWord("2");
        tree.insertWord("-1");
        assertEquals(" 1   \n" +
                "/ \\ \n" +
                "-1 2 \n" +
                "        \n", tree.toString());
        assertEquals(3, tree.getSize());

        assertEquals(true, tree.deleteWord("1"));
        assertEquals(" 2   \n" +
                "/   \n" +
                "-1   \n" +
                "        \n", tree.toString());
        assertEquals(2, tree.getSize());

        assertEquals(true, tree.deleteWord("2"));
        assertEquals("-1 \n" +
                "    \n", tree.toString());
        assertEquals(1, tree.getSize());

        assertEquals(true, tree.deleteWord("-1"));
        assertEquals("", tree.toString());
        assertEquals(0, tree.getSize());

        try {
            tree.deleteWord("1");
        } catch (Exception e) {
        }
    }

    @Test
    public void testFindWord() {
        int[] num = new int[]{-1901078195, 1955646685, -179295573, -1020878520, 330564508, 2078495978, -739664000, -573113357, 10297657, -181343946, 1833109475, -945877628, -1670541901, 1146190243, 809567499, -578123780, -2081617855, -1337160138, 465218225, 1565779025, 1554341383, -2003378678, -1337852686, 1057805442, 1518924952, -685907578, 73132154, 320029419, 404289723, -885140526, 1132271839, -1736019238, 1106851186, 1251071878, 1167282506, -1751837087, -1455696073, -950717788, 255404892, -1489605267, -1013997688, 1275581896, 1412194382, -1536310761, -1977660250, -1200119139, 1417478234, 324589113, 530135448, 1215505811, 325991513, -1925245372, 130185846, 1870771918, 1265083821, -69163695, -412550941, -632801695, 517998688, 1050777205, 1589400794, 1828771771, 957957005, 320792408, 1112378798, -2116046751, 1561773054, -1384116216, 745649995, -1851458083, -1414626026, 1588673546, -1983627327, 523851509, -1121010703, 1423933618, 340363523, -197182432, -166686519, -565074764, 1635441387, -347555019, -757953893, 1699564794, 881914240, 337058405, -1147432695, 1986110135, -1343050885, -1976189333, -554588031, -1234319685, 184655112, -308232191, -1713517409, 2085266953, -455701815, -751115115, -1249342256, 1617232806,};
        for (int i = 0; i < 20; i++) {
            String s = Integer.toString(num[i]);
            tree.insertWord(s);
        }
        String out = "1955646685";
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            //定义append=true后不删文件每次运行会叠加写入同样的东西,多次write会连续写入
            //否则每个write都会从头开始覆盖写入
            fileWriter = new FileWriter("use.txt", true);
            fileReader = new FileReader("use.txt");
            fileWriter.write(out);//纪圣辉
            fileWriter.write('\n');
            fileWriter.write("-179295573");
            fileWriter.write('\n');
            fileWriter.write("tt");
            fileWriter.close();
            int read = 0;
            char[] c = new char[1024];
            while ((read = fileReader.read(c)) != -1) {
                System.out.print(new String(c, 0, read));
            }


            fileReader.close();
            File file = new File("use.txt");
            boolean[] vis = tree.searchWords(file);
            assertEquals(true, vis[0]);
            assertEquals(true, vis[1]);
            assertEquals(false, vis[2]);
            vis = tree.deleteWords(file);
            assertEquals(true, vis[0]);
            assertEquals(true, vis[1]);
            assertEquals(false, vis[2]);
            vis = tree.searchWords(file);
            assertEquals(false, vis[0]);
            assertEquals(false, vis[1]);
            assertEquals(false, vis[2]);
            vis = tree.insertWords(file);
            assertEquals(true, vis[0]);
            assertEquals(true, vis[1]);
            assertEquals(true, vis[2]);
            vis = tree.searchWords(file);
            assertEquals(true, vis[0]);
            assertEquals(true, vis[1]);
            assertEquals(true, vis[2]);
            file.delete();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}