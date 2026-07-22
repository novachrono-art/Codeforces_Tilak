import java.util.*;
 
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int ct=0;
     for(int i=0;i<n;i++){
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();
        int f3 = sc.nextInt();
        int sum = f1+f2+f3;
        if(sum>=2) ct++;
     }
     System.out.print(ct);
    }
}