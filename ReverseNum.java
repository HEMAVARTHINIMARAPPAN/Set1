import java.io.*;
public class ReverseNum
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Integer s = Integer.parseInt(br.readLine());
String str = s.toString();
StringBuffer sb = new StringBuffer(str);
sb.reverse();
System.out.println(sb);
}
}
