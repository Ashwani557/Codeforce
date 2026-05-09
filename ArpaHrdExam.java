import java.util.*;

public class ArpaHrdExam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(1);
        }
        else if (n % 4 == 1) {
            System.out.println(8);
        }
        else if (n % 4 == 2) {
            System.out.println(4);
        }
        else if (n % 4 == 3) {
            System.out.println(2);
        }
        else {
            System.out.println(6);
        }
    }
}

// without Array



// import java.util.*;
// // import javax.xml.transform.Source;
// public class ArpaHrdExam {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         // long m = (long)Math.pow(8, n);

//         // System.out.println(m%10);

//         if(n==0){
//             System.out.println(1);
//         }

//         int[] arr = {6, 8, 4, 2};
//         for(int i =0;i<arr.length;i++){
//             if(n%4==1){
//                 System.out.println(6);
//             }
//             else if(n%4==2){
//                 System.out.println(8);
//             }
//             else if(n%4==3){
//                 System.out.println(4);

//             }
//             else{
//                 System.out.println(2);
//             }
//         }


//         // System.out.println(arr[(int)(n % 4)]);

        

//     }
    
// }
