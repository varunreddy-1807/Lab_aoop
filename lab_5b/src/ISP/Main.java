package ISP;

public class Main {
    public static void main(String[] args) {
        
        Worker robot = new Robot();
        Worker humanWorker = new Human();
        Eater humanEater = new Human();

        
        performWork(robot);      
        performWork(humanWorker); 
        performEat(humanEater);  

        
    }

   
    public static void performWork(Worker worker) {
        worker.work();
    }

   
    public static void performEat(Eater eater) {
        eater.eat();
    }
}
