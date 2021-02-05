package vsu.cs.ru;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TextHandler textHandler = new TextHandler();
        String initialText = FileReader.readTextFromFile(args[0]);
        String[] arrayOfSentences = textHandler.splitInitialText(initialText);
        List<String> processedList = textHandler.getListWithQuestionSentences(arrayOfSentences);
        FileWriter.writeTextToFile(args[1], processedList);
    }
}
