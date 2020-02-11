import java.time.*;
public class year{
public static void main(String[] args){
MonthDay month=MonthDay.now();
boolean b=month.isValidYear(2012);
System.out.println(b);
}
}