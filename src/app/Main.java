package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to String Tasks app");

        String[] dataWithRemovedWords = Corrector.handleRemoveWord("onion",
                new DataRepository().getWords()
        );

        String output = Corrector.formatOutputData(dataWithRemovedWords);

        getOutput(output);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }

}
