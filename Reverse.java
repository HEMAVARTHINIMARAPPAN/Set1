import java.io.*;
public class Reverse
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
StringBuffer sb = new StringBuffer(s);
sb.reverse();
System.out.println(sb);
}
}
