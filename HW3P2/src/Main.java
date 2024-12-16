//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d = new Date(2024, 1, 29);
        Food gum = new Food("gum");
        Food las = new Food("lasanga");
        Fruit pom = new Fruit("pomegranate", d);
        Fruit app = new Apple(d);
        Orange o = new Orange(d);
        Shrimp sh = new Shrimp();
        Seafood p = new Prawn();
        Seafood l = new Seafood();
        sh.prepare();
        app.prepare();
        pom.prepare();
        o.prepare();
        gum.prepare();
        p.prepare();
        l.prepare();
        las.prepare();
        las = app;
        las.prepare();
        o.ripeTime();
        pom.ripeTime();
    }
}