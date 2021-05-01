public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product(); //örnek oluþturma, referans oluþturma, intance
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product1.setUnitPrice(16000);
		
		System.out.println(category1.getName());
		
		
		
	}

}
