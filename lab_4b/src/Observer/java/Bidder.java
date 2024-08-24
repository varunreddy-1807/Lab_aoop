package Observer.java;

public class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String event, String item) {
        System.out.println(name + " received notification: " + event + " for " + item);
    }
}

