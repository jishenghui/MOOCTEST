
package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PairTest {

  @Test(timeout = 4000)
  public void test()  throws Throwable  {
      Pair<Object> pair = new Pair<Object>();
      pair.second = (Object) "mooctest";
      Object object = pair.get(1);
      assertEquals("mooctest", object);
      try {
    	  pair.get(-1);
      }catch (Exception e) {
    	  System.out.println(e.getMessage());
      }
  }
  @Test(timeout = 4000)
  public void test1() throws Throwable {
	  // test basic functions
	  PromotionFunctions.RandomPromotion<List<Double>> promotionF = new PromotionFunctions.RandomPromotion<List<Double>>();
	  PartitionFunctions.BalancedPartition<List<Double>> partitionF = new PartitionFunctions.BalancedPartition<List<Double>>();
	  ComposedSplitFunction<List<Double>> csFunc = new ComposedSplitFunction<List<Double>>(promotionF, partitionF);
	  MTree<List<Double>> mt = new MTree<List<Double>>(DistanceFunctions.EUCLIDEAN_DOUBLE_LIST, csFunc);
	  
	  List<Double> vec1 = Arrays.asList(new Double[] {1.0, 2.0, 3.0});
	  List<Double> vec2 = Arrays.asList(new Double[] {0.0, 0.0, 0.0});
	  mt.add(vec1);
	  
	  assertEquals(vec1, mt.getNearest(vec2).iterator().next().data);
	  mt.add(vec2);
	  
	  List<Double> q = Arrays.asList(new Double[] {1.0, 2.0, 2.0});
	  assertEquals(vec1, mt.getNearest(q).iterator().next().data);
	  assertEquals(vec2, mt.getNearest(vec2).iterator().next().data);
	  
	  mt.remove(vec1);
	  mt.remove(vec2);
	  
	  vec1 = Arrays.asList(new Double[] {1.0, 0.0, 0.0});
	  vec2 = Arrays.asList(new Double[] {2.0, 0.0, 0.0});
	  List<Double> vec3 = Arrays.asList(new Double[] {3.0, 0.0, 0.0});
	  List<Double> vec4 = Arrays.asList(new Double[] {4.0, 0.0, 0.0});
	  List<Double> vec5 = Arrays.asList(new Double[] {5.0, 0.0, 0.0});
	  List<Double> qu = Arrays.asList(new Double[] {3.5, 0.0, 0.0});
	  
	  
	  mt.add(vec1);
	  mt.add(vec2);
	  mt.add(vec3);
	  mt.add(vec4);
	  mt.add(vec5);

	  assertEquals(vec3, mt.getNearest(qu).iterator().next().data);
	  
	  MTree<List<Double>>.Query query = mt.getNearestByLimit(qu, 5);
	  Iterator<MTree<List<Double>>.ResultItem> queryIt = query.iterator();
	  assertEquals(vec3, queryIt.next().data);
	  assertEquals(vec4, queryIt.next().data);
	  assertEquals(vec2, queryIt.next().data);
	  assertEquals(vec5, queryIt.next().data);
	  assertEquals(vec1, queryIt.next().data);
	  
	  query = mt.getNearestByRange(qu, 10);
	  queryIt = query.iterator();
	  
	  assertEquals(vec3, queryIt.next().data);
	  assertEquals(vec4, queryIt.next().data);
	  assertEquals(vec2, queryIt.next().data);
	  assertEquals(vec5, queryIt.next().data);
	  assertEquals(vec1, queryIt.next().data);
	  
	  
	  query = mt.getNearestByRange(qu, 2);
	  queryIt = query.iterator();
	  assertEquals(vec3, queryIt.next().data);
	  assertEquals(vec4, queryIt.next().data);
	  assertEquals(vec2, queryIt.next().data);
	  assertEquals(vec5, queryIt.next().data);
	  assertFalse(queryIt.hasNext());
	  
	  query = mt.getNearest(qu, 2, 3);
	  queryIt = query.iterator();
	  assertEquals(vec3, queryIt.next().data);
	  assertEquals(vec4, queryIt.next().data);
	  assertEquals(vec2, queryIt.next().data);
	  assertFalse(queryIt.hasNext());
	  mt._check();
	  
  }
  
  @Test(timeout = 4000)
  public void test2() throws Throwable {
	  PromotionFunctions.RandomPromotion<List<Integer>> promotionF = new PromotionFunctions.RandomPromotion<List<Integer>>();
	  PartitionFunctions.BalancedPartition<List<Integer>> partitionF = new PartitionFunctions.BalancedPartition<List<Integer>>();
	  ComposedSplitFunction<List<Integer>> csFunc = new ComposedSplitFunction<List<Integer>>(promotionF, partitionF);
	  
	  MTree<List<Integer>> mt = new MTree<List<Integer>>(2,DistanceFunctions.EUCLIDEAN_INTEGER_LIST, csFunc);
	  

	  
	  List<Integer> vec1 = Arrays.asList(new Integer[] {0, 0, 1});
	  List<Integer> vec2 = Arrays.asList(new Integer[] {0, 0, 2});
	  
	  try {
		  mt.remove(vec1);
	  }catch (Exception e){
		  System.out.println(e.getMessage());
	  }

	  
	  mt.add(vec2);
	  mt.remove(vec1);

	  
	  try {
		  MTree<List<Integer>> mt2 = new MTree<List<Integer>>(3,2,DistanceFunctions.EUCLIDEAN_INTEGER_LIST, csFunc);
	  }
	  catch (Exception e) {
		  System.out.println(e.getMessage());
	  }
	  
	  csFunc = null;
	  
	  
	  MTree<List<Integer>> mt2 = new MTree<List<Integer>>(3,DistanceFunctions.EUCLIDEAN_INTEGER_LIST, csFunc);

	  try {
		  mt2 = new MTree<List<Integer>>(1,2,DistanceFunctions.EUCLIDEAN_INTEGER_LIST, csFunc);
	  }
	  catch (Exception e) {
		  System.out.println(e.getMessage());
	  }
	  
	  DistanceFunction<List<Integer>> dsfunc = null;
	  try {
		  mt2 = new MTree<List<Integer>>(3,dsfunc, csFunc);
	  }
	  catch (Exception e) {
		  System.out.println(e.getMessage());
	  }
  }
  
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
	  PromotionFunctions.RandomPromotion<List<Double>> promotionF = new PromotionFunctions.RandomPromotion<List<Double>>();
	  PartitionFunctions.BalancedPartition<List<Double>> partitionF = new PartitionFunctions.BalancedPartition<List<Double>>();
	  ComposedSplitFunction<List<Double>> csFunc = new ComposedSplitFunction<List<Double>>(promotionF, partitionF);
	  MTree<List<Double>> mt = new MTree<List<Double>>(2, 3, DistanceFunctions.EUCLIDEAN_DOUBLE_LIST, csFunc);
	  mt._check();
	  
	  List<Double> collec = Arrays.asList(new Double[] {1.461340, 2.4604622, 3.66871, 4.4641, 5.064861, 6.6881});
	  
	  List<Double> queryVec = Utils.randomSample(collec, 3);
	  
	  collec = new ArrayList<Double>();
	  queryVec = Utils.randomSample(collec, 1);
	  	
	  queryVec = Arrays.asList(new Double[] {1.461340, 2.4604622, 3.66871});
	  
	  
	  
	  List<Double> vec1 = Arrays.asList(new Double[] {1.0, 0.0, 0.0});
	  List<Double> vec2 = Arrays.asList(new Double[] {2.0, 0.0, 0.0});
	  try {
		  assertEquals(vec1, mt.getNearest(queryVec).iterator().next().data);
	  }catch (Exception e) {
		  System.out.println(e.getMessage());
	  }
	  List<Double> vec3 = Arrays.asList(new Double[] {3.0, 0.0, 0.0});
	  List<Double> vec4 = Arrays.asList(new Double[] {4.0, 0.0, 0.0});
	  List<Double> vec5 = Arrays.asList(new Double[] {5.0, 0.0, 0.0});
	  List<Double> vec6 = Arrays.asList(new Double[] {6.0, 0.0, 0.0});
	  List<Double> vec7 = Arrays.asList(new Double[] {7.0, 0.0, 0.0});
	  List<Double> vec8 = Arrays.asList(new Double[] {8.0, 0.0, 0.0});
	  List<Double> vec9 = Arrays.asList(new Double[] {9.0, 0.0, 0.0});
	  List<Double> vec901 = Arrays.asList(new Double[] {9.01, 0.0, 0.0});
	  List<Double> vec902 = Arrays.asList(new Double[] {9.02, 0.0, 0.0});
	  List<Double> vec903 = Arrays.asList(new Double[] {9.03, 0.0, 0.0});
	  List<Double> vec904 = Arrays.asList(new Double[] {9.04, 0.0, 0.0});
	  List<Double> vec905 = Arrays.asList(new Double[] {9.05, 0.0, 0.0});
	  List<Double> vec906 = Arrays.asList(new Double[] {9.06, 0.0, 0.0});
	  
	  mt.add(vec1);
	  mt.add(vec2);
	  mt.add(vec3);
	  mt.add(vec4);
	  mt.add(vec5);
	  mt.add(vec6);
	  mt.add(vec7);
	  mt.add(vec8);
	  mt.add(vec9);
	  mt.add(vec901);
	  mt.add(vec902);
	  mt.add(vec903);
	  mt.add(vec904);
	  mt.add(vec905);
	  mt.add(vec906);

	  mt._check();
	  queryVec = Arrays.asList(new Double[] {1.461340, 2.4604622, 3.66871});
	  assertEquals(vec1, mt.getNearest(queryVec).iterator().next().data);
	  queryVec = Arrays.asList(new Double[] {9.461340, 2.4604622, 9.66871});
	  assertEquals(vec906, mt.getNearest(queryVec).iterator().next().data);
	  queryVec = Arrays.asList(new Double[] {7.461340, 2.4604622, 9.66871});
	  assertEquals(vec7, mt.getNearest(queryVec).iterator().next().data);
	  
	  List<Double> vecS = Arrays.asList(new Double[] {9.07, 10.0});
	  List<Double> vecX = Arrays.asList(new Double[] {9.07, 0.0, 0.0, 10.0});
	  mt.add(vecX);
	  mt.add(vecS);
	  assertEquals(vecS, mt.getNearest(queryVec).iterator().next().data);
	  assertEquals(vecS, mt.getNearest(vecS).iterator().next().data);
	  queryVec = Arrays.asList(new Double[] {7.461340});
	  assertEquals(vecS, mt.getNearest(vecS).iterator().next().data);
	  
	  mt.remove(vecX);
	  mt.remove(vecS);
	  
	  List<Double> vecN = Arrays.asList(new Double[] {-9.07, 0.0, 0.0});
	  mt.add(vecN);
	  
	  queryVec = Arrays.asList(new Double[] {7.461340, 2.4604622, 9.66871, 9.07, 134.0});
	  MTree<List<Double>>.Query query = mt.getNearestByLimit(queryVec, 5);
	  Iterator<MTree<List<Double>>.ResultItem> queryIt = query.iterator();
	  
	  assertEquals(vec7, queryIt.next().data);
	  assertEquals(vec8, queryIt.next().data);
	  assertEquals(vec6, queryIt.next().data);
	  assertEquals(vec9, queryIt.next().data);
	  assertEquals(vec901, queryIt.next().data);
	  try {
		  assertEquals(null, queryIt.next().data);
	  }
	  catch (Exception e) {
		  System.out.println(e.getMessage());
	  }
	  
	  mt.remove(vec1);
	  mt.remove(vec2);
	  mt.remove(vec3);
	  mt.remove(vec4);
	  mt.remove(vec5);
	  mt.remove(vec6);
	  mt.remove(vec7);
	  mt.remove(vec8);
	  mt.remove(vec9);
	  mt.remove(vec901);
	  mt.remove(vec902);
	  mt.remove(vec903);
	  mt.remove(vec904);
	  mt.remove(vec905);
	  mt.remove(vec906);
  }
  
  
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
	  PromotionFunctions.RandomPromotion<List<Double>> promotionF = new PromotionFunctions.RandomPromotion<List<Double>>();
	  PartitionFunctions.BalancedPartition<List<Double>> partitionF = new PartitionFunctions.BalancedPartition<List<Double>>();
	  ComposedSplitFunction<List<Double>> csFunc = new ComposedSplitFunction<List<Double>>(promotionF, partitionF);
	  MTree<List<Double>> mt = new MTree<List<Double>>(2, 3, DistanceFunctions.EUCLIDEAN_DOUBLE_LIST, csFunc);
	  List<Double> vec1 = Arrays.asList(new Double[] {1.0, 0.0, 0.0});
	  List<Double> vec2 = Arrays.asList(new Double[] {2.0, 0.0, 0.0});
	  List<Double> vec3 = Arrays.asList(new Double[] {-3.0, 0.0, 0.0});
	  List<Double> vec4 = Arrays.asList(new Double[] {4.0, 0.0, 0.0});
	  List<Double> vec5 = Arrays.asList(new Double[] {5.0, 0.0, 0.0});
	  List<Double> vec6 = Arrays.asList(new Double[] {-6.0, 0.0, 0.0});
	  List<Double> vec7 = Arrays.asList(new Double[] {7.0, 0.0, 0.0});
	  List<Double> vec8 = Arrays.asList(new Double[] {-8.0, 0.0, 0.0});
	  List<Double> vec9 = Arrays.asList(new Double[] {9.0, 0.0, 0.0});
	  List<Double> vec901 = Arrays.asList(new Double[] {-9.01, 0.0, 0.0});
	  List<Double> vec902 = Arrays.asList(new Double[] {9.02, 0.0, 0.0});
	  List<Double> vec903 = Arrays.asList(new Double[] {-9.03, 0.0, 0.0});
	  List<Double> vec904 = Arrays.asList(new Double[] {9.04, 0.0, 0.0});
	  List<Double> vec09 = Arrays.asList(new Double[] {0.0, 9.0, 0.0});
	  List<Double> vec92 = Arrays.asList(new Double[] {9.0, 0.0});
	  
	  mt.add(vec1);
	  mt.add(vec2);
	  mt.add(vec3);
	  mt.add(vec4);
	  mt.add(vec5);
	  mt.add(vec6);
	  mt.add(vec7);
	  mt.add(vec8);
	  mt.add(vec9);
	  mt.add(vec901);
	  mt.add(vec902);
	  mt.add(vec903);
	  mt.add(vec904);
	  mt.add(vec09);
	  mt.add(vec92);
	  
	  List<Double> queryVec = Arrays.asList(new Double[] {6.461340, 2.4604622, 3.66871, 5.2354, 7.3689});
	  double minV = Utils.minMax(queryVec).first.doubleValue();
	  double maxV = Utils.minMax(queryVec).second.doubleValue();
	  assertEquals(2.4604622, minV, 0.00000001);
	  assertEquals(7.3689, maxV, 0.00000001);
	  
	  queryVec = null;
	  try {
		  minV = Utils.minMax(queryVec).first.doubleValue();
	  }catch (Exception e) {
		  System.out.println(e.getMessage());
	  }
	  
	  try {
		  List<Double> ls = mt.getNearest(queryVec).iterator().next().data;
	  }catch (Exception e) {
		  System.out.println(e.getMessage());
	  }

	  mt.remove(vec1);
	  mt.remove(vec2);
	  mt.remove(vec3);
	  mt.remove(vec4);
	  mt.remove(vec5);
	  mt.remove(vec6);
	  mt.remove(vec7);
	  mt.remove(vec8);
	  mt.remove(vec9);
	  mt.remove(vec901);
	  mt.remove(vec902);
	  mt.remove(vec903);
	  mt.remove(vec904);
	  mt.remove(vec92);
	  mt.remove(vec09);
  }
  
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
	  PromotionFunctions.RandomPromotion<List<Integer>> promotionF = new PromotionFunctions.RandomPromotion<List<Integer>>();
	  PartitionFunctions.BalancedPartition<List<Integer>> partitionF = new PartitionFunctions.BalancedPartition<List<Integer>>();
	  ComposedSplitFunction<List<Integer>> csFunc = new ComposedSplitFunction<List<Integer>>(promotionF, partitionF);
	  
	  MTree<List<Integer>> mt = new MTree<List<Integer>>(2,DistanceFunctions.EUCLIDEAN_INTEGER_LIST, csFunc);
	  List<Integer> queryVec = Arrays.asList(new Integer[] {1, 2, 3});
	  try {
		  List<Integer> tmp = mt.getNearest(queryVec).iterator().next().data;
	  }
	  catch (Exception e) {
		  System.out.println(e.getMessage());
	  }
	  List<Integer> vec1 = Arrays.asList(new Integer[] {1,2,3});
	  List<Integer> vec2 = Arrays.asList(new Integer[] {1,0,3});
	  
	  mt.add(vec1);
	  assertEquals(vec1, mt.getNearest(queryVec).iterator().next().data);
	  
	  mt.add(vec2);
	  assertEquals(vec1, mt.getNearest(queryVec).iterator().next().data);
	  
	  mt.remove(vec1);
	  assertEquals(vec2, mt.getNearest(queryVec).iterator().next().data);
	  
	  mt.add(vec1);
	  
	  vec1 = null;
	  
	  assertEquals(Arrays.asList(new Integer[] {1,2,3}), mt.getNearest(queryVec).iterator().next().data);
	  try {
		  mt.add(vec1);
	  }
	  catch (Exception e) {
		  System.out.println(e.getMessage());
	  }
	  try {
		  queryVec = null;
		  assertEquals(Arrays.asList(new Integer[] {1,2,3}), mt.getNearest(queryVec).iterator().next().data);
	  }
	  catch (Exception e) {
		  System.out.println(e.getMessage());
	  }
	  
	  List<Double> queryVec2 = Arrays.asList(new Double[] {});
	  try {
		  Double minV = Utils.minMax(queryVec2).first;
		  Double maxV = Utils.minMax(queryVec2).second;
		  Double res = null;
		  assertEquals(res, minV);
		  assertEquals(res, maxV);
	  }
	  catch (Exception e) {
		  System.out.println(e.getMessage());  
	  }
  }
}
