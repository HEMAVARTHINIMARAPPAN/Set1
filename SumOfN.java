import java.io.*;
public class SumOfN{
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter");
int sum = 0;
int x = Integer.parseInt(br.readLine());
int n = Integer.parseInt(br.readLine());
for(int i=x;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
