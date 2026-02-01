
import java.util.Scanner;

public class APlusBAgain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        for (int i = 0; i<n; i++){
            int num = sc.nextInt();

            int num1 = num%10;
            int num2 =  (num/10);

            int add = num1+num2;
            System.out.println(add);


    

        
        }
    }
    
}
