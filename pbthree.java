import java.util.Scanner;

public class pbthree
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter a number : ");
      int number = sc.nextInt();
      // java odd or even
      String strInput = (number % 2 == 0) ? "even" : "odd";   
      System.out.println(number + " is " + strInput);
      sc.close();
   }
}

