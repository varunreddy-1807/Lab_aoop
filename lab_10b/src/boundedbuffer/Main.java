package boundedbuffer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(10);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new Producer(buffer));
        executor.execute(new Consumer(buffer));

        executor.shutdown();
    }
}

