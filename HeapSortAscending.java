//heap sort ascending order
//max heap ==> Ascending order

import java.util.*;

public class HeapSortAscending 
{
    //heap sort
    public static void heapSort( int arr[] )
    {
        int n=arr.length;

        //build the max heap
        for( int i=n/2 ; i>=0 ; i-- )
        {
            //call heapify to fix the heap
            heapify( arr, i, n );
        }

        //push largest at end
        for( int i=n-1 ; i>0 ; i-- )
        {
            swap( arr, i, 0);
            heapify( arr, 0 , i );
        }
        
    }
    //to fix the heap
    public static void heapify(  int arr[], int i, int size )
    {
        int left=2*i+1;
        int right=2*i+2;
        int maxIndex=i;
        
        if( left<size && arr[left]>arr[maxIndex] )
            maxIndex=left;

        if( right<size && arr[right]>arr[maxIndex] )
            maxIndex=right;

        if( maxIndex!=i )
        {
            //swap
            swap( arr, i, maxIndex );
            heapify( arr, maxIndex, size );
        }
    }
    //swapping two values
    public static void swap( int arr[], int a, int b )
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int arr[]=new int[n];
        for( int i=0 ; i<n ; i++ )
        {
            arr[i]=Sc.nextInt();
        }
        heapSort(arr);
        for( int i=0 ; i<n ; i++ )
        {
            System.out.print(arr[i]+" ");
        }
    }
}
