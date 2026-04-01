
import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        int count = 0;
        int maxcount = 0;
        for(int i =0;i<t;i++){
            int n = Sc.nextInt();
            int [] arr = new int[n];
            for(int j =0;j<n;j++){
                arr[j]=Sc.nextInt();

            }

            for(int m =0;m<n;m++){
                if(arr[m]==0 ){
                    count++;
                }
                else{
                    maxcount = Math.max(count,maxcount);
                    count = 0;
                }

                

            }
            maxcount = Math.max(count,maxcount);
            
            



        }
        System.out.println(maxcount);

    }
    
}
