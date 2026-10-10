import java.util.*;
 
public class sol118A {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       String s = sc.nextLine();
       String k="aeiouAEIOUyY";
       StringBuilder sb =new StringBuilder();
       for(int i=0;i<s.length();i++){
          if(k.indexOf(s.charAt(i))==-1){
              sb.append('.');
              sb.append(Character.toLowerCase(s.charAt(i)));
            }
          }
       
       System.out.print(sb.toString());
    }
}