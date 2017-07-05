import java.io.*;
public class Palindrome {
public static void main(String args[])throws IOException
{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	Integer x = Integer.parseInt(br.readLine());
	String y = x.toString();
	StringBuffer sb = new StringBuffer(y);
	if(y.equals(sb.reverse().toString()))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}
	
}
}
