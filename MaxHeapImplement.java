import java.util.*;

public class MaxHeapImplement 
{
    public static class Heap
    {
        ArrayList<Integer>list=new ArrayList<>();

        //add the value to the heap
        void add( int data )
        {
            //step 1 --> add the data to the last
            list.add(data);

            //step 2 --> fix the heap
            int child=list.size()-1;
            int parent=(child-1)/2;

            while( list.get(child)>list.get(parent))
            {
                //swap
                swap(child, parent);

                //counter
                child=parent;
                parent=(child-1)/2;
            }
        }
        //to obtaine the peek value
        int peek()
        {
            return list.get(0);
        }
        //remove the peek value from the heap
        int remove()
        {
            int data=list.get(0);

            //step 1 --> swap the first and last value
            swap(0, list.size()-1);

            //step 2 --> remove the last index
            list.remove(list.size()-1);

            //step 3 --> heapify(fix heap)
            heapify(0);

            return data;
        }
        //heapify function to fix the heap after peek removal
        void heapify( int index )
        {
            int left=index*2+1;
            int right=index*2+2;
            int maxIndex=index;

            //finding min index
            if( left<list.size() && list.get(maxIndex)<list.get(left) )
                maxIndex=left;

            if( right<list.size() && list.get(maxIndex)<list.get(right) )
                maxIndex=right;

            if( maxIndex!=index )
            {
                //swap call
                swap(index, maxIndex);

                //recursive call
                heapify(maxIndex);
            }
        }
        //swap function for reduce the multiple time writing the code for swaping 
        void swap( int i,int j)
        {
            int temp=list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

        }
        //to check the arraylist is empty or not
        boolean isEmpty()
        {
            return list.size()==0;
        }
    }    
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        Heap h=new Heap();
        System.out.print("Enter how many values you can add : ");
        int n=Sc.nextInt();
        while(n!=0)
        {
            //add the values to the priority queue
            System.out.print("Enter the value : ");
            h.add(Sc.nextInt());
            n--;
        }
        //peek and remove from the priority queue
        while(!h.isEmpty() )
        {
            System.out.print( h.peek()+" ");
            h.remove();
        }
    }
}
