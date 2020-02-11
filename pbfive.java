import java.util.Scanner;

public class pbfive
{
    public static void main(String args[])
    {
    	
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<3; i++) { 
           System.out.print("Enter Marks of Subject");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        
        
        avg = total/3;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("First class");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("Second class");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("Pass");
        }
        else
        {
            System.out.print("Fail");
        }
    }
}