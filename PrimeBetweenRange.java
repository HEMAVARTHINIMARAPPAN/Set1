import java.io.*;
public class PrimeBetweenRange{
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String  primeNumbers = "";
Integer x = Integer.parseInt(br.readLine());
Integer y = Integer.parseInt(br.readLine());
for (int i = x; i <= y; i++)         
{
int count=0; 	  
for(int n =i; n>=x; n--)
{
if(i%n==0)
{
count++;
}
}
if (count == 2)
{
primeNumbers = primeNumbers + i + " ";
}	
}	
System.out.println(primeNumbers);
}
}
