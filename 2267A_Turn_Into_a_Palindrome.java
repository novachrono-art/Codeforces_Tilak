import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            String s = br.readLine().trim();
 
            int ans = 0;
            for (int i = 0; i < n / 2; i++) {
                char a = s.charAt(i);
                char b = s.charAt(n - 1 - i);
                if (a != b) {
                    ans += (a != c ? 1 : 0) + (b != c ? 1 : 0);
                }
            }
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}