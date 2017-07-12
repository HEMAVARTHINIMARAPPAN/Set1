import java.io.*;
import java.util.*;
public class NumToAlpha {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count =0,sum=0;
		Integer num = Integer.parseInt(br.readLine());
		String str = num.toString();
		for(int i=0;i<str.length()-1;i++)
		{
		StringBuilder sb = new StringBuilder().append(str.charAt(i)).append(str.charAt(i+1));
		//System.out.println(sb.toString());
		String str1 = sb.toString();
		Integer x = Integer.parseInt(str1);
		//System.out.println(x);
		if(x>0 && x<27){
			String.valueOf((char)(x+64));
		count = count+1;}
		
				}
		if(count>2){
		System.out.println("Translation counts");
		System.out.println(count+2);}
		if(count<=1){
			System.out.println("Translation counts");
			System.out.println(count+1);}

	}}
