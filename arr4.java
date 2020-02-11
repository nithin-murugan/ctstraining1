import java.util.*;  
class arr4{  
public static void main(String args[]){  
ArrayList<String> alist=new ArrayList<String>(5);
alist.add("learning");
alist.add("java");


System.out.println("ArrayList String="+alist);
int value1=alist.indexOf("java");
System.out.println("Index retrived of java="+value1);
System.out.println("AT is not present");
int value2=alist.indexOf("AT");
System.out.println("Index retrived of java="+value2);
}  
}  