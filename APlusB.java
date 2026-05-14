
import java.util.*;

public class APlusB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String b = sc.next();
            int a = Integer.valueOf(b);
            int num1 = a%10;
            int num2 =a/10;
            System.out.println(num1+num2);
        }

    }
    
}
