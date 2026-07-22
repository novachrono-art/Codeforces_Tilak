import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int h= sc.nextInt();
        int k=0;
        for(int i=0;i<n;i++){
            int f = sc.nextInt();
            if(f>h) k+=2;
            else k++;
        }
        System.out.println(k);
    }
}