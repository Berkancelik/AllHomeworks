package inheritance2;

public class Main {
	// birbirinin alternatifi i�in if yaz�lmaz 

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new DatabaseLogger());
		
	}

}
