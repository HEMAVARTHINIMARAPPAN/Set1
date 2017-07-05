import java.io.*;
public class StrToNum 
{
	public static void main(String args[])throws IOException
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String z = "";
			String x = br.readLine();
			char c[] = x.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if((c[i] == '0' ) || (c[i] == '1' ) || (c[i] == '2' ) || (c[i] == '3' ) || (c[i] == '4' ) || (c[i] == '5' ) || (c[i] == '6' ) || (c[i] == '7' ) || (c[i] == '8' ) || (c[i] == '9' ))
				{
					z = z+c[i];
				}
			}
		
			Integer n = Integer.parseInt(z);
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println("NOOO");
		}
		
		
	}
}
