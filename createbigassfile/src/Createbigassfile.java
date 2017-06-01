/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SirCarls
 */
public class Createbigassfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File file = new File("write.txt");
        try {
            Writer wr = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < 10000000*10; i++) {
                wr.write("Jean is a lazy butt");
            }
            wr.close();
        } catch (IOException ex) {
            System.out.println("cant write");
        }
        
    }
}
