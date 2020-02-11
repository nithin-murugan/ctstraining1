

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

class ProductObject implements Comparable<ProductObject>
{
	int productid;
	String   ProductName;
	Date DateOfManufacture;
	double price;
	ProductObject(int pid,String pname,Date dom,double price)
	{
		this.productid=pid;
		this.ProductName=pname;
		this.price=price;
		this.DateOfManufacture=dom;
	}
	
	@Override
	public int compareTo(ProductObject po) 
	{
		int b=this.DateOfManufacture.compareTo(po.DateOfManufacture);
		if(b==0)
		{
			return (int)(this.price-po.price);
		}
		else
			return this.DateOfManufacture.compareTo(po.DateOfManufacture);
	}
	public String toString()
	{
		return "ProductId:"+productid+"\tProductName:"+ProductName+"\tDateofManufacture:"
				+DateOfManufacture+"\tProductPrice:"+price;
	}
}
class ProductObjectDemo 
{
	public static void main(String[] args) 
	{
		GregorianCalendar gc=new GregorianCalendar(2020,2,8);
		Date d1=gc.getTime();
		ProductObject Po1=new ProductObject(21,"Sparks",d1,1999);
		gc=new GregorianCalendar(1998,10,9);
		Date d2=gc.getTime();
		ProductObject Po2=new ProductObject(25,"Reebok",d2,3599);
		gc=new GregorianCalendar(1998,10,9);
		Date d3=gc.getTime();
		ProductObject Po3=new ProductObject(23,"SanFransico",d3,1299);
		gc=new GregorianCalendar(2010,9,8);
		Date d4=gc.getTime();
		ProductObject Po4=new ProductObject(29,"Addidas",d4,6999);
		ArrayList<ProductObject> ProdList=new ArrayList<ProductObject>();
		ProdList.add(Po1);
		ProdList.add(Po2);
		ProdList.add(Po3);
		ProdList.add(Po4);
		System.out.println("Before Sorting");
		for(ProductObject a:ProdList)
			System.out.println(a);
		Collections.sort(ProdList);
		System.out.println("After Sorting");
		for(ProductObject a:ProdList)
			System.out.println(a);
		Collections.sort(ProdList,Collections.reverseOrder());
		System.out.println("After Reverse Soritng");
		for(ProductObject a:ProdList)
			System.out.println(a);
		
	}

}
