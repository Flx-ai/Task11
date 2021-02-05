package vsu.cs.ru;

import java.util.ArrayList;
import java.util.List;


public class TextHandler {

    public String[] splitInitialText(String text) {
        text = text.replace(". ", ".|").replace("! ", "!|").replace("? ", "?|");
        String[] arrayOfSentences = text.split("\\|");
        return arrayOfSentences;
    }

    public List<String> getListWithQuestionSentences(String[] arrayOfSentences) {
        List<String> list = new ArrayList<>();
        for (String sentence : arrayOfSentences) {
            if (sentence.matches("[^!.?]*\\?")) {
                list.add(sentence);
            }
        }
        return list;
    }
}
