import java.io.IOException;

public class MyRunnable1 implements Runnable{
    @Override
    public void run() {

      for(int i=0;i<100;i++){

          try {
              FileUtility.writeTextToFile0("Salam  "+System.nanoTime(), "myfile1.txt");
          }  catch (Exception e) {
              throw new RuntimeException(e);
          }
      }

    }
}
