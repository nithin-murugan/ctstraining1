import java.util.Scanner; 
public class pbnine 
{ 
    public static void main(String[] args) 
    { 
        
        Scanner sc = new Scanner(System.in); 
   int d,rev=0;
   
       
        int n = sc.nextInt(); 
		
		while(n>0){
	     d=n%10;
		 rev=rev*10+d;
		n=n/10;}
		System.out.println(rev);
        
		
		
    } 
} 