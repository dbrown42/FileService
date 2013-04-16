/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.io.*;
import java.util.*;
/**
 *
 * @author Dallas
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("src/lab1/contacts.txt");
        BufferedReader input = null;
        String line;
        try {
            input = new BufferedReader(new FileReader(file));
            line = "";
            while(line != null){
                line = input.readLine(); 
                String[]parts = line.split(";");
                //System.out.println(line);
                System.out.println("First Name: " + parts[0] 
                        + "\nLast Name: " + parts[1]
                        + "\nAddress: " + parts[2]
                        + "\nCity: " + parts[3]
                        + "\nState: " + parts[4]
                        + "\nZip: " + parts[5]
                        + "\nEmail: " + parts[6]
                        + "\nPhone: " + parts[7]
                        + "\n");
            }
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                input.close();
            } catch(Exception e) {
            }
        }        
    }
}
