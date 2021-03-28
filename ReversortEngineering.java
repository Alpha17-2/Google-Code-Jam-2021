import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ReversortEngineering {
    public static boolean found ;
    public static String ansString;
    public static void main(String[] args)
    {
      FastScanner sc=new FastScanner();
      int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            // to do solution
            found=false;
            ansString="IMPOSSIBLE";
            int n=sc.nextInt();
            int cost = sc.nextInt();;
             String s="";
                for (int j = 1; j <=n ; j++)
                    s+=j;

                check(s,"",cost);
                if (found)
                {
                    System.out.print("Case #"+i+": ");
                    for (int j = 0; j <ansString.length() ; j++) {
                        System.out.print(ansString.charAt(j)+" ");
                    }
                    System.out.println();
                }
                else
                    System.out.println("Case #"+i+": "+ansString);
        }
    }
    public static void check(String str, String ans,int cost)
    {
        if (found)
            return;
        if (str.length() == 0) {
            int count =0;
            List<Integer> m =new ArrayList<Integer>();
            m.add(0);

            for (int temp =0;temp<ans.length();++temp)
                m.add(Integer.valueOf(String.valueOf(ans.charAt(temp))));

            // Checking if count is equal to Cost
            for (int j = 1; j <= ans.length()-1; j++) {
                int ind = -1;
                int min =Integer.MAX_VALUE;
                for(int k=j;k<=ans.length();++k)
                    if(m.get(k)<min)
                    {
                        min=m.get(k);
                        ind=k;
                    }
                Collections.reverse(m.subList(j,ind+1));
                count+=(ind-j)+1;
            }
            if (count==cost)
            {
                found=true;
                ansString=ans;
                return;
            }
            // Checking finished
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            check(ros, ans + ch,cost);
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
