import java.io.*;
public class Alpha
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamRedaer(System.in));
		String str = br.readLine();
		if((str>=a && str<=z) || (str>=A && str<=Z))
			System.out.println("Alphabet");
		else
			System.out.println("Not an Alphabet");
	}
	
}
