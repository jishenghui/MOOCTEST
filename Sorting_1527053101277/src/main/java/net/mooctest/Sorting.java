package net.mooctest;
import java.util.Comparator;
import java.util.Random;

/**
 * A class that contains several sorting routines,
 * implemented as static methods.
 * Arrays are rearranged with smallest item first,
 * using compareTo.
 * @author Mark Allen Weiss
 */
public final class Sorting
{
    /**
     * Simple insertion sort.
     * @param a an array of Comparable items.
     */
    public void insertionSort( int[ ] a )
    {
        int j;

        for( int p = 1; p < a.length; p++ )
        {
             int tmp = a[ p ];
            for( j = p; j > 0 && tmp<a[ j - 1 ]; j-- )
                 a[ j ] = a[ j - 1 ];
            a[ j ] = tmp;
        }
    }

    public  boolean isSorted(int[] a) {
        for(int i=0; i<a.length-1; i++) {
            if(a[i]>a[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void quicksort( int[ ] a )
    {
        quicksort( a, 0, a.length - 1 );
    }

    private static final int CUTOFF = 10;

    public static final void swapReferences( Object [ ] a, int index1, int index2 )
    {
        Object tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }
    public static final void swap(int[] a,int index1,int index2) {
        int tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }

    private static int median3( int[ ] a, int left, int right )
    {
        int center = ( left + right ) / 2;
        if( a[ center ]<a[ left ] )
            swap( a, left, center );
        if( a[ right ] < a[ left ] )
            swap( a, left, right );
        if( a[ right ] < a[ center ] )
            swap( a, center, right );

        // Place pivot at position right - 1
        swap( a, center, right - 1 );
        return a[ right - 1 ];
    }

    private static void quicksort( int[ ] a, int left, int right)
    {
        if( left + CUTOFF <= right )
        {
            int pivot = median3( a, left, right );

            int i = left, j = right - 1;
            for( ; ; )
            {
                while( a[ ++i ] < pivot )  { }
                while( a[ --j ] > pivot ) { }
                if( i < j )
                     swap( a, i, j );
                else
                    break;
            }

            swap( a, i, right - 1 );   // Restore pivot

            quicksort( a, left, i - 1 );    // Sort small elements
            quicksort( a, i + 1, right );   // Sort large elements
        }
        else  // Do an insertion sort on the subarray
            insertionSort( a, left, right );
    }

    private static void insertionSort( int[ ] a, int left, int right )
    {
        for( int p = left + 1; p <= right; p++ )
        {
            int tmp = a[ p ];
            int j;

            for( j = p; j > left && tmp < a[ j - 1 ]; j-- )
                a[ j ] = a[ j - 1 ];
            a[ j ] = tmp;
        }
    }

    private static final int NUM_ITEMS = 1000;
    private static int theSeed = 1;

}
