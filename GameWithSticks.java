
import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // int sum = n + m;
        // int prod = n*m;
        int moves = Math.min(n, m);

        if(moves%n==1){
            System.out.println("Akshat");
        }
        else{
            System.out.println("Malvika");
        }
    }
    
}
