import java.util.Date;
//import java.lang;
public class Fruit extends Food implements Comparable<Fruit> {
    public Date ripe;
    protected Fruit() {
        name = "Fruit";
        ripe = new Date(2024, 1, 29);
    }
    protected Fruit(String n, Date r) {
        name = n;
        ripe = r;
    }
    protected void ripeTime() {
        System.out.println("You can eat it on " + ripe);
    }

    public int compareTo(Fruit f) {
        return ripe.compareTo(f.ripe);
    }

    public void print(){
        System.out.print(name);
        System.out.print(" has an expiration date ");
        System.out.println(ripe);
        return;
    }
}
