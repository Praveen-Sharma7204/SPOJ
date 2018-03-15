
import java.util.*;



class CPTTRN2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			if(a==b)
			{
			    for(int j=0;j<a;j++)
			    {
			        for(int k=0;k<a;k++)
			        {
			            if(j==0 || j==a-1)
			            {
			                System.out.print("*");
			             }
			             else
			             {
			                 if(k==0 || k==a-1)
			                 {
			                     System.out.print("*");
			                 }
			                 else
			                 {
			                     System.out.print(".");
			                 }
			             }
			         }
			         System.out.println();
			     }
			 }
			 else
			 {
			     for(int j=0;j<a;j++)
			     {
			        for(int k=0;k<b;k++)
			        {
			            System.out.print("*");
			            }
			            System.out.println();
			         }
			     }
			 }
			            
			
		}
		
		
	}
