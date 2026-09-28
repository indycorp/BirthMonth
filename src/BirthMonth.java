import java.util.Scanner;

public class BirthMonth {
    void main() {
        Scanner in = new Scanner(System.in);

        int birthMonth = 0;
        String trash = "";

        IO.print("enter your birth month here ");

        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();    // Clear the new line from the key buffer
        } else {
            trash = in.nextLine();
            IO.println("you must enter a valid number not " + trash);
            IO.println("return the program and try again! ");
            System.exit(1);
        }

        if (birthMonth >= 1 && birthMonth <= 12) {
            IO.println("Your birth month is: " + birthMonth);
        } else {
            IO.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}