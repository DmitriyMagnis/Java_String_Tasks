package app;

import java.util.Locale;
import java.util.Scanner;

public class AppView {
    private final Scanner scanner = new Scanner(System.in);

    public String getName() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter name for search: ");
        String name = scanner.nextLine().trim();
        scanner.close();

        return name;
    }
}
