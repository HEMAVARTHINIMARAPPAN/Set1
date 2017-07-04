import java.util.*;
public class Number
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
Integer a = s.nextInt();
if(a<0)
{
System.out.println("negative");
}
else if(a>0)
{
System.out.println("positive");
}
else
{
System.out.println("zero");
}
}
}
