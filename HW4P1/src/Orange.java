import java.util.Date;
public class Orange extends Fruit {
    protected Orange() {
        name = "Orange";
        ripe = new Date(2024, 1, 29);
    }
    protected Orange(Date r){
        name = "Orange";
        ripe = r;
    }
    protected void Prepare(){
        System.out.println("Peel the orange");
    }
}
