
import java.util.Scanner;

public class MultbytwoDivbySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while(t-- > 0){
            int count = 0;
            long n = sc.nextLong();
            while(n!=1){
            if(n%6==0){
                n=n/6;
                count ++;
            }
            else if(n%3==0){
                n=2*n;
                count++;
            }
            else{
                break;
            }
        }

            if(n==1){
                System.out.println(count);
            }
            else{
                System.out.println(-1);
            }
              

        }
    }
    
}
