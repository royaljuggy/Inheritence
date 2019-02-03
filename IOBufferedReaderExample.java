package iobufferedreaderexample;
import java.io.*;

public class IOBufferedReaderExample {


    public static void main(String[] args){
        //https://www.youtube.com/watch?v=waXvGUEjTTs
        //https://docs.oracle.com/javase/tutorial/essential/io/ basic IO
        
        //bufferedreaders surround input stream readers or file readers, these readers actually read the text which puts the data into a bufferedreader,
        //which is safer and more efficient for your computer (more efficient because data is being sent into a buffer, a memory area)
        
        BufferedReader br; //creating a memory location for the br, not instantiated
        
        String line;
        
        try {
            br = new BufferedReader(new FileReader("example.txt"));
            
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            
            br.close();           
             
        } catch (IOException f) { // or FileNotFoundException
            System.out.println("IOException caught");
            f.printStackTrace();
        }
        
        
        
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String name = "nothing";
        
        try {
            while (!name.equalsIgnoreCase("stop")) {
                System.out.println("Try typing some stuff, type stop to terminate");
                name = br2.readLine();
                System.out.println("Your name is " + name);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
    
}
