import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int max=0;
        int k=0;
        for(int i=0;i<n;i++){
            int ex=sc.nextInt();
            int en=sc.nextInt();
            k-=ex;
            k+=en;
            max = Math.max(max,k);
        }
        System.out.println(max);
    }
}