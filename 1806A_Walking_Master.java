import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            if (d<b){
                System.out.println(-1);
                continue;
            }
 
            long k=d-b;
            if (a+k<c) {
                System.out.println(-1);
                continue;
            }
            System.out.println(k+(a+k-c));
        }
    }
}