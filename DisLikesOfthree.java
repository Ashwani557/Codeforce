import java.util.*;

public class DisLikesOfthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            int num = 1;

            while (true) {
                
                if (num % 3 != 0 && !String.valueOf(num).contains("3")) {
                    count++;
                }

                if (count == n) {
                    System.out.println(num);
                    break;
                }

                num++;
            }
        }
    }
}