import java.io.*;
public class LeastNum
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Integer x = Integer.parseInt(br.readLine());
Integer l=Integer.toString(x).length();
String str = x.toString();
System.out.println("How many digits you want to delete");
Integer n = Integer.parseInt(br.readLine());
String str1 = str.substring((l-n),l);
String str2 = str.substring(0,(l-n));
Integer integers = Integer.parseInt(str2);
Integer result = integers-1;
System.out.println(result);


}
}
