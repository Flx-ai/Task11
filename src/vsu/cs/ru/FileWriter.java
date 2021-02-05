package vsu.cs.ru;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.List;

public class FileWriter {

    public static void writeTextToFile(String fileName, List<String> finalText) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(fileName);
        } catch (FileNotFoundException exception) {
            System.out.println("File not found!");
        }
        printWriter.write(String.valueOf(finalText));
        printWriter.close();
    }
}