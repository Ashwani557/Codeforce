
import java.util.Scanner;

public class YogurtSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = (n / 2) * Math.min(2 * a, b)
                    + (n % 2) * a;

            System.out.println(ans);
        }
    }
    
}
