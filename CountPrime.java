import java.io.*;
public class CountPrime
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("\nEnter the range : ");
    int range=Integer.parseInt(br.readLine());
    for(int i=2;i<=range;i++)
    {
      int flag=0;
      for(int j=2;j<i;j++)
      {
        if(i%j==0)
        {
          flag=1;
        }
      }
      if(flag==0)
        System.out.print(i+" ");
    }
}
}
