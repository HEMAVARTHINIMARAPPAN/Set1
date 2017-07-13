import java.io.*;
import java.util.*;
public class FirstRepeatedElementInArray {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer i,a,n,j,k,count = null,m,flag =0,s;
		n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(i=0;i<n;i++)
		{
			a = Integer.parseInt(br.readLine());
			list.add(a);
			set.add(a);
		}
		ArrayList<Integer> list1 = new ArrayList<Integer>(set);
		ArrayList<Integer> newarr = new ArrayList<Integer>();
		for(j=0;j<list1.size();j++)
		{
			count=0;
			for(k=0;k<n;k++)
			{
			if(list1.get(j) == list.get(k))
				count++;
		    }	
		newarr.add(count);
		}
		System.out.println("Unique elements in array:");
	    for(s=0;s<newarr.size();s++)
		{
		if(newarr.get(s) >1){
			System.out.println(list1.get(s));	
		break;}
		}
}
}
