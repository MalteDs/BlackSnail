package model;
/**
 * The class Product represents an object
 */
public class Product{
	//Atributes
	private String nameProduct;
	private String nameDirector;
	private String sinopsis;
	private String trailer;
	//relations
	/**
	 * Method Constructor
	 * @param nameProduct
	 * @param nameDirector
	 * @param sinopsis
	 * @param trailer
	 */
	public Product(String nameProduct,String nameDirector, String sinopsis,String trailer){
		this.nameProduct=nameProduct;
		this.nameDirector=nameDirector;
		this.sinopsis=sinopsis;
		this.trailer=trailer;
	}
	public String getNameProduct(){
		return nameProduct;
	}
	public void setNameProduct(String nameProduct){
		this.nameProduct=nameProduct;
	}
	public String getNameDirector(){
		return nameDirector;
	}
	public void setNameDirector(String nameDirector){
		this.nameDirector=nameDirector;
	}
	public String getSinopsis(){
		return sinopsis;
	}
	public void setSinopsis(String sinopsis){
		this.sinopsis=sinopsis;
	}
	public String getTrailer(){
		return trailer;
	}
	public void setTrailer(String trailer){
		this.trailer=trailer;
	}
	public String toString(){
		String message="Name Product: "+getNameProduct()+"\n";
		message+="Name director: "+getNameDirector()+"\n";
		message+="Sinopsis: "+getSinopsis()+"\n";
		message+="Trailer: "+getTrailer()+"\n";
		return message;
	}

}