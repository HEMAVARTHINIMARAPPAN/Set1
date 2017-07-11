import java.io.*;
import java.util.*;
public class DisplayIntegerInArrayEqualsIndex {
	public static void main(String args[])throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Integer i,n,a,index;
	n = Integer.parseInt(br.readLine());
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(i=0;i<n;i++)
	{
		a = Integer.parseInt(br.readLine());
		list.add(a);
		Collections.sort(list);
	}
	System.out.println(list);
	System.out.println("Enter the Index");
	index = Integer.parseInt(br.readLine());
	if(index>=n)
		System.out.println("No Element");
	else
	System.out.println(list.get(index));
	


	
	}

}
