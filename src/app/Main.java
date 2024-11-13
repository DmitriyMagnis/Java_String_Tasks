package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to String Tasks app");

        String[] correctedWords = Corrector.handleIncorrectLetters(
                new DataRepository().getWordsWithIncorrectLetters()
        );
        String output = Corrector.formatOutputData(correctedWords);
        getOutput(output);

    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
