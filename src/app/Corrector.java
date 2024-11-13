package app;

import java.util.ArrayList;

public class Corrector {
    static public String[] handleRemoveWord(String word, String[] strs) {
        ArrayList<String> arrayStrings = new ArrayList<>();

        for (String str : strs) {
            if (!str.contains(word)) {
                arrayStrings.add(str);
            }
        }

        return arrayStrings.toArray(new String[0]);
    }

    static public String formatOutputData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String str : strs) {
            count++;
            stringBuilder.append(count).append(") ").append(str).append("\n");
        }
        return stringBuilder.toString();
    }
}
