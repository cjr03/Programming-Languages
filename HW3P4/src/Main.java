import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> input = new ArrayList<Object>(Arrays.asList("Food", "Orange", "Fruit", "Papaya", 3932728, "Apple", "now", "Food", "sandwich"));
        System.out.println("Before: ");
        print(input);
        System.out.println("After: ");
        input = objectClassify(input);
        print(input);
    }
    public static ArrayList<Object> objectClassify(ArrayList<Object> input){
        ArrayList<Object> newlist = new ArrayList<Object>();
        int tmp = 0;
        String name = "";
        int classifier = 0;
        for(int x = 0; x < input.size(); ++x){
            if("Food".equals(input.get(x))){
                if (classifier != 0) newlist.add(objectCreator(classifier, name, tmp));
                name = "";
                tmp = 0;
                classifier = 1;
            } else if ("Fruit".equals(input.get(x))) {
                if (classifier != 0) newlist.add(objectCreator(classifier, name, tmp));
                name = "";
                tmp = 0;
                classifier = 2;
            } else if ("Apple".equals(input.get(x))) {
                if (classifier != 0) newlist.add(objectCreator(classifier, name, tmp));
                name = "";
                tmp = 0;
                classifier = 3;
            } else if ("Orange".equals(input.get(x))) {
                if (classifier != 0) newlist.add(objectCreator(classifier, name, tmp));
                name = "";
                tmp = 0;
                classifier = 4;
            } else if(Integer.class.equals(input.get(x).getClass())) {
                tmp = (Integer) input.get(x);
            } else if(String.class.equals(input.get(x).getClass())) {
                name = (String) input.get(x);
            }
        }
        newlist.add(objectCreator(classifier, name, tmp));
        return newlist;
    }
    public static Food objectCreator(int classifier, String name, int tmp){
        switch(classifier){
            case 1:
                if("".equals(name)) return new Food();
                else return new Food(name);
            case 2:
                if("".equals(name)) return new Fruit();
                else return new Fruit(name, new Date(tmp));
            case 3:
                if( tmp == 0 ) return new Apple();
                else return new Apple(new Date(tmp));
            case 4:
                if( tmp == 0 ) return new Orange();
                else return new Orange(new Date(tmp));
        }
        return new Food();
    }
    public static void print(ArrayList<Object> input){
        for(int x = 0; x < input.size(); x++){
            System.out.println(input.get(x));
        }
    }
}