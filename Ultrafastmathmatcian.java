import java.util.*;
public class Ultrafastmathmatcian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String result = "";
        for (int i = 0; i < a.length(); i++) {
             if(a.charAt(i)==b.charAt(i)){
               result += "0";
             }
             else{
               result += "1";
             }
            
        }
        System.out.println(result);
       

    }
    
}
