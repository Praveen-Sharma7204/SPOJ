import java.util.*;
import java.lang.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            
            for(int j=0;j<a;j++)
            {
                for(int k=0;k<b;k++)
                {
                    if(b>1)
                    {
                        if(j%2==0)
                        {
                            if(k%2==0)
                        	System.out.print("*");
                            else
                        	System.out.print(".");
                        }
                        else if(j%2!=0)
                        {
                            if(k%2==0)
                        	System.out.print(".");
                            else
                        	System.out.print("*");
                        }
                    }
                    if(b==1)
                    {
                        if(j%2==0)
                            System.out.print("*");
                        else
                             System.out.print(".");
                            
                    }
                    
                 
                }
                System.out.println();
            }
    }
}
}
