//calculate the distance of all co-ordinates and find minimum

import java.util.*;

class Point implements Comparable<Point>
{
    int x;
    int y;
    int dist;
    int index;
    Point( int x, int y, int dist, int index )
    {
        this.x=x;
        this.y=y;
        this.dist=dist;
        this.index=index;
    }

    @Override
    public int compareTo( Point p2)
    {
        return this.dist-p2.dist;
    }
}

public class NearestKPointToTheOrigin 
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter how many co-ordinates : ");
        //length of the arr
        int n=Sc.nextInt();
        int arr[][]=new int[n][2];

        //input the coordinates of x and y
        for( int i=0 ; i<n ; i++ )
        {
            System.out.print( "Enter the value  x and y : ");
            arr[i][0]=Sc.nextInt();
            arr[i][1]=Sc.nextInt();
        }
        //input k value
        System.out.print("Enter the value of k : ");
        int k=Sc.nextInt();
        //Priority Queue of point class which compare according to distance
        PriorityQueue<Point>pq=new PriorityQueue<>();

        for( int i=0 ; i<n ; i++ )
        {
            int x=arr[i][0];
            int y=arr[i][1];
            //distance
            int dist=x*x+y*y;
            //add the values to pq
            pq.add( new Point( x, y, dist, i) );
        }
        System.out.println("Nearest k points are : ");
        while( k-->0 )
        {
            //print the nearest points
            System.out.println( "(x,y) : ("+pq.peek().x+","+pq.peek().y+")" );
            pq.remove();
        }
    }
}
