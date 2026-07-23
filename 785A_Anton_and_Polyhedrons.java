import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      int th=4;
      int cu=6;
      int oct=8;
      int dod=12;
      int ico=20;
      int out=0;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=0;i<n;i++){
        String s = sc.next();
        if(s.equals("Tetrahedron")) out+=th;
        if(s.equals("Cube")) out+=cu;
        if(s.equals("Octahedron")) out+=oct;
        if(s.equals("Dodecahedron")) out+=dod;
        if(s.equals("Icosahedron")) out+=ico;
      }
      System.out.print(out);
    }
}