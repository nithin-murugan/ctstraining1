import java.util.*;  
class ts2{  
 public static void main(String args[]){  
  //Creating and adding elements  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi"); 
  
  
  Iterator itr=al.descendingIterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  