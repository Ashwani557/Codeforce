
import java.util.*;

public class Division {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i<n; i++){
            int d = sc.nextInt();
            if (d >= 1900){
                
                System.out.println("Division 1");
            
            }
            else if ( 1600 <= d && d <= 1899){
                System.out.println("Division 2");


            }
            else if ( 1400 <= d && d <= 1599){
                System.out.println("Division 3");
            }

            else if ( d <= 1399){
                System.out.println("Division 4");

            }

        }
        


    }
}