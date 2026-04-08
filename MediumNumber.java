
import java.util.Scanner;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        
        for(int i = 0; i<t;i++){
            int a = Sc.nextInt();
            int b = Sc.nextInt();
            int c = Sc.nextInt();
            int result ;
             
            if ((a >= b && a <= c) || (a >= c && a <= b)) {
                result = a;
            } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
                result = b;
            } else {
                result = c;
}
            System.out.println(result);

        }
        Sc.close();   

    }
    
}

// while (t-- > 0) {
//             int[] arr = new int[3];
//             arr[0] = sc.nextInt();
//             arr[1] = sc.nextInt();
//             arr[2] = sc.nextInt();
            
//             Arrays.sort(arr);
//             System.out.println(arr[1]);
