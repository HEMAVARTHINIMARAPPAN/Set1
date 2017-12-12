import java.io.*;
public class PrimeBetweenRange{
public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  primeNumbers = "";
		Integer x = Integer.parseInt(br.readLine());
		Integer y = Integer.parseInt(br.readLine());
		int flag=0;
		for(int i=x;i<=y;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j ==0)
				{
					flag =0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}
	}
}
