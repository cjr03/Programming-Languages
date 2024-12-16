public class Seafood extends Food {
    protected Seafood(){name = "Seafood";}
    protected Seafood(String in_name){name = in_name;}
    public void Prepare(){
        System.out.println("Peel the " + name);
    }
}
