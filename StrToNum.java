import java.io.*;
public class StrToNum 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		Integer n = Integer.parseInt(x);
		System.out.println(n+3);
		
		
	}
}
