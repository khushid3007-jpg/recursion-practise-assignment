import java.util.Scanner;

public class Q04_PrintOddNumbers1ToN {
    static void printOdd(int n) {
        if (n < 1) return;        // Base case
        printOdd(n - 1);
        if (n % 2 != 0) System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOdd(n);
        System.out.println();
        sc.close();
    }
}
