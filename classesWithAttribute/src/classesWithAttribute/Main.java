package classesWithAttribute;
// HATALI 
public class Main {

	public static void main(String[] args) {
		Product product =new Product(id: 1, name:"Laptop", description: "asus Laptop",price:3000, stockAmount:2, renk:"Siyah");


		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
