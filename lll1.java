import java.util.*;  
class lll1{  
 public static void main(String args[]){  
  LinkedHashSet<String> al=new LinkedHashSet<String>();  
  al.add("nithin");  
  al.add("murugan");  
   
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  