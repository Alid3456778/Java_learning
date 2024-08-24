import java.util.Scanner;

public class sum_of_last{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = sumFirstAndLastDigit(number);

        System.out.println("The sum of the first and last digits of " + number + " is: " + sum);

        scanner.close();
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;

        // Find the first digit
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        return firstDigit + lastDigit;
    }
}