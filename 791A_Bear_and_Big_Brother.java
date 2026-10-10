import java.util.*;
 
public class sol791A {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       long a=sc.nextInt();
       long b=sc.nextInt();
       int ct=0;
       while(a<=b){
           a=a*3;
           b=b*2;
           ct++;
       }
       System.out.print(ct);
    }
}