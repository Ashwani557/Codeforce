import java.util.*;

public class PetyaAndString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        String S1 = sc.next();
        String S2 = sc.next();

        for (int i = 0 ; i < S1.length() ; i++){

            if(S1.toLowerCase().charAt(i) > S2.toLowerCase().charAt(i)){
                System.out.println("1");
                return;


            }
            else if (S1.toLowerCase().charAt(i) < S2.toLowerCase().charAt(i) ){
                System.out.println("-1");
                return;


            }
       
        }
        System.out.println(0);

    

    }
    
}
