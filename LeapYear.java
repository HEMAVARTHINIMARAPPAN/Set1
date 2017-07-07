import java.io.*;
public class LeapYear
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Integer n = Integer.parseInt(br.readLine());
if((n%4==0) && (n%100==0) && (n%400==0))
System.out.println("Leap year");
else
System.out.println("Not a Leap year");
}
}

