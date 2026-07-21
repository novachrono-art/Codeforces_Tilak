import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int hired = 0;
       int crime = 0;
       for(int i=0;i<n;i++){
           int p =sc.nextInt();
           if(p>0) hired+=p;
           if(p<0){
               if(hired>0) hired--;
               else crime++;
           }
       }
       System.out.println(crime);
    }
}