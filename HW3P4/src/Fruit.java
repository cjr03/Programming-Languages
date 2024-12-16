import java.util.Date;

public class Fruit extends Food {
    protected Date ripe;
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
}
