import java.util.Scanner;

public class ProductfthreeNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();

            long temp = n;

            long a = -1, b = -1, c;

            // Find first factor
            for (long i = 2; i * i <= temp; i++) {
                if (temp % i == 0) {
                    a = i;
                    temp /= i;
                    break;
                }
            }

            // Find second distinct factor
            for (long i = 2; i * i <= temp; i++) {
                if (temp % i == 0 && i != a) {
                    b = i;
                    temp /= i;
                    break;
                }
            }

            c = temp;

            // Check validity
            if (a != -1 && b != -1 &&
                c > 1 &&
                a != b &&
                b != c &&
                a != c) {

                System.out.println("YES");
                System.out.println(a + " " + b + " " + c);

            } else {
                System.out.println("NO");
            }
        }
    }
}