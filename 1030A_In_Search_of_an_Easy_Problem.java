import java.util.*;
 
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int ct=0;
     for(int i=0;i<n;i++){
       int num=sc.nextInt();
       if(num==1) ct++;
     }
     if(ct>=1) System.out.print("HARD");
     else System.out.print("EASY");
    }
}