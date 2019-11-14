import java.util.*;

class SubArray
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
    
   System.out.println("Enter size:");
   int n=sc.nextInt();
  
  
   int arr[]=new int[n];
   
   System.out.println("Enter Array:");
   for(int i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
   }
   
   System.out.println("Enter key");
   int key=sc.nextInt();
     n=(n-key)+1;
	 int result=n*(n+1)/2;
	 System.out.println("result :" + result);
 }


}