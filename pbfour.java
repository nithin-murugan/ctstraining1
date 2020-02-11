import java.util.Scanner;
public class pbfour
{
    public static void main(String[] args) 
    {
        int a, b, c, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all three numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
       if(a>b&&a>c){
		   System.out.println("first largest number"+a);
		   if(b>c){
			   System.out.println("second largest number"+b);
			   }
		   else{
			    System.out.println("second largest number"+c);
		   }
		   
		  }
		  else if(b>a && b>c){
			  System.out.println("first largest number"+b);
		   if(a>c){
			   System.out.println("second largest number"+a);
			   }
		   else{
			    System.out.println("second largest number"+c);
		   }
			  
		  }
		  else if(c>a && c>b){
			  System.out.println("first largest number"+b);
		   if(a>b){
			   System.out.println("second largest number"+a);
			   }
		   else{
			    System.out.println("second largest number"+c);
		   }
			  
		  }
        
    }
}