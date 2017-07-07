import java.io.*;
public class LargestNum
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Integer a,b,c;
a = Integer.parseInt(br.readLine());
b = Integer.parseInt(br.readLine());
c = Integer.parseInt(br.readLine());
if(a>b && a>c)
System.out.println(a);
if(b>c && b>a)
System.out.println(b);
if(c>b && c>a)
System.out.println(c);
}
}
