import java.util.Scanner; 
public class pbone 
{ 
    public static void main(String[] args) 
    { 
        
        Scanner sc = new Scanner(System.in); 
   double d,r;
   
       
        d = sc.nextDouble(); 
		r=d%1;
		d=d-r;
		System.out.println(d);
        System.out.println(r);
		
		
    } 
} 