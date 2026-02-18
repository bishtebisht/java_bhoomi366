
import java.io.*;

//works for checked error
public class throwsDemo {
    static void readFile() throws IOException {
       FileReader file = new FileReader("somefile.txt");
       System.out.println("File opened successfully.");
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
