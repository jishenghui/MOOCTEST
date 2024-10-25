package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
//mvn clean test-compile org.pitest:pitest-maven:mutationCoverage
/**
 * @Author: ¼ÍÊ¥»Ô
 * @Description: TODO
 * @DateTime: 2024/10/23 ÏÂÎç7:38
 **/
public class BPlusTreeTest {

    BPlusTree tree;

    @Before
    public void setUp() throws Exception {
        tree=new BPlusTree<Integer,String>(100);
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testBPlusTree(){
        
    }


}