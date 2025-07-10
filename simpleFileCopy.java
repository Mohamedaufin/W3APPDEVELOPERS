package Superclass;

import java.io.*;

public class simpleFileCopy {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("Done!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
