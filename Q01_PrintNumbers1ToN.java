import java.util.Scanner;

public class Q01_PrintNumbers1ToN {
    static void printNumbers(int n) {
        if (n == 0) return;       // Base case: nothing remains to print
        printNumbers(n - 1);      // Print smaller numbers first
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
        System.out.println();
        sc.close();
    }
}
