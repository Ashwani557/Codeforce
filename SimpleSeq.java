import java.util.*;
public class SimpleSeq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        for(int a = 0; a< o ;a++){
            int v = sc.nextInt();
            for(int p = v ; p>0 ; p--){
                System.out.println(p);
            }
        }
    }
}