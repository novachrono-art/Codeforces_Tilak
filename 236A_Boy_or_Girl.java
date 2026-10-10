import java.util.*;
 
public class sol236A {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       String s = sc.nextLine();
       int fr[] =new int[26];
       for(int i=0;i<s.length();i++){
         fr[s.charAt(i)-'a']++;
       }
       int ct=0;
       for(int i=0;i<fr.length;i++){
         if(fr[i]!=0) ct++;
       }
       if(ct%2==0) System.out.print("CHAT WITH HER!");
       else System.out.print("IGNORE HIM!");
    }
}