
import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        

        while (t-- > 0) {
            char[] a = sc.next().toCharArray();
            char[] b = sc.next().toCharArray();

            
            char temp = a[0];
            a[0] = b[0];
            b[0] = temp;

            System.out.println(new String(a) + " " + new String(b));
        }

        sc.close();

    }
    
}
