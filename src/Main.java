import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {


MyRunnable1 runnable1=new MyRunnable1();
MyRunnable2 runnable2=new MyRunnable2();
        ExecutorService executorService= Executors.newFixedThreadPool(2);

        executorService.submit(runnable1);
        executorService.submit(runnable2);

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);



    }
}