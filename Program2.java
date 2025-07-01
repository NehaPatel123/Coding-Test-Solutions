import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        // Generate and print first 'a' odd numbers
        int num = 1; // start from 1 
        for (int i = 1; i <= a; i++) {
            System.out.print(num);
            if (i != a) {
                System.out.print(", "); // add comma except after last number
            }
            num += 2; // go to next odd number
        }

        sc.close();
    }
}
