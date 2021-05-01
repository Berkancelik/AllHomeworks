package inheritance;

public class Main {
	// poliformizm
	//SOLID - 2. harf Open Closed Principle

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber= "12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "789";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {engin,hepsiBurada };
		
		customerManager.addMultiple(customers);
	
		//customerManager.add(hepsiBurada);
		//customerManager.add(engin);
	//inheritance learn
	}
}

