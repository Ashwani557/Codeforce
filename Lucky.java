import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int num = sc.nextInt();

            int d1 = num / 100000;
            int d2 = (num / 10000) % 10;
            int d3 = (num / 1000) % 10;
            int d4 = (num / 100) % 10;
            int d5 = (num / 10) % 10;
            int d6 = num % 10;

            int firstSum = d1 + d2 + d3;
            int lastSum  = d4 + d5 + d6;

            if (firstSum == lastSum)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
