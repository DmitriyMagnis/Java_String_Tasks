package app;

public class Corrector {
    static public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String str : strs) {
            if (str.contains("b") && str != "banana") {
                str = str.replace("b", "o");
            }
            count++;
            stringBuilder.append(count).append(") ").append(str).append("\n");
        }
        return stringBuilder.toString();
    }
}
