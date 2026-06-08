import java.util.Scanner;

public class GivenlenandSOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int s = sc.nextInt();

        if ((s == 0 && m > 1) || s > 9 * m) {
            System.out.println("-1 -1");
            return;
        }

        if (m == 1 && s == 0) {
            System.out.println("0 0");
            return;
        }

        // Largest number
        StringBuilder largest = new StringBuilder();
        int sum = s;

        for (int i = 0; i < m; i++) {
            int digit = Math.min(9, sum);
            largest.append(digit);
            sum -= digit;
        }

        // Smallest number
        StringBuilder smallest = new StringBuilder();
        sum = s;

        for (int i = 0; i < m; i++) {
            for (int d = (i == 0 ? 1 : 0); d <= 9; d++) {
                int remainingSum = sum - d;
                int remainingPos = m - i - 1;

                if (remainingSum >= 0 && remainingSum <= 9 * remainingPos) {
                    smallest.append(d);
                    sum -= d;
                    break;
                }
            }
        }

        System.out.println(smallest + " " + largest);
    }
}