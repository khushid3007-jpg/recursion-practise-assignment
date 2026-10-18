import java.util.Scanner;

public class Q02_PrintNumbersNTo1 {
    static void printNumbers(int n) {
        if (n == 0) return;       // Base case
        System.out.print(n + " ");
        printNumbers(n - 1);      // Continue in decreasing order
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
        System.out.println();
        sc.close();
    }
}
