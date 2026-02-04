
import java.util.*;

public class BitplusPlus {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int x = 0;
         int l = sc.nextInt();
         for (int i = 0; i<=l ; i++){
            String s = sc.next();
            if ( s.contains("++")){
               x++;
            }
            else{
               x--;
            

            }
            System.out.println(x);

         }


    }
    
}
