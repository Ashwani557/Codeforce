import java.util.*;

public class PTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            if (s.length() < 3 || !s.startsWith("10")) {
                System.out.println("NO");
            } else {
                String rest = s.substring(2);

                if (rest.charAt(0) == '0') {
                    System.out.println("NO");
                } else {
                    int x = Integer.parseInt(rest);
                    System.out.println(x >= 2 ? "YES" : "NO");
                }
            }
        }

        sc.close();
    }
}