import java.util.*;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        boolean condition = true;
        
        
        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                condition = false;
                break;
            }
        }
        
        if (condition) {
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                
                if (Character.isUpperCase(ch)) {
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(Character.toUpperCase(ch));
                }
            }
            
            System.out.println(result);
        } else {
            System.out.println(s);
        }
    }
}