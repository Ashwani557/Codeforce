
import java.util.*;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String  ,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            String s = sc.next().toLowerCase();
           
            
            if(!map.containsKey(s)){
                map.put(s,1);
                System.out.println("OK");
            }
            else{
                int count = map.get(s);
                System.out.println(s+count);
                map.put(s,count+1);
            }


        }

    }
}
