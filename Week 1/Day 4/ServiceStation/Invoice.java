package ServiceStation;
class Invoice
{
	Customer p;
	Vehicle v;
	public String getname()
	{
		return p.getName();
	}
	Invoice(Customer p,Vehicle v)
	{
		this.p = p;
		this.v = v;
	}
	public void getInvoice()
	{
		System.out.println("\n INVOICE FOR YOUR SERVICE \n");
		p.getter();
		System.out.println("Vehicle : "+v.getClass().getName().substring(15));
		System.out.println("Brand : "+v.getBrand());
		System.out.println("Color : "+v.getColor());
		System.out.println("ServiceCharge : Rs "+v.getServiceCharge());
	
	}
}
