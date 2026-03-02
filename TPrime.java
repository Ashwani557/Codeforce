import java.util.*;

public class TPrime {

    public static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            long m = sc.nextLong();

            long sqrt = (long) Math.sqrt(m);

            if (sqrt * sqrt == m && isPrime(sqrt)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}