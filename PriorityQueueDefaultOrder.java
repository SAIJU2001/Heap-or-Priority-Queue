import java.util.Scanner;
import java.util.PriorityQueue;

public class PriorityQueueDefaultOrder
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        System.out.print("Enter how many values you can add : ");
        int n=Sc.nextInt();
        while(n!=0)
        {
            //add the values to the priority queue
            System.out.print("Enter the value : ");
            pq.add(Sc.nextInt());
            n--;
        }
        //peek and remove from the priority queue
        while(!pq.isEmpty() )
        {
            System.out.print( pq.peek()+" ");
            pq.remove();
        }
    }
}
