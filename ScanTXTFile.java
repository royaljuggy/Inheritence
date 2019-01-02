/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scantxtfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Oth
 */
public class ScanTXTFile {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        //creating File instance to reference text file in Java
        File text = new File("C:\\Users\\Oth\\Documents\\NetBeansProjects\\ScanTXTFile\\test.txt");
      
        //Creating Scanner instnace to read File in Java
        Scanner scnr = new Scanner(text);
      
        //Reading each line of file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
            
        }
    }
}
