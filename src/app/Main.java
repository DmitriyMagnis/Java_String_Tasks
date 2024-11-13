package app;

public class Main {

    private static final AppView view = new AppView();

    public static void main(String[] args) {
        System.out.println("Welcome to String Tasks app");

        String userName = view.getName();

        String[] user = Manipulator.findCountOfUsersByName(userName,
                new DataRepository().getAllNames()
        );

        boolean isUserExists = Integer.parseInt(user[1]) > 0;

        getOutput(isUserExists ? "Found - " + user[1] + " users with name " + user[0] : "No user found");

    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
