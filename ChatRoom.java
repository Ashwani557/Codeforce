import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int j = 0;
        String a = "hello";

        for (int i = 0; i < s.length() && j < a.length(); i++) {
            if (s.charAt(i) == a.charAt(j)) {
                j++;
            }
        }

        if (j == a.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
