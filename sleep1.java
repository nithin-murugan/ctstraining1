class sleep1 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}
	catch(InterruptedException e)
	{System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  sleep1 t1=new sleep1();  
  sleep1 t2=new sleep1();  
   
  t1.start();  
  t2.start();  
 }  
}  