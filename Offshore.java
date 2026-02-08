import java.io.*;
import java.util.*;

public class Offshore {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() throws Exception {
            while(st==null||!st.hasMoreElements())
                st=new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        long nextLong() throws Exception { return Long.parseLong(next()); }
        int nextInt() throws Exception { return Integer.parseInt(next()); }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();

        while(T-- > 0){
            int n = fs.nextInt();
            long x = fs.nextLong();
            long y = fs.nextLong();

            long[] a = new long[n];
            for(int i=0;i<n;i++) a[i] = fs.nextLong();

            long totalTransferMoney = 0;
            for(int i=0;i<n;i++)
                totalTransferMoney += (a[i] / x) * y;

            long ans = 0;
            for(int i=0;i<n;i++){
                long cur = a[i] + totalTransferMoney - (a[i] / x) * y;
                ans = Math.max(ans, cur);
            }

            System.out.println(ans);
        }
    }
}
