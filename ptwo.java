import java.util.*;

public class ptwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        long[] pal = {
            0,  // r = 0
            1,  // r = 1
            2,  // r = 2
            3,  // r = 3
            4,  // r = 4
            5,  // r = 5
            6,  // r = 6
            7,  // r = 7
            8,  // r = 8
            9,  // r = 9
            22, // r = 10
            11  // r = 11
        };

        while (t-- > 0) {
            long n = sc.nextLong();

            int r = (int)(n % 12);
            long a = pal[r];

            if (a > n) {
                System.out.println(-1);
            } else {
                System.out.println(a + " " + (n - a));
            }
        }

        sc.close();
    }
}