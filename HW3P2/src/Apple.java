import java.util.Date;
public class Apple extends Fruit {
    protected Apple() {
        name = "Apple";
        ripe = new Date(2024, 1, 29);
    }
    protected Apple(Date r){
        name = "Apple";
        ripe = r;
    }
    protected void Prepare(){
        System.out.println("Core the apple");
    }
}
