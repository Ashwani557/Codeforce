import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // first read n
        String s = sc.next();   // then string
        
        s = s.toLowerCase();    // convert to lowercase
        
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        
        if (set.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
