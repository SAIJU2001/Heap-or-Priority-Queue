//heap

/*  Minimize the sum
EasyAccuracy: 56.29%Submissions: 21K+Points: 2
Register for Mega Job-A-Thon For Experienced Professionals on 21st July | Apply to 15+ Companies

You are given N elements, you can remove any two elements from the list, note their sum, and add the sum to the list. Repeat these steps while there is more than a single element in the list. The task is to minimize the sum of these chosen sums.

Example 1:

Input:
N = 4
arr[] = {1, 4, 7, 10}

Output:
39

Explanation:
Choose 1 and 4, Sum = 1 + 4 = 5.
arr[] = {5, 7, 10} 
Choose 5 and 7, Sum = 5 + (5 + 7) = 17.
arr[] = {12, 10} 
Choose 12 and 10, Sum = 17 + (12 + 10) = 39.
arr[] = {22}
 

Example 2:

Input:
N = 5
arr[] = {1, 3, 7, 5, 6}

Output:
48
 

Your Task:

You don't need to read input or print anything. The task is to complete the function minimizeSum() which takes N as size of arr array and a arr array. Your task is to minimize the sum of these chosen sums and return it.

 
Expected Time Complexity: O(N * log(N))
Expected Auxiliary Space: O(N)

 Constraints:

1 <= N, arr[i] <= 105
*/


//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution 
{
    long minimizeSum(int N, int arr[]) 
    {
        // code here
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for( int i=0 ; i<N ; i++ )
        {
            //all elements of the array added to the heap
            pq.add(arr[i]);
        }
        //now heap is in sorted order
        long cost=0;
        while( pq.size()>1 )
        {
            //every time two values are removed from heap and add the value
            int min=pq.remove();
            int min2=pq.remove();
            cost+=min+min2;         //here calculate the cost which is minimum
            //the add values are added to the heap
            pq.add(min+min2);
        }
        return cost;
    }
}

//{ Driver Code Starts.

public class MinimizeTheSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends