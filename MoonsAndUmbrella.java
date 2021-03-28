import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class MoonsAndUmbrella {
    public static void main(String[] args)
    {
      FastScanner sc=new FastScanner();
      int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            // to do solution
            int ans=0;
            int x=sc.nextInt();
            int y=sc.nextInt();
            String s= sc.next();
            List<Integer> m = new ArrayList<>();
            for (int ind=0;ind<s.length();++ind)
            {
                if (s.charAt(ind)!='?')
                    m.add(ind);
            }
            if(m.size()<=1)
                ans=0;
            else
            {

                for(int j=1;j<m.size();++j)
                {
                    int prev=m.get(j-1);
                    int curr=m.get(j);
                    if(s.charAt(prev)==s.charAt(curr))
                        continue;
                    else if(s.charAt(prev)=='C')
                        ans+=x;
                    else
                        ans+=y;
                }
            }
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
