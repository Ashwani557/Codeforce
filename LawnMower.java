import java.util.*;

public class LawnMower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long w = sc.nextLong();

            if (w == 1) {
                System.out.println(0);
                continue;
            }

            long fullBlocks = n / w;
            long remainder = n % w;

            long ans = fullBlocks * (w - 1) + Math.min(w - 1, remainder);
            System.out.println(ans);
        }
    }
}
