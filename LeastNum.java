import java.io.*;
import java.util.*;
public class LeastNum{
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Integer n,i,p,sub;
String ns,str="";		
ArrayList<Integer> list = new ArrayList<Integer>();
System.out.println("Enter");
n = Integer.parseInt(br.readLine());
while(n>9){
sub = n%10;
n =n/ 10;
list.add(sub);
}
if(n>=0)
list.add(n);
Collections.sort(list);
for(Integer inte : list)
str += inte.toString();
System.out.println(str);
System.out.println("Deleting num");
p = Integer.parseInt(br.readLine());
System.out.println(str.substring(0,str.length()-p));
				
	}

}
