import java.io.*;
public class Factorial
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Integer x = Integer.parseInt(br.readLine());
Integer fact = 1;
for (int i=1;i<=x;i++)
{
fact = fact*i;
}
  System.out.println(fact);
}
}
