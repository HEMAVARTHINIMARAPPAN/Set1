import java.io.*;
public class CountPrime
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int start = Integer.parseInt(br.readLine());
int end = Integer.parseInt(br.readLine());
int flag=0;
int count=0;
int n = Integer.parseInt(br.readLine());
int x = n/2;
for(int i=start;i<=end;i++)
{
if(n%i == 0)
{
flag = 1;
break;
}
}
if(flag == 0)
{
count++;
System.out.println(count);
}
}
}
