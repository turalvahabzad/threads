import java.io.IOException;

public class MyRunnable2 implements Runnable{
    @Override
    public void run() {

        for(int i=0;i<100;i++){

            try {
                FileUtility.writeTextToFile0("Sagol  "+System.nanoTime(), "myfile2.txt");
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
