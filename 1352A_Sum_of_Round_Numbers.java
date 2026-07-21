import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=0;i<n;i++){
           int num = sc.nextInt();
           ArrayList<Integer> res = new ArrayList<>();
           int p=1;
           while(num>0){
               int digit = num%10;
               if(digit!=0){res.add(digit*p);}
               num=num/10;
               p*=10;
           }
           System.out.println(res.size());
           for(int x: res){System.out.print(x+" ");}
           System.out.println();
           }
       }
    }