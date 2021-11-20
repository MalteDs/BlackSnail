package model;
/**
 * The class Film extends the class Product and represents an object
 */
public class Film extends Product{
	//Atributes
	private String dateEstreno;
	private String nameProductora;
	private int minimumAge;
	//Relations
	private CategoryFilm categoryFilm;

	/**
	 * Method constructor
	 * @param nameProduct
	 * @param nameDirector
	 * @param sinopsis
	 * @param trailer
	 * @param dateEstreno
	 * @param nameProductora
	 * @param categoryFilm
	 */
	public Film(String nameProduct,String nameDirector, String sinopsis,String trailer,String dateEstreno,String nameProductora,int categoryFilm){
		super(nameProduct,nameDirector,sinopsis,trailer);
		this.dateEstreno=dateEstreno;
		this.nameProductora=nameProductora;
		switch(categoryFilm){
			case 1: this.categoryFilm=CategoryFilm.ROMANTIC;
				break;
			case 2: this.categoryFilm=CategoryFilm.ACTION;
				break;
			case 3: this.categoryFilm=CategoryFilm.SUSPENSE;
				break;
			case 4: this.categoryFilm=CategoryFilm.TERROR;
				break;
			case 5: this.categoryFilm=CategoryFilm.COMEDY;
				break;
		}
	}
		public String getDateEstreno(){
			return dateEstreno;
		}
		public void setDateEstreno(String dateEstreno){
			this.dateEstreno=dateEstreno;
		}
		public String getNameProductora(){
			return nameProductora;
		}
		public void setNameProductora(String nameProductora){
			this.nameProductora=nameProductora;
		}
		public int getMinimumAge(){
			return minimumAge;
		}
		public void setMinimumAge(int minimumAge){
			this.minimumAge=minimumAge;
		}
		public CategoryFilm getCategoryFilm(){
			return categoryFilm;
		}
		public void setCategoryFilm(CategoryFilm categoryFilm){
			this.categoryFilm=categoryFilm;
		}
		@Override
		public String toString(){
			String message=super.toString()+"Release date: "+getDateEstreno()+"\n";
			message+="Name productora: "+getNameProductora()+"\n";
			message+="Minimum age: "+getMinimumAge()+"\n";
			message+="Category film: "+getCategoryFilm()+"\n";
			return message;
		}
	}
