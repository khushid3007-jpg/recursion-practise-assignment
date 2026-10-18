import java.util.Scanner;

public class Q05_SumFirstNNaturalNumbers {
    static long sum(int n) {
        if (n <= 0) return 0;     // Base case
        return n + sum(n - 1);    // Current number + sum of earlier numbers
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
