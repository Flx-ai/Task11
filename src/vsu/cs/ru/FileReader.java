package vsu.cs.ru;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static String readTextFromFile(String fileName) {
        File inputFile = new File(fileName);
        String initialText = "";
        try {
            Scanner scanner = new Scanner(inputFile);
            initialText = scanner.nextLine();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found!");
        }
        return initialText;
    }
}
