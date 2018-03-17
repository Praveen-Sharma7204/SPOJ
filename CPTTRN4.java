import java.util.Scanner;

class CPTTRN4
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        


        int n=in.nextInt();

        for(int i=0;i<n;i++)
        {
            int r=in.nextInt();
            int c=in.nextInt();
            int h=in.nextInt();
            int w=in.nextInt();

            for(int j=0;j<((r*h)+r)+1;j++)
            {
                for(int k=0;k<((c*w)+c)+1;k++)
                {
                    if(j%(h+1)==0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        if(k%(w+1)==0)
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
            System.out.println();



        }
    }
}
