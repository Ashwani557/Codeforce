import java.util.Scanner;

public class Almostprim {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;

        for (int x = 2; x <= n; x++) {

            int cnt = 0;

            for (int p = 2; p <= x; p++) {

                if (x % p == 0) {

                    boolean prime = true;

                    for (int d = 2; d * d <= p; d++) {
                        if (p % d == 0) {
                            prime = false;
                            break;
                        }
                    }

                    if (prime) {
                        cnt++;
                    }
                }
            }

            if (cnt == 2) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}