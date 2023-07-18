// input ==> ropes[]={4,3,2,6}
//output ==> 29
/*
 * connect 2 & 3 =5
 * connect 4 & 5 =9
 * connect 6 & 9 =15
 * now add the costs
 */

 import java.util.*;

 public class ConnectNRopes
 {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        //enter the length of the ropes array
        int n=Sc.nextInt();
        int ropes[]=new int[n];
        for( int i=0 ; i<n ; i++ )
        {
            ropes[i]=Sc.nextInt();
            pq.add(ropes[i]);
        }
        int cost=0;
        while( pq.size()>1 )
        {
            int min1=pq.remove();
            int min2=pq.remove();
            cost+=min1+min2;
            pq.add(min1+min2);
        }
        System.out.print(cost);
    }
 }