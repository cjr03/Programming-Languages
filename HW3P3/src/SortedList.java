import java.util.*;
public class SortedList {
    public ArrayList<Integer> input;
    public Iterator<Integer> it;
    public SortedList() {
        input = new ArrayList<Integer>();
    }
    public SortedList(ArrayList<Integer> in) {
        input = in;
        it = input.iterator();
    }
    public void insert(int n){
        input.add(n);
        it = input.iterator();
    }

    public int binsearch(int search){
        int n= input.size();
        int first, last, middle;
        first = 0;
        last = n - 1;
        middle = (first + last)/2;
        while( first <= last )
        {
            if ( input.get(middle) < search )
                first = middle + 1;
            else if ( input.get(middle) == search )
            {
                return middle;
            }
            else
                last = middle - 1;
            middle = (first + last)/2;
        }
        return -1;
    }
    private static int partition (ArrayList<Integer> input, int p, int r){
        int pivot = input.get(r);
        while(p < r){
            while(input.get(p) < pivot) p++;
            while(input.get(r) > pivot) r--;
            if(input.get(p).equals(input.get(r))) p++;
            else if ( p < r) {
                int tmp = input.get(p);
                input.set(p, input.get(r));
                input.set(r, tmp);
            }
        }
        return r;
    }
    public void quicksort(ArrayList<Integer> in, int p, int r){
        if(p < r){
            int j = partition(in, p, r);
            quicksort(in, p, j-1);
            quicksort(in, j+1, r);
        }
    }
    public void print(){
        it.forEachRemaining(System.out::println);
    }
}