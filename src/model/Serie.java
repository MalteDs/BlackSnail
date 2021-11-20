package model;
/**
 * The class serie extends the class Product and represents an object 
 */
public class Serie extends Product{
	//Atributes
	private String dateFirtsE;
	private String nameProtagonist1;
	private String nameProtagonist2;
	private String censure;
	//Relations

	/**
	 * Method Constructor
	 * @param nameProduct
	 * @param nameDirector
	 * @param sinopsis
	 * @param trailer
	 * @param dateFirtsE
	 * @param nameProtagonist1
	 * @param nameProtagonist2
	 * @param censure
	 */
	public Serie(String nameProduct,String nameDirector, String sinopsis,String trailer,String dateFirtsE,String nameProtagonist1,String nameProtagonist2,String censure){
		super(nameProduct,nameDirector,sinopsis,trailer);
		this.dateFirtsE=dateFirtsE;
		this.nameProtagonist1=nameProtagonist1;
		this.nameProtagonist2=nameProtagonist2;
		this.censure=censure;
	}
	public String getDateFirtsE(){
		return dateFirtsE;
	}
	public void setDateFirstE(String dateFirtsE){
		this.dateFirtsE=dateFirtsE;
	}
	public String getNameProtagonist1(){
		return nameProtagonist1;
	}
	public void setNameProtagonist1(String nameProtagonist1){
		this.nameProtagonist1=nameProtagonist1;
	}
	public String getNameProtagonist2(){
		return nameProtagonist2;
	}
	public void setNameProtagonist2(String nameProtagonist2){
		this.nameProtagonist2=nameProtagonist2;
	}
	public String getCensure(){
		return censure;
	}

	public void setCensure(String censure){
		this.censure=censure;
	}

	@Override
	public String toString(){
		String message=super.toString()+"First issue date: "+getDateFirtsE()+"\n";
			message+="Name protagonists: "+getNameProtagonist1()+"\n"+getNameProtagonist2()+"\n";
			message+="Censure: "+getCensure()+"\n";
			return message;
	}
}
