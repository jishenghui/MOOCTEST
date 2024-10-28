/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * An object that can calculate the distance between two data objects.
 *
 * @param <DATA> The type of the data objects.
 */
public interface DistanceFunction<DATA> {
	
	double calculate(DATA data1, DATA data2);
	
}
