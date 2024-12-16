import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> input = new ArrayList<Fruit>();
        input.add(new Fruit("Apple", new Date(30000000)));
        input.add(new Fruit("Orange", new Date(20000000)));
        input.add(new Fruit("Banana", new Date(10000000)));
        System.out.println("Before: ");
        for(int x = 0; x < input.size(); ++x){
            input.get(x).print();
        }
        System.out.println("After: ");
        Collections.sort(input);
        for(int x = 0; x < input.size(); ++x){
            input.get(x).print();
        }
    }
}