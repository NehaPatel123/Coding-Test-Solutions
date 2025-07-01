import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        // If a is even, reduce it by 1
        if (a % 2 == 0) {
            a = a - 1;
        }

        // Print first 'a' odd numbers
        int num = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(num);
            if (i != a) {
                System.out.print(", ");
            }
            num += 2;
        }

        sc.close();
    }
}
