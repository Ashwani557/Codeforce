import java.util.Scanner;

public class InSearchOfEasyProb {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;   // 0 = EASY, 1 = HARD

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num == 1){
                flag = 1;
            }
        }

        if(flag == 1)
            System.out.println("HARD");
        else
            System.out.println("EASY");
    }
}
