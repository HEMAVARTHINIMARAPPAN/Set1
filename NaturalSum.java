import java.io.*;
public class NaturalSum{
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter");
int sum = 0;
int n = Integer.parseInt(br.readLine());
for(int i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
