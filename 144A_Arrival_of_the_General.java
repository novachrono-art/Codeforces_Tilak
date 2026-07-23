import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        int ele  = sc.nextInt();
        arr[i]=ele;
      }
     int max=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE;
     int maxind=-1;
     int minind=-1;
     for(int i=0;i<n;i++){
      if(arr[i]>max){
        max=arr[i];
        maxind=i;
      }
      if(arr[i]<=min){
        min=arr[i];
        minind=i;
      }
     }
     int res=maxind+(n-1-minind);
     if(maxind>minind) res--;
     System.out.print(res);
 
    }
}