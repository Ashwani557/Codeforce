import java.util.*;

public class StringTask {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = s.toLowerCase();
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='y'){
                System.out.print("." + c);
            }
        }
    }
}
