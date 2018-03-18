import java.util.Scanner;

class SMPSEQ3
{
   public static void main(String[] args)
   {
       Scanner in=new Scanner(System.in);

       int a=in.nextInt();
       int[] arrX=new int[a];
       for(int i=0;i<a;i++)
            arrX[i]=in.nextInt();

       int b=in.nextInt();
       int[] arrY=new int[b];
       for(int j=0;j<b;j++)
            arrY[j]=in.nextInt();

       for(int row=0;row<a;row++)
       {     
               if(!bSearch(arrX[row],arrY))
                    System.out.print(arrX[row]+" ");        
       }      
    }


   static boolean bSearch(int key,int[] arr)
   {
       int l=0;
       int r=arr.length-1;
        int m;
       while(l<=r)
       {
            m=(l+r)/2;
           if(arr[m]==key)
                return true;
           else if(arr[m]>key)
                r=m-1;
           else if(arr[m]<key)
                l=m+1;
       }
       return false;
    }

}
