package app;

public class Manipulator {
    static public String[] findCountOfUsersByName(String inputName, String[] namesStr) {

        int count = 0;

        for (String name: namesStr) {
            if (name.equalsIgnoreCase(inputName)) {
                count++;
            }
        }

        return new String[] {inputName, String.valueOf(count)};
    }
}
