import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sl=0;
 
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            sl= a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            sl = b;
        } else {
            sl = c;
        }
 
        System.out.println(Math.abs(sl-a)+Math.abs(sl-b)+Math.abs(sl-c));
    }
}