package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to String Tasks app");

        String output = Corrector.handleData(
                new DataRepository().getWordsWithIncorrectLetters()
        );

        getOutput(output);

    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
