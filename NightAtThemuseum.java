
import java.util.Scanner;

public class NightAtThemuseum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char curr = 'a';
        int ans = 0;
        for(int i =0;i<s.length();i++){
            char next = s.charAt(i);
            int diff = Math.abs(next - curr);
            ans+= Math.min(diff, 26 -diff);
            curr = next ;

        }
        System.out.println(ans);
    }
    
}
