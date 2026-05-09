
import java.util.*;

public  class YourName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         for(int i=0;i<t;i++){
            int n = sc.nextInt();
            String s = sc.next();
            String p = sc.next();

            char[]a = s.toCharArray();
            char[]b= p.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            



         }
    }
    
}
