import java.util.Scanner;

public class ordinaryNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            int count = 0;

            for (int i = 1; i <= 9; i++) {

                long num = i;

                while (num <= n) {
                    count++;
                    num = num * 10 + i;
                }
            }

            System.out.println(count);
        }
    }
}