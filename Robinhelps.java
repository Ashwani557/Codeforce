import java.util.Scanner;

public class Robinhelps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int gold = 0;
            int ans = 0;

            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();

                if (x >= k) {
                    gold += x;
                }
                else if (x == 0 && gold > 0) {
                    gold--;
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}