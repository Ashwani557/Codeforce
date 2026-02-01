import java.util.*;
public class Word{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int lowerCase = 0;
        int uppercase = 0;
        String s = sc.next();
        
        
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);

            if (Character.isLowerCase(str)){
                lowerCase ++;

            }
            else if (Character.isUpperCase(str)){
                uppercase ++;
            }

            
            
        }
        if (lowerCase >= uppercase){
            System.out.println(s.toLowerCase());

        }
        else if (lowerCase < uppercase){
            System.out.println(s.toUpperCase());
        }

    }
}