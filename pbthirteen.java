import java.util.Arrays;
import java.util.Scanner;

public class pbthirteen {
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      int n = s.nextInt();
	  
      int [] a = new int[n];
      System.out.println("Enter the elements of the array:");
      
      for(int i=0; i<n; i++ ) {
         a[i] = s.nextInt();
      }
	  System.out.println("Enter the search number:");
      int b=s.nextInt();
	  
	  for(int i=0; i<n; i++ ) {
		 if(b==a[i]){
			 b=1;
			 break;
		 }
			 
		  
	  }
	  if(b==1)
		 System.out.println("Element found"); 
	 else
		 System.out.println("Not found");
      System.out.println(Arrays.toString(a));
   }
}