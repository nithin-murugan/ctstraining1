import java.io.*; 
  
class array { 
    public static void main(String args[]) 
    { 
        int arr[] = { 1,2,3,4}; 
		 int arr1[] = { 7,3,4,10}; 
        
  
       
        for (int i = 0; i < arr.length; i++) { 
		for(int j=0;i< arr.length;j++){
			if(arr[i]==arr1[j]){
				System.out.print(" "+ arr[i]); 
			
            }
		}	 
        } 
		}
       
		
    
} 