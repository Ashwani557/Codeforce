import java.util.*;

public class TenWordsofwus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int bestRating = -1;
            int answer = -1;

            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (a <= 10 && b > bestRating) {
                    bestRating = b;
                    answer = i;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}