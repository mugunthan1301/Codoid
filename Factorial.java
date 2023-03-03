package java;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = factorial(n);
        System.out.println(factorial);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}