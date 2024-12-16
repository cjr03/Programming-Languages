public class Food {
    protected String name;
    protected Food(){name = "Food";}
    protected Food(String in_name) {name = in_name;}
    protected void prepare() {
        System.out.println("Prepare the " + name);
    }
}
