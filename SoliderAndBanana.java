
import java.util.Scanner;

public class SoliderAndBanana {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //cost of 1st banana
        int n = sc.nextInt(); // total paisa
        int w = sc.nextInt(); // kitna kela lega 


        int cost = k*w*(w+1 )/2;
        int borrow = Math.max(0,cost -n );

        
    System.out.println(borrow);
    
}
}
