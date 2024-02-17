import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FileWriter implements Runnable {

    public enum WRITE_TYPE{

        IO, NIO;
    }
private final int count;
private final String message;
private final String filename;
private WRITE_TYPE write_type;

    public FileWriter(int count, String message,WRITE_TYPE write_type, String filename) {
        this.count=count;
        this.message = message;
        this.filename = filename;
        this.write_type=write_type;
    }


    private void writeByNIO(){

        try{
            for(int i=0;i<count;i++){
FileUtility.writeTextToFile0(message+"\n",filename);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }
    private void writeByIO() {
        try (BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(filename))) {
            for (int i = 0; i < count; i++) {
                bw.write(message);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
if(write_type==WRITE_TYPE.NIO){

    writeByNIO();
} else if (write_type==WRITE_TYPE.IO) {
    writeByIO();
}
    }
}
