import java.util.*;
 
public class sol977A {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       long n=sc.nextInt();
       long k=sc.nextInt();
       for(int i=0;i<k;i++){
         long dig=n%10;
         if(dig==0){
          n=n/10;
         }
         else{
          n=n-1;
         }
       }
       System.out.print(n);
    }
}