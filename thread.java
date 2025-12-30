import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 15; i++) {
            System.out.println("Task running: " + i);
        }
    }
}

public class thread {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Task task = new Task();
        for (int i = 0; i < 10; i++) {
            scheduler.schedule(task, i, TimeUnit.SECONDS);
        }
        scheduler.shutdown();
    }
}
