import java.util.Scanner;
 
public class codeforce {
    public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
             char[] arr = sc.next().toCharArray();
             for(int i=0;i<arr.length;i++){
                 int d = arr[i] - '0';
                 int k = Math.min(d,9-d);
                 if(i==0 && k==0) continue;
                 arr[i] = (char)(k+'0');
            }
             System.out.println(new String(arr));
        }
    }