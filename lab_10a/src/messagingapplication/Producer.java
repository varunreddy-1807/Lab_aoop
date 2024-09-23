package messagingapplication;

public class Producer implements Runnable {
    private final MessageBuffer buffer;

    public Producer(MessageBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                String message = "Message " + i;
                buffer.produce(message);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
