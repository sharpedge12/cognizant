public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValueRecursive(double initial, double rate, int years) {
        if (years == 0) return initial;
        return futureValueRecursive(initial, rate, years - 1) * (1 + rate);
    }

    // Optimized version using memoization
    public static double futureValueMemo(double initial, double rate, int years, Double[] memo) {
        if (years == 0) return initial;
        if (memo[years] != null) return memo[years];

        memo[years] = futureValueMemo(initial, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0; // ₹10,000
        double annualGrowthRate = 0.08;     // 8%
        int years = 10;

        // Plain recursion
        double resultRecursive = futureValueRecursive(initialInvestment, annualGrowthRate, years);
        System.out.println("Future Value (Recursive): ₹" + resultRecursive);

        // Memoized recursion
        Double[] memo = new Double[years + 1];
        double resultMemo = futureValueMemo(initialInvestment, annualGrowthRate, years, memo);
        System.out.println("Future Value (Memoized): ₹" + resultMemo);
    }
}
