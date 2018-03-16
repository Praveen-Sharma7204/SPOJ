import java.util.Scanner;

class CPTTRN3
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();

            for(int j=0;j<(3*a)+1;j++)
            {
                for(int k=0;k<(3*b)+1;k++)
                {
                    if(j%3 ==0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        if(k%3==0)
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
    }
}
