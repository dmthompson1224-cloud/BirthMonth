import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int birthMonth;

            System.out.print("Enter your birthmonth: ");
            if (in.hasNextInt()) {
                birthMonth = in.nextInt();

                if (birthMonth >= 1 && birthMonth <= 12) {
                    System.out.println("Your birth month is: " + birthMonth);
                } else {
                    System.out.println("You have entered an incorrect month value. ");
                    System.exit(0);
                }
            } else {
                String trash = in.nextLine();
                System.out.println("You entered a bad input: " + trash);
            }
    }
}