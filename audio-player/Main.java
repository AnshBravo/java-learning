import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

    // Plain Java only supports .wav, .au, .aiff
    public static void main(String[] args){

        String filePath = "C:\\Users\\ANJU\\OneDrive\\Documents\\java-lang\\audio-player\\Over-My-Dead-Body.wav";

        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            


            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String choice = "p";
            
            while(!choice.equals("q")){

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                System.out.print("Enter your choice: ");

                choice = scanner.next().toLowerCase();


                switch (choice) {
                    case "p" -> clip.start();
                    case "s" -> clip.stop();
                    case "r" -> clip.setMicrosecondPosition(0);
                    case "q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                    
                }
            }

        }
        catch(FileNotFoundException err){
            System.err.println("File not found!");
        }
        catch(LineUnavailableException err){
            System.err.println("Unable to access the audio resource");
        }
        catch(UnsupportedAudioFileException err){
            System.err.println("Audio file format is not supported!");
        }
        catch(IOException err){
            System.err.println("Something Went Wrong!");

        }
        finally{
            System.out.println("Operations done");
            
        }
    }
}
