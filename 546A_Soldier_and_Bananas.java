import java.util.*;
 
public class sol546A {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       long k=sc.nextInt();
       long n=sc.nextInt();
       long w=sc.nextInt();
       long sum=0;
       for(long i=1;i<=w;i++){
          sum+=i*k;
       }
       if(sum<=n) System.out.print(0);
       else System.out.print(sum-n);
    }
}