package classesWithAttribute;
	
    

public class Product {
	
	
	public Product( int id, String name, String description, double price, int stockAmount, String renk ){
		System.out.println("Yapýcý blok çalýþtý");
		this._id = _id;
		this._renk = _renk;
		this._name = _name;
		this._price =_price;
		this._description =_description;
		this._stockAmount;_stockAmount;
		}
	// attribute | field
	// private sadece tanýmlandýðý blokta geçerlidir 
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;
    
    
    //getter
    public int getId() {
    	return _id;
    	
    }
    //setter
    public void setId(int id) {
    	this._id=_id;
    }
	private String get_name() {
		return _name;
	}
	private void set_name(String _name) {
		this._name = _name;
	}
	private String get_description() {
		return _description;
	}
	private void set_description(String _description) {
		this._description = _description;
	}
	private double get_price() {
		return _price;
	}
	private void set_price(double _price) {
		this._price = _price;
	}
	private int get_stockAmount() {
		return _stockAmount;
	}
	private void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
	private String get_renk() {
		return _renk;
	}
	private void set_renk(String _renk) {
		this._renk = _renk;
	}
	private String get_kod() {
		return this._name.substring(0,1)+ _id;
	}
	private void set_kod(String _kod) {
		this._kod = _kod;
	}
    
    
	
	
	
	
	
	

}
