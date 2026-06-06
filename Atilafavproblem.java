import java.util.*;

public class Atilafavproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next().toUpperCase();

            char max = 'A';

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) > max) {
                    max = s.charAt(i);
                }
            }

            System.out.println(max - 'A' + 1);
        }

        sc.close();
    }
}