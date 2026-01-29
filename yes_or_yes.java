
import java.util.*;
public class yes_or_yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            
        
        String s = sc.next();
        if(s.toLowerCase().equals("yes")){
            System.out.println("yes");

        }
        else{
            System.out.println("no");
        }

    }
    }
}