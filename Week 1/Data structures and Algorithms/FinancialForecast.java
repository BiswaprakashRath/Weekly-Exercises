import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double initial, double rate, int years) {
        if (years == 0) return initial;
        return futureValue(initial, rate, years - 1) * (1 + rate);
    }

    // Optimized version using memoization (optional)
    public static double futureValueMemo(double initial, double rate, int years, double[] memo) {
        if (years == 0) return initial;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(initial, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter initial amount: ");
        double initial = sc.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.05 for 5%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        // Recursive calculation
        double result = futureValue(initial, rate, years);
        System.out.printf("Future value after %d years = %.2f\n", years, result);

        // Optimized calculation (optional)
        double[] memo = new double[years + 1];
        double optimizedResult = futureValueMemo(initial, rate, years, memo);
        System.out.printf("Optimized future value after %d years = %.2f\n", years, optimizedResult);
        
        sc.close();
    }
}
