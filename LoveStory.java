
import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        String a = "codeforces";
        for(int i = 0 ;i<t;i++){

            String s = sc.next().toLowerCase();
            int count = 0;
            for(int j = 0;j<s.length();j++){
                
                   if( s.charAt(j)!=a.charAt(j)){
                        count++;
                    
                }

            


        }
        System.out.println(count);
    }
}
}
    

