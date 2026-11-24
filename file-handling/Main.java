import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        // write a file using Java

        // Methods
        // 1. FileWriter = Good for small or medium-sized text files
        // 2.BufferedWriter = Better performance for large amounts of text
        // 3.PrintWriter = Best for structured data , like reports or logs
        // 4. FileOutputStream  = Best for binary files (e.g, images, audios, videos)


        try(FileWriter writer = new FileWriter("text.txt")){
            writer.write("This text is written using java FileWriter");
            System.out.println("File Writing Successful");
        }
        catch(FileNotFoundException err){
            System.err.println("File not Found at the defined location");
        }
        catch(IOException err){
            System.err.println("Failed to write the file");
        }



        // Read file using Java

        // 1. BufferedReader + FileReader: Best for reading text files line-by-line.
        // 2. FileInputStream: Best for binary files (e.g., images, audios).
        // 3. RandomAccessFile: Best for read/write specific portions of a large file.


        String filePath = "C:\\Users\\ANJU\\OneDrive\\Documents\\java-lang\\file-handling\\text.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath));){

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException err){
            System.err.println("File not found");
        }
        catch(IOException err){
            System.err.println("Failed to read the file");
        }
    }
}
