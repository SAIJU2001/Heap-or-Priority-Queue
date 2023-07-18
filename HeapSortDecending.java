//heap sort Decending order
//min heap ==> Decending order

import java.util.*;

public class HeapSortDecending 
{
    //heap sort
    public static void heapSort( int arr[] )
    {
        int n=arr.length;

        //build the min heap
        for( int i=n/2 ; i>=0 ; i-- )
        {
            //call heapify to fix the heap
            heapify( arr, i, n );
        }

        //push smallest at end
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
        int minIndex=i;
        
        if( left<size && arr[left]<arr[minIndex] )
            minIndex=left;

        if( right<size && arr[right]<arr[minIndex] )
            minIndex=right;

        if( minIndex!=i )
        {
            //swap
            swap( arr, i, minIndex );
            heapify( arr, minIndex, size );
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
