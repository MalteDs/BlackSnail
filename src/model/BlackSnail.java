package model;
/**
 * The class BlackSnail allows the system solve the information and verify the exist of the objets
 */
public class BlackSnail{
	//Atributees
	private String name;
	private static final int CAN_SUBS=50;
	private static final int MAX_PRODUCTS=85;
	private static final int MAX_SEASONS=10;
	//Relations
	private NewSubscriber[] subsList;
	private Product[] productList;
	private Season[] seasonList;
	
	public BlackSnail(String name){
		this.name=name;
		this.subsList=new NewSubscriber[CAN_SUBS];
		this.productList = new Product[MAX_PRODUCTS];
		this.seasonList = new Season[MAX_SEASONS];
	}
	/**
	 * The method addSubscriber add a new subscriber to the system <br>
	 * @param id
	 * @param name
	 * @param age
	 * @param hours
	 * @param activeSub
	 * @param clientType
	 * @param subsCont
	 * @return message
	 */
	public String addSubscriber(Long id,String name, int age, int hours, int activeSub,int clientType, int subsCont){
		String message="";
		boolean exists=subVerify(id);
		if(exists==false){
			boolean found=false;
			for(int i=0;i<CAN_SUBS && found==false;i++){
				if(subsList[i]==null){
					subsList[i]=new NewSubscriber(id,name,age,hours,activeSub,clientType);
					found=true;
					message="Subscriber sucefully added";
				}
			}
			
		}
		else if(exists==true)
			message="The subscriber id already exists. The last one entered will be deleted";
		return message;	
	}

	/**
	 * The method subVerify verify if the user exist before <br>
	 * @param id
	 * @return exists
	 */
	public boolean subVerify(long id){
		boolean exists=false;
		for(int i=0;i<CAN_SUBS;i++){
			if(subsList[i]!=null && id==subsList[i].getId())
				exists=true;
		}
		return exists;
	}
	/**
	 * The method desactiveSub desactivate and convert to client at ActiveSub.INACTIVE and Clienttype.NORMAL <br>
	 * @param tempId
	 * @return message
	 */
	public String desactiveSub(long tempId){
		String message="User was not found";
		for(int i=0;i<CAN_SUBS;i++){
			if(subsList[i]!=null){
				if(subsList[i].getId()==tempId){
					subsList[i].setActiveSub(ActiveSub.INACTIVE);
					subsList[i].setClientType(ClientType.NORMAL);
					message="The subscriber was desactivate";
				}
			}	
		}
		return message;
	}

	/**
	 * The methot activeSubscribers list the active subscribers and your types <br>
	 * @return message
	 */
	public String activeSubscribers(){
		int activeCont=0;
		int normalCont=0;
		int goldCont=0;
		int platinumCont=0;
		int diamondCont=0;
		for(int i=0;i<CAN_SUBS;i++){
			if(subsList[i]!=null){
				if(subsList[i].getActiveSub()==ActiveSub.ACTIVE)
					activeCont++;
				if(subsList[i].getClientType()==ClientType.NORMAL)
					normalCont++;
				if(subsList[i].getClientType()==ClientType.GOLD)
					goldCont++;
				if(subsList[i].getClientType()==ClientType.PLATINUM)
					platinumCont++;
				if(subsList[i].getClientType()==ClientType.DIAMOND)
					diamondCont++;
			}
		}
		String message="The number of active subscribers are: "+activeCont+"\n";
		message+="distributed as follows: "+"\n";
		message+="normal: "+normalCont+"\n";
		message+="gold: "+goldCont+"\n";
		message+="Platinum: "+platinumCont+"\n";
		message+="Diamond: "+diamondCont+"\n";
		return message;
	}

	/**
	 * The method underAgeSubs lists the number of under age subscribers registered in the  system <br>
	 * @return message;
	 */
	public String underAgeSubs(){
		int underAgeCont=0;
		for(int i=0;i<CAN_SUBS;i++){
			if(subsList[i]!=null){
				if(subsList[i].getAge()<18)
				underAgeCont++;
			}
		}
		String message="Cant of underage subscribers: "+underAgeCont;
		return message;
	}

	/**
	 * The method addFilm add a new Film in the system <br>
	 * @param nameProduct
	 * @param nameDirector
	 * @param sinopsis
	 * @param trailer
	 * @param dateEstreno
	 * @param nameProductora
	 * @param categoryFilm
	 * @param cont
	 * @return message
	 */
	public String addFilm(String nameProduct,String nameDirector, String sinopsis,String trailer,String dateEstreno,String nameProductora,int categoryFilm,int cont){
		String message="No more products can be created";
		if(productList[cont]==null){
			productList[cont] = new Film(nameProduct,nameDirector,sinopsis,trailer,dateEstreno,nameProductora,categoryFilm);
			message="Film succefully created";
		}
		return message;
	}

	/**
	 * The method addSerie add a new serie in the system <br>
	 * @param nameProduct
	 * @param nameDirector
	 * @param sinopsis
	 * @param trailer
	 * @param dateFirtsE
	 * @param nameProtagonist1
	 * @param nameProtagonist2
	 * @param censure
	 * @param numSeason
	 * @param numEpisodes
	 * @param cont
	 * @return message
	 */
	public String addSerie(String nameProduct,String nameDirector, String sinopsis,String trailer,String dateFirtsE,String nameProtagonist1,String nameProtagonist2,String censure,int numSeason,int numEpisodes, int cont){
		String message="No more products can be created";
		if(productList[cont]==null){
			//DUDAAAAAAAAAAAAAAAAAAAAAAAAA
			productList[cont]=new Serie(nameProduct,nameDirector,sinopsis,trailer,dateFirtsE, nameProtagonist1, nameProtagonist2, censure);
			seasonList[cont]=new Season(nameProduct,nameDirector,sinopsis,trailer,dateFirtsE, nameProtagonist1, nameProtagonist2, censure,numSeason,numEpisodes);
			message="Serie sucefully created";
		}
		return message;
	}
	/**
	 * The methos searchProduct search a product in the system <br>
	 * @param search
	 * @return message
	 */
	public String searchProduct(String search){
		String message="The product no exists";
		for(int i=0;i<MAX_PRODUCTS;i++){
			if(productList[i]!=null){
				if(search.equalsIgnoreCase(productList[i].getNameProduct())){
					message=productList[i].toString();
				}
			}
		}
		return message;
	}
	/**
	 * The method createSeason creates a new season for the Serie searh <br>
	 * @param nameSearch
	 * @return message
	 */
	public String createSeason(String nameSearch){//odio aki
		int exists=seasonVerify(nameSearch);
		String message="";
		if(exists!=-1 && seasonList[exists].getNumSeason()<MAX_SEASONS){
			seasonList[exists].setNumSeason(seasonList[exists].getNumSeason()+ 1);
			message="Serie updated successfully";
		}
		else if(exists==-1)
			message="No series was found that matches the name entered";
		return message;
	}

	/**
	 * The method seasonVerify verifies the serie searched exists <br>
	 * @param nameSearch
	 * @return message
	 */
	public int seasonVerify(String nameSearch){
		int exists=-1;
		for(int i=0;i<MAX_PRODUCTS;i++){
				if(productList[i] instanceof Serie && nameSearch.equalsIgnoreCase(productList[i].getNameProduct())){
					return i;
				}
			}
		return exists;
	}

	/**
	 * The method listFilms lists the films by category <br>
	 * @param sel
	 * @return message
	 */
	public String listFilms(int sel){
		String message="";
		for(int i=0;i<MAX_PRODUCTS;i++){
			if(productList[i]!=null && productList[i] instanceof Film){
				Film filmAux=(Film)productList[i];
				switch(sel){ 
					case 1: if(filmAux.getCategoryFilm()==CategoryFilm.ROMANTIC)
						message+=productList[i].getNameProduct()+"\n";
						break;
					case 2: if(filmAux.getCategoryFilm()==CategoryFilm.ACTION)
						message+=productList[i].getNameProduct()+"\n";
						break;
					case 3: if(filmAux.getCategoryFilm()==CategoryFilm.SUSPENSE)
						message+=productList[i].getNameProduct()+"\n";
						break;
					case 4: if(filmAux.getCategoryFilm()==CategoryFilm.TERROR)
						message+=productList[i].getNameProduct()+"\n";
						break;
					case 5: if(filmAux.getCategoryFilm()==CategoryFilm.COMEDY)
						message+=productList[i].getNameProduct()+"\n";
						break;
				}
			}
		}
		return message;
	}

	/**
	 * The methos listSeries list the all series <br>
	 * @return message
	 */
	public String listSeries(){
		String message="";
		for(int i=0;i<MAX_PRODUCTS;i++){
			if(productList[i]!=null){
				if(productList[i] instanceof Serie){
					message+=productList[i].getNameProduct()+"\n";
				}	
			}
		}
		return message;
	}
}