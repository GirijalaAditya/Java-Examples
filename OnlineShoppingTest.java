import java.util.*;
abstract class OnlineShopping
{
	abstract void viewitems(item i);
	abstract void makepurchase();
	void checkout()
	{
		System.out.println("Checkout method of abstract class\n");
	}
}
class book extends OnlineShopping
{
	static int orderid=9999;
	String orderitem;
	int orderquantity;
	double orderamount;
	item v;
	void viewitems(item v)
	{
		System.out.println("View Items method of child class\n");
		this.v=v;
		v.displayitem();
	}
	void makepurchase()
	{
		System.out.println("Make Purchase method of child class\n");
		orderid++;
		System.out.println("Enter Item Code:");
		orderitem=new Scanner(System.in).next();
		System.out.println("Enter Quantity:");
		orderquantity=new Scanner(System.in).nextInt();
		if(orderitem.equals(v.itemcode) && (v.quantity>=orderquantity))
		{
			orderamount=orderquantity*v.itemprice;
			v.quantity=v.quantity-orderquantity;
		}
		printorderdetails();
	}
	public void printorderdetails()
	{
		System.out.println("Order Id:"+orderid);
		System.out.println("Order Item:"+v.itemname);
		System.out.println("Quantity:"+orderquantity);
		System.out.println("Order Amount:"+orderamount);
		v.displayitem();
	}
}
class item
{
	String itemname;
	String itemcode;
	double itemprice;
	int quantity;
	item(){ }
	item(String itemname, String itemcode, double itemprice, int quantity)
	{
		this.itemname=itemname;
		this.itemcode=itemcode;
		this.itemprice=itemprice;
		this.quantity=quantity;
	}
	void displayitem()
	{
		System.out.println("Item Name:"+itemname);
		System.out.println("Item Code:"+itemcode);
		System.out.println("Item Price:"+itemprice);
		System.out.println("Quantity Available:"+quantity);
	}
}
class OnlineShoppingTest
{
	public static void main(String args[])
	{
		OnlineShopping obj=new book();
		item i1=new item("Book1","#Book11",500,5);
		i1.displayitem();
		obj.viewitems(i1);
		obj.makepurchase();
		obj.checkout();
	}
}