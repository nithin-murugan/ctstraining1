import java.util.*;  
public class mp1 {  
public static void main(String[] args) {  
    Map map=new HashMap();  
    //Adding elements to map  
    map.put(1,"Amit");  
    map.put(5,"Rahul");  
    map.put(2,"Jai");  
    map.put(6,"Amit");  
   System.out.println(" "+map);
   map.replace(1,"nithin");
    System.out.println(" "+map);
    map.remove(1,"nithin");
    System.out.println(" "+map);
    
}  
}  