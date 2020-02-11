import java.util.*;
public class arrayfour{
public static void main(String[] args) throws Exception {
	int b,temp=0,c=0,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
int n=sc.nextInt();
	System.out.println("enter values");
	
    int a[] = new int[n];
    
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
	System.out.println("enter b");
        b=sc.nextInt();
      
      cc:for(i=0;i<=n;i++){
             if(a[i]==b){
             System.out.println(i);
             break;}
			 else{
			 temp=b;
			 for(j=0;j<=n;j++){
				 if(temp>a[j] && temp<a[j+1]){
					 c=j+1;
					 System.out.println(c);
					break cc;
					 
					 
				 }
				 
				 
			 }
			  
			 }
				 

	  }
        
     }
}

