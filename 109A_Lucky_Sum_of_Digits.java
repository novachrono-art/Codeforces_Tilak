import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class sol109A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
 
        int count4 = -1;
        int count7 = -1;
        int minTotal = Integer.MAX_VALUE;
        for (int j = 0; 7 * j <= n; j++) {
            int remainder = n - (7 * j);
            if (remainder % 4 == 0) {
                int i = remainder / 4;
                if (i + j < minTotal) {
                    minTotal = i + j;
                    count4 = i;
                    count7 = j;
                }
            }
        }
 
        if (count4 == -1) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count4; i++) {
                sb.append('4');
            }
            for (int i = 0; i < count7; i++) {
                sb.append('7');
            }
            System.out.println(sb.toString());
        }
    }
}