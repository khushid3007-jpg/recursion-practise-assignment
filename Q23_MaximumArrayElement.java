import java.util.Scanner;

public class Q23_MaximumArrayElement {
    static int maximum(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        int maxOfRest = maximum(arr, index + 1);
        return Math.max(arr[index], maxOfRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(maximum(arr, 0));
        sc.close();
    }
}
