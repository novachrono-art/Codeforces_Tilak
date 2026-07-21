import java.util.Scanner;
 
public class codeforce {
    public static void main(String[] args) {
 
 
Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i=1;i<=n;i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if(a==(b+c) || b==(c+a) || c==(a+b)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}