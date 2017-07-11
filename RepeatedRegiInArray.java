import java.io.*;
import java.util.*;
public class RepeatedRegiInArray
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(br.readLine());
		Integer i,j;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(i=0;i<n;i++)
		{
			Integer  a = Integer.parseInt(br.readLine());
			list.add(a);
			
		}
		//Collections.sort(list);
		Set<Integer> listset = new HashSet<>();
		for(Integer s : list)
		{
			if(listset.add(s) == false)
				System.out.println(s);
		}
		}
		}
