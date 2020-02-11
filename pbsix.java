import java.util.Scanner; 
public class pbsix 
{ 
    public static void main(String[] args) 
    { 
        
        Scanner sc = new Scanner(System.in); 
   
       
        int n = sc.nextInt(); 
		int d=n%10;
   
        if(d==0)
			System.out.println("zero");
		else if(d==1)	
		   System.out.println("one");
	   else if(d==2)	
		   System.out.println("two");
	   else if(d==3)	
		   System.out.println("three");
	   else if(d==4)	
		   System.out.println("four");
	   else if(d==5)	
		   System.out.println("five");
	   else if(d==6)	
		   System.out.println("six");
	   else if(d==7)	
		   System.out.println("seven");
	   else if(d==8)	
		   System.out.println("eight");
	   else if(d==9)	
		   System.out.println("nine");
		
		
    } 
} 