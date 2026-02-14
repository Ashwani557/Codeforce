import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String prev = sc.next();   // first magnet
        int count = 1;             // at least one group exists
        
        for (int i = 1; i < n; i++) {
            String curr = sc.next();
            
            if (!curr.equals(prev)) {
                count++;           // new group formed
            }
            prev = curr;
        }
        
        System.out.println(count);
    }
}
