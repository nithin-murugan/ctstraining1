import java.util.*;  
class ts3{  
 public static void main(String args[]){  
 TreeSet<Integer> set=new TreeSet<Integer>();  
         set.add(72);  
         set.add(32);  
         set.add(12); 
 set.add(2);  		 
         System.out.println("Lowest Value: "+set.pollFirst());  
         System.out.println("Highest Value: "+set.pollLast());  
 }  
} 