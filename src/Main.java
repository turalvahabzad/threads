import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {


FileWriter fileWriter1=new FileWriter(100,"Salam", FileWriter.WRITE_TYPE.IO,"myfile1.txt");
FileWriter fileWriter2=new FileWriter(100,"Sagol", FileWriter.WRITE_TYPE.NIO,"myfile2.txt");

ExecutorService executorService=Executors.newFixedThreadPool(2);
executorService.submit(fileWriter1);
executorService.submit(fileWriter2);
executorService.shutdown();
executorService.awaitTermination(1,TimeUnit.DAYS);



    }
}