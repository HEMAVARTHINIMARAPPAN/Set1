import java.io.*;
import java.util.*;
public class LargestConcatInArray
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Integer i,j,val;
String str ="",sum ="";
Integer n = Integer.parseInt(br.readLine());
ArrayList<Integer> list = new ArrayList<Integer>();
for(i=0;i<n;i++)
{
Integer b = Integer.parseInt(br.readLine());
list.add(b);
}
Collections.sort(list,Collections.reverseOrder());
for(Integer newint : list)
{
		 str += newint.toString();
}
StringBuffer sbb = new StringBuffer(str);
str = sbb.reverse().toString();
for(i=0,val = str.length()-1 ; i<str.length() && i%3==0 && val>=3 ; i+=3,val-=3)
{
	sum += str.substring(i,i+3);
	sum += ",";
}
sum += str.substring(i);

StringBuffer sb = new StringBuffer(sum);
System.out.println(sb.reverse());

}}
