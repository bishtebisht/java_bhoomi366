import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteWrite {
    public static void main(String[] args) {

        // Writing data to a file using FileOutputStream

        // try (FileOutputStream fos = new FileOutputStream("output.txt")) {
        //     String data = "Hello, this is a byte stream example.";
        //     byte[] byteData = data.getBytes();
        //     fos.write(byteData);
        //     fos.close();
        //     System.out.println("Data written to output.txt successfully.");
        // } 

        // Reading data from a file using FileInputStream
        
        // try{
        //     FileInputStream fis = new FileInputStream("output.txt");

        //     int data;
        //     while((data = fis.read()) != -1) {
        //         System.out.println((char) data);
        //     }   
        //     fis.close();
        // }

        // try{
        //     FileWriter fw = new FileWriter("output.txt");

        //     fw.write("Hello java character stream!");
        //     fw.close();

        //     System.out.println("Data written to output.txt successfully.");
        // }

        try{
            FileReader fr = new FileReader("output.txt");

            int data;
            while((data = fr.read()) != -1) {
                System.out.println((char) data);
            }
            fr.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
