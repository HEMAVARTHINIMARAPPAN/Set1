import java.io.*;
public class Swap 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String z = "";
		int i;
		if(s.length()%2 == 0){
			for(i=0;i<s.length()-1;i+=2){
				z += s.charAt(i+1);
				z += s.charAt(i);}
		}
		else{
			for(i=0;i<s.length()-2;i+=2){
				z += s.charAt(i+1);
			z += s.charAt(i);}
			z += s.charAt(i);
		}
		
		System.out.println(z);
	}
}
