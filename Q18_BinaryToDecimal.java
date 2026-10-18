import java.util.Scanner;

public class Q18_BinaryToDecimal {
    static long convert(String s, int index) {
        if (index == s.length()) return 0;
        int bit = s.charAt(index) - '0';
        return bit * powerOfTwo(s.length() - index - 1) + convert(s, index + 1);
    }

    static long powerOfTwo(int exponent) {
        if (exponent == 0) return 1;
        return 2 * powerOfTwo(exponent - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine().trim();
        System.out.println(convert(binary, 0));
        sc.close();
    }
}
