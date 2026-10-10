import java.util.*;
import java.io.*;
public class Main{
public static void main(String[] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine().trim());
StringBuilder sb=new StringBuilder();
while(t-->0){
StringTokenizer st=new StringTokenizer(br.readLine());
int n=Integer.parseInt(st.nextToken());
int k=Integer.parseInt(st.nextToken());
int[] cnt=new int[n+2];
st=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++){
int x=Integer.parseInt(st.nextToken());
cnt[x]++;
}
boolean ans=false;
for(int v=0;v<=n+1;v++){
if(cnt[v]<2*k){
if(cnt[v]==2*k-1)ans=true;
break;
}
}
sb.append(ans?"YES":"NO").append("\n");
}
System.out.print(sb);
}
}