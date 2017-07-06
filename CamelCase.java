import java.io.*;
public class CamelCase
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence");
String str = br.readLine();
String z = "";
Character c = str.charAt(0);
z = z+Character.toUpperCase(c);
for(int i=1;i<str.length();i++)
{
Character c1 = str.charAt(i);
Character c2 = str.charAt(i-1);
if(c2 == ' ')
{
z = z + Character.toUpperCase(c1);
}
else
{
z = z + c1;
}
}
System.out.println(z);
}
}
