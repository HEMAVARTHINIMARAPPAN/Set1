import java.io.*;
public class PowerOfNum{
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter");
int sum = 1;
int x = Integer.parseInt(br.readLine());
int y = Integer.parseInt(br.readLine());
for(int i=1;i<=y;i++)
{
	sum = sum*x;
	
}
System.out.println(sum);
}
}
