import java.util.*;  
class arr3{  
public static void main(String args[]){  
ArrayList<Integer> alist=new ArrayList<Integer>();
alist.add(6);
alist.add(1);
alist.add(2);
 
boolean flag1=alist.contains(6);
if(flag1==true){ 
System.out.println("alist contains elements" );}
else{ 
System.out.println("alist does notcontains elements2");}
boolean flag2=alist.contains(5);
if(flag2==true){ 
System.out.println("alist contains elements5");}
else{ 
System.out.println("alist does notcontains elements");  }
}  
}  