package app;

public class Corrector {
    static public String[] handleIncorrectLetters(String[] strs) {
        String[] newData = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].contains("b") && strs[i] != "banana") {
                newData[i] = strs[i].replace("b", "o");
            } else {
                newData[i] =  strs[i];
            }
        }
        return newData;
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
