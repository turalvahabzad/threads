import java.io.IOException;

public class MyRunnable1 implements Runnable{
    @Override
    public void run() {

      for(int i=0;i<100;i++){

          try {
              FileUtility.writeTextFile("Salam  "+System.nanoTime(), "myfile.txt");
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
      }

    }
}
