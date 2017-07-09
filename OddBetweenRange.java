import java.io.*;
public class OddBetweenRange{
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter");
int x = Integer.parseInt(br.readLine());
int y = Integer.parseInt(br.readLine());
int count =0;
for(int i=x;i<=y;i++)
{
if(i%2 != 0)
System.out.println(i);
}
}
}
