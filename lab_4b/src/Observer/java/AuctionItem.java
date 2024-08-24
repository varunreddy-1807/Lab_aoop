package Observer.java;

import java.util.ArrayList;
import java.util.List;

public class AuctionItem implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String itemName;
    private boolean available;

    public AuctionItem(String itemName) {
        this.itemName = itemName;
        this.available = false;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        notifyObservers(available ? "Item Available" : "Item Unavailable", itemName);
    }

    public void startBidding() {
        notifyObservers("Bidding Started", itemName);
    }

    public void endBidding() {
        notifyObservers("Bidding Ended", itemName);
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event, String item) {
        for (Observer observer : observers) {
            observer.update(event, item);
        }
    }
}

