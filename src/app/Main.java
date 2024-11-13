package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to String Tasks app");

        String output = Corrector.handleData("onion",
                new DataRepository().getWords()
        );

        getOutput(output);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }

}
