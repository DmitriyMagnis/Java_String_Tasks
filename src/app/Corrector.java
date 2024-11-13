package app;

public class Corrector {
    static public String handleData(String word, String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();

        int count = 0;
        for (String str : strs) {
            if (!str.equals(word)) {
                count++;
                stringBuilder.append(count).append(") ").append(str).append("\n");
            }

        }
        return stringBuilder.toString();
    }
}
