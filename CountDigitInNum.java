import java.io.*;
public class CountDigitInNum{
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter");
int count = 0;
int x = Integer.parseInt(br.readLine());
while(x>0)
{
int c = x%10;
x = x/10;
count++;
}
System.out.print(count);
}
}
