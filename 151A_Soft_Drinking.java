import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // number of friends
        int n = sc.nextInt();
        // number of bottels
        int k =sc.nextInt();
        // number of ml in each bottle
        int l= sc.nextInt();
        // number of limes
        int c = sc.nextInt();
        // number of slices
        int d = sc.nextInt();
        // amount of salt
        int p= sc.nextInt();
        int nl= sc.nextInt();
        int np = sc.nextInt();
        int tdrink = (k*l)/nl;
        int tslice = c*d;
        int tsalt = p/np;
        System.out.println(Math.min(tdrink,Math.min(tslice,tsalt))/n);
    }
}