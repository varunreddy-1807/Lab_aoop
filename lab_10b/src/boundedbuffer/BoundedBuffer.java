package boundedbuffer;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    private final Queue<String> buffer;
    private final int capacity;

    public BoundedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(String item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); 
    }

    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); 
        }
        String item = buffer.poll();
        System.out.println("Consumed: " + item);
        notifyAll();
        return item;
    }
}
