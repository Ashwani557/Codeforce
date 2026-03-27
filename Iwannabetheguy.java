
import java.util.*;

public class Iwannabetheguy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> l = new HashSet<>();
        
            int x = sc.nextInt();
            for(int j =0;j<x;j++){
                l.add(sc.nextInt());

            }

            int y = sc.nextInt();
            for(int j =0;j<y;j++){
                l.add(sc.nextInt());
            }
            if(l.size()==n){
                System.out.println("I become the guy.");
            }
            else{
                System.out.println("Oh, my keyboard!");
            }
            sc.close();
        

        
    }
    
}
