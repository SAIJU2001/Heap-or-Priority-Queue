import java.util.*;

public class MinHeapImplement 
{
    public static class Heap
    {
        ArrayList<Integer>list=new ArrayList<>();
        
        //add the values to the heap
        void add( int data )
        {
            //step 1 --> add the data to the last
            list.add(data);

            //step 2 --> fix the heap
            int child=list.size()-1;
            int parent=(child-1)/2;

            while( list.get(child)<list.get(parent))
            {
                //swap
                swap(child, parent);

                //counter
                child=parent;
                parent=(child-1)/2;
            }
        }
        //obtain the peek value
        int peek()
        {
            return list.get(0);
        }
        //remove from the heap
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
        //to fix the heap after removing peek element
        void heapify( int index )
        {
            int left=index*2+1;
            int right=index*2+2;
            int minIndex=index;

            //finding min index
            if( left<list.size() && list.get(minIndex)>list.get(left) )
                minIndex=left;

            if( right<list.size() && list.get(minIndex)>list.get(right) )
                minIndex=right;

            if( minIndex!=index )
            {
                //swap call
                swap(index, minIndex);

                //recursive call
                heapify(minIndex);
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
            //add the values to the heap
            System.out.print("Enter the value : ");
            h.add(Sc.nextInt());
            n--;
        }
        //peek and remove from the heap
        while(!h.isEmpty() )
        {
            System.out.print( h.peek()+" ");
            h.remove();
        }
    }
}
