package LSP;

public class Main {
    public static void main(String[] args) {
    
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        performFly(sparrow);  
        performFly(ostrich); 
    }

    public static void performFly(Bird bird) {
        try {
            bird.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
