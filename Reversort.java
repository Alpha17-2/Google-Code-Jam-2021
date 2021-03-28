import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Reversort {
    public static void main(String[] args)
    {
      FastScanner sc=new FastScanner();
      int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            // to do solution
            int ans=0;
            int n= sc.nextInt();
            List<Integer> m = new ArrayList<>();
            m.add(0);
            for (int ind=1;ind<=n;++ind)  
            {
                    int val= sc.nextInt();
                    m.add(val);
            }
            for (int j = 1; j <= n-1; j++) {
                int ind = -1;
                int min =Integer.MAX_VALUE;
                for(int k=j;k<=n;++k)
                    if(m.get(k)<min)
                    {
                        min=m.get(k);
                        ind=k;
                    }
                Collections.reverse(m.subList(j,ind+1));
                    ans+=(ind-j)+1;
            }
           // System.out.println(m.toString());
            System.out.println("Case #"+i+": "+ans);
        }
    }
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
