package pl.pp;
import java.util.Scanner;
public class mojaSzostaAplikacja {

    // Sposób iteracyjny
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Sposób rekurencyjny
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n= ");
        int n = scanner.nextInt();


        // timings
        long startTimeIterative = System.nanoTime();
        long resultIterative = factorialIterative(n);
        long endTimeIterative = System.nanoTime();
        long elapsedTimeIterative = endTimeIterative - startTimeIterative;

        System.out.println("Silnia " + n + " (metoda iteracyjna): " + resultIterative);
        System.out.println("Czas wykonania (metoda iteracyjna):" + elapsedTimeIterative + " nanosekundy");

        // timings
        long startTimeRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(n);
        long endTimeRecursive = System.nanoTime();
        long elapsedTimeRecursive = endTimeRecursive - startTimeRecursive;

        System.out.println("Silnia " + n + " (sposób rekurencyjny): " + resultRecursive);
        System.out.println("Czas wykonania (sposób rekurencyjny) : " + elapsedTimeRecursive + " nanosekundy");

        scanner.close();
    }
}

