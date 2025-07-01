import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        // Input list of numbers
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Create a map to store count of divisible numbers for 1 to 9
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Initialize map with 0 counts
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Loop through each number and check divisibility
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    // Increment the count for divisor i
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Print the result
        System.out.println(countMap);
    }
}
