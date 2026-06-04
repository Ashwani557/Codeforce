import java.util.Scanner;

public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int digits = String.valueOf(n).length();
            int firstDigit = String.valueOf(n).charAt(0) - '0';

            int answer = 9 * (digits - 1) + firstDigit;

            System.out.println(answer);
        }
    }
}