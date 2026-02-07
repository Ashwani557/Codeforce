import java.util.*;
public class Yetanother {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =0; i<n; i++){
            long a = sc.nextInt();
        long b = sc.nextInt();
        long diff = Math.abs(b-a);
        long move = (diff + 9)/10;
        System.out.println(move);

        }
        



    }
    
}
