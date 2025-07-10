package Superclass;

import java.io.File;

public class DirectoryTraversal {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\moham\\Documents"); 
        listFiles(folder);
    }

    public static void listFiles(File dir) {
        if (!dir.exists()) {
            System.out.println("Directory not found.");
            return;
        }

        File[] files = dir.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("[DIR]  " + file.getAbsolutePath());
                listFiles(file); // Recursive call
            } else {
                System.out.println("[FILE] " + file.getAbsolutePath());
            }
        }
    }
}
