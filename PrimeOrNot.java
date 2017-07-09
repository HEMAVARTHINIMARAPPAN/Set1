import java.io.*;
public class PrimeOrNot{
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter");
int flag =0;
int x = Integer.parseInt(br.readLine());
int y = x/2;
for(int i =2;i<=y;i++)
{
if(x%i == 0)
{
System.out.println("Not Prime");
flag =1;
break;
}
}
if(flag ==0)
System.out.println("Prime");
}
}
