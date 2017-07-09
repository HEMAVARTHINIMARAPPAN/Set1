import java.io.*;
public class Teacher
{
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int flag = 0,z=0;
System.out.println("Enter n");
int n = Integer.parseInt(br.readLine());
System.out.println("Enter pair");
int y = Integer.parseInt(br.readLine());
for(int i=0;i<2*n;i++)
{
z = 2*n-i;
if(y != z)
flag=1;
}
if(flag == 1)
System.out.println(y+" pair for "+z+" days");
}
}
