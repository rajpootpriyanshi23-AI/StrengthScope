import java.util.Scanner;

public class StrengthScope {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            else if (Character.isLowerCase(ch)) {
                hasLower = true;
            }
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            else {
                hasSpecial = true;
            }
        }

        int score = 0;

        if (password.length() >= 8)
            score++;

        if (hasUpper)
            score++;

        if (hasLower)
            score++;

        if (hasDigit)
            score++;

        if (hasSpecial)
            score++;

        System.out.println("\n----- Password Analysis -----");
        System.out.println("Length: " + password.length());
        System.out.println("Uppercase Present: " + hasUpper);
        System.out.println("Lowercase Present: " + hasLower);
        System.out.println("Digit Present: " + hasDigit);
        System.out.println("Special Character Present: " + hasSpecial);

        if (score <= 2) {
            System.out.println("\nPassword Strength: WEAK");
        }
        else if (score <= 4) {
            System.out.println("\nPassword Strength: MEDIUM");
        }
        else {
            System.out.println("\nPassword Strength: STRONG");
        }

        sc.close();
    }
}