package net.mooctest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Some pre-defined implementations of {@linkplain PartitionFunction partition
 * functions}.
 */
public final class PartitionFunctions {

    /**
     * Don't let anyone instantiate this class.
     */
	private PartitionFunctions() {}
	
	
	/**
	 * A {@linkplain PartitionFunction partition function} that tries to
	 * distribute the data objects equally between the promoted data objects,
	 * associating to each promoted data objects the nearest data objects.
	 * 
	 * @param <DATA> The type of the data objects.
	 */
	public static class BalancedPartition<DATA> implements PartitionFunction<DATA> {
		
		/**
		 * 处理平衡分区。
		 *
		 * <p>算法大致相当于：
		 * <pre>
		 * 当 dataSet 不为空时：
		 * X ：= dataSet 中最接近 promoted 的对象。<b>第一</b>
		 * 从 dataSet 中删除 X
		 * 将 X 添加到结果中。<b>第一</b>
		 *
		 * Y ：= dataSet 中最接近 promoted 的对象。<b>第二</b>
		 * 从 dataSet 中删除 Y
		 * 将 Y 添加到结果中。<b>第二</b>
		 *
		 * 返回结果
		 * </pre>
		 *
		 *
		 */
		@Override
		public Pair<Set<DATA>> process(
				final Pair<DATA> promoted,
				Set<DATA> dataSet,
				final DistanceFunction<? super DATA> distanceFunction
			)
		{
			List<DATA> queue1 = new ArrayList<DATA>(dataSet);
			// Sort by distance to the first promoted data
			Collections.sort(queue1, new Comparator<DATA>() {
				@Override
				public int compare(DATA data1, DATA data2) {
					double distance1 = distanceFunction.calculate(data1, promoted.first);
					double distance2 = distanceFunction.calculate(data2, promoted.first);
					return Double.compare(distance1, distance2);
				}
			});
			
			List<DATA> queue2 = new ArrayList<DATA>(dataSet);
			// Sort by distance to the second promoted data
			Collections.sort(queue2, new Comparator<DATA>() {
				@Override
				public int compare(DATA data1, DATA data2) {
					double distance1 = distanceFunction.calculate(data1, promoted.second);
					double distance2 = distanceFunction.calculate(data2, promoted.second);
					return Double.compare(distance1, distance2);
				}
			});
			
			Pair<Set<DATA>> partitions = new Pair<Set<DATA>>(new HashSet<DATA>(), new HashSet<DATA>());
			
			int index1 = 0;
			int index2 = 0;
	
			while(index1 < queue1.size()  ||  index2 != queue2.size()) {
				while(index1 < queue1.size()) {
					DATA data = queue1.get(index1++);
					if(!partitions.second.contains(data)) {
						partitions.first.add(data);
						break;
					}
				}
	
				while(index2 < queue2.size()) {
					DATA data = queue2.get(index2++);
					if(!partitions.first.contains(data)) {
						partitions.second.add(data);
						break;
					}
				}
			}
			
			return partitions;
		}
	}
}
