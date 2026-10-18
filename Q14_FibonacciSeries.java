import java.util.Scanner;

public class Q14_FibonacciSeries {
    static void printFibonacci(int remaining, long first, long second) {
        if (remaining == 0) return; // Printed all requested terms
        System.out.print(first + " ");
        printFibonacci(remaining - 1, second, first + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(n, 0, 1);
        System.out.println();
        sc.close();
    }
}
