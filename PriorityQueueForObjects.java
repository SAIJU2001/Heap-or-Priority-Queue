import java.util.Scanner;
import java.util.PriorityQueue;

//object class
class Student implements Comparable<Student>
{
    String name;
    int rank;
    Student( String name, int rank )
    {
        this.name=name;
        this.rank=rank;
    }

    @Override
    public int compareTo( Student s2)
    {
        return this.rank-s2.rank;
    }
}

//main class
public class PriorityQueueForObjects
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        PriorityQueue<Student>pq=new PriorityQueue<>();
        System.out.print("Enter how many values you can add : ");
        int n=Sc.nextInt();
        while(n!=0)
        {
            //add the values to the priority queue
            System.out.print("Enter the name : ");
            String name=Sc.next();
            System.out.print("Enter the rank : ");
            int rank=Sc.nextInt();
            pq.add( new Student( name, rank));
            n--;
        }
        //peek and remove from the priority queue
        while(!pq.isEmpty() )
        {
            System.out.println( pq.peek().name+" ==> "+pq.peek().rank );
            pq.remove();
        }
    }
}
