import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DayFinder1 
{
	public static void main(String[] args) throws ParseException 
	{
		String str[]= new String[]{"2020-02-04","2020-04-03","2019-11-06"};
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=sdf.parse(str[0]);
		SimpleDateFormat sdfr=new SimpleDateFormat("EEEE");
		String str2=sdfr.format(d1);
		System.out.println(str2);
	    SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		Date d2=sdf2.parse(str[1]);
		String str3=sdfr.format(d2);
		System.out.println(str3);
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd");
		Date d3=sdf3.parse(str[2]);
		String str4=sdfr.format(d3);
		System.out.println(str4);
		
	}
}
