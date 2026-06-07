import java.util.*;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (k != 4) {
                    ans = Math.min(ans, (k - a[i] % k) % k);
                }
            }

            if (k != 4) {
                System.out.println(ans);
                continue;
            }

            // Strategy 1: make one element divisible by 4
            int makeMultipleOf4 = Integer.MAX_VALUE;

            for (int x : a) {
                makeMultipleOf4 = Math.min(makeMultipleOf4, (4 - x % 4) % 4);
            }

            // Strategy 2: get at least two even numbers
            ArrayList<Integer> costs = new ArrayList<>();

            for (int x : a) {
                if (x % 2 == 0) {
                    costs.add(0);
                } else {
                    costs.add(1);
                }
            }

            Collections.sort(costs);

            int twoEvens = costs.get(0) + costs.get(1);

            System.out.println(Math.min(makeMultipleOf4, twoEvens));
        }
    }
}