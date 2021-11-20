package ui;
import model.*;
import java.util.Scanner;
/**
 * The class Main allows the user select between create new subscriber, desactivate subscriber,
 * show nomber of active subscribers and wxit of the system.
 * @author David Malte "RanitaUwU, RagnarArik"
*/
public class Main{
	public static final int MAX_SEASONS=10;
	public static Scanner sc=new Scanner(System.in);
	public static BlackSnail blackSnail= new BlackSnail("BlackSnail");

	/**
	 * Method name: main
	 * The method shows a menu <br>
	 * <b> pre: </b> <br>
	 * <b> post: </b> User selection. <br>
	 */
	public static void main (String[]args){
		int subsCont=0;
		int productCont=0;
		for(boolean exit=false;exit!=true;){
			System.out.println("BLACKSNAIL");
			System.out.println("1. create new subscriber");
			System.out.println("2. desactivate subscriber");
			System.out.println("3. show number of active subscribers");
			System.out.println("4. underage subscribers");
			System.out.println("5. Create new product");
			System.out.println("6. product information");
			System.out.println("7. Create new sreies seasons");
			System.out.println("8. Show movies per gender");
			System.out.println("9. Show all series");
			System.out.println("10. exit");
			int sel=sc.nextInt();
			sc.nextLine();

			switch(sel){
				case 1: newSubscriber(sc,subsCont);
						subsCont++;
					break;
				case 2: desactiveSub(sc);
					break;
				case 3: activeSubscribers();
					break;
				case 4: underAgeSubs();
					break;
				case 5: newProduct(sc,productCont);
						productCont++;
					break;
				case 6: searchProduct(sc);
					break;
				//case 7: createSeason(sc);
				//	break;
				case 8: listFilms(sc);
					break;
				case 9: listSeries(sc);
					break;
				case 10: exit=true;
					break;
			}
		}
		sc.close();
	}

	/**
	 * Mehot name: newSubscriber <br>
	 * Once the option is selected in the main method, the requested information is read. <br>
	 * <b> pre: </b> the user has selected the first option in the main method, the lists has been inicializated. <br>
	 * <b> post: </b> the information is solve in the lists. <br>
	 * @param sc - Scanner represents the lector.
	 */
	public static void newSubscriber(Scanner sc, int subsCont){
		System.out.println("There are "+subsCont+" subscribers actually");
		System.out.println("Max subscribers: 50");
		System.out.println("enter the id of the subscriber");
		long id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the full name of the subscriber");
		String name=sc.nextLine();
		System.out.println("Enter the age of the subscriber");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Number of hours willing to consume");
		int hours=sc.nextInt();
		sc.nextLine();
		System.out.println("Selec the status (1. Active, 2. inactive)");
		int activeSub=sc.nextInt();
		sc.nextLine();
		System.out.println("Selec client type: 1. normal 2. Gold 3. Platinum  4. Diamond");
		int clientType=sc.nextInt();
		sc.nextLine();
		String message=blackSnail.addSubscriber(id,name,age,hours,activeSub,clientType,subsCont);
		System.out.println(message);
	}
	
	
	
	/**
	 * Method name: desactiveSub <br>
	 * Once the option is selected in the main method, the requested information is read and validate <br>
	 * <b> pre: </b> the user has selected the second option in the main method, the lists has been 
	 * inicializated and the information was solve in the lists<br>
	 * <b> post: </b> the information is solve in the object's methods <br>
	 * @param sc - Scanner represents the lector.
	 */
	public static void desactiveSub(Scanner sc){
		System.out.println("enter a registered id");
		long tempId=sc.nextInt();
		sc.nextLine();
		String message=blackSnail.desactiveSub(tempId);
		System.out.print(message);
	}

	/**
	 * Method name: activeSubscribers
	 * The methos shows the number of active subs and the number of subscribers' kind <br>
	 * <b> pre: </b> the user has selected the third option in the main method, the lists has been 
	 * inicializated and the information was solve in the lists<br>
	 * <b> post: </b> the information is show. <br>
	 */
	public static void activeSubscribers(){
		String message=blackSnail.activeSubscribers();
		System.out.println(message);
	}

	/**
	 * Method name: underAgeSubs
	 * The methos shows the number of underAge subscribers <br>
	 * <b> pre: </b> the user has selected the fourth option in the main method, the lists has been 
	 * inicializated and the information was solve in the lists<br>
	 * <b> post: </b> the information is show. <br>
	 */
	public static void underAgeSubs(){
		String message=blackSnail.underAgeSubs();
		System.out.println(message);
	}

	/**
	 * Mehot name: newProduct <br>
	 * Once the option is selected in the main method, the requested information is read. <br>
	 * <b> pre: </b> the user has selected the fifth option in the main method, the lists has been inicializated. <br>
	 * <b> post: </b> the information is solve in the lists. <br>
	 * @param sc - Scanner represents the lector.
	 */
	public static void newProduct(Scanner sc,int cont){
		System.out.println("1. Create film");
		System.out.println("2. Create serie");
		int sel=sc.nextInt();
		sc.nextLine();
		switch(sel){
			case 1: createFilm(sc,cont);
				break;
			case 2: createSerie(sc,cont);
				break;
		}
	}

	/**
	 * Mehot name: createFilm <br>
	 * Once the option is selected in the main method, the requested information is read. <br>
	 * <b> pre: </b> the user has selected the first option in the newProduct method, the lists has been inicializated. <br>
	 * <b> post: </b> the information is solve in the lists. <br>
	 * @param sc - Scanner represents the lector.
	 */
	public static void createFilm(Scanner sc, int cont){
		System.out.println("Enter the name film");
		String nameProduct=sc.nextLine();
		System.out.println("Enter the Director name");
		String nameDirector=sc.nextLine();
		System.out.println("Enter the movie synopsis");
		String sinopsis=sc.nextLine();
		System.out.println("Enter the movie trailer");
		String trailer=sc.nextLine();
		System.out.println("Enter the premiere date (dd-mm-yy)");
		String dateEstreno=sc.nextLine();
		System.out.println("Enter the productora name");
		String nameProductora=sc.nextLine();
		System.out.println("Enter the category film 1. Romantic 2. Action 3. Suspense 4. Terror 5. Comedy");
		int categoryFilm=sc.nextInt();
		sc.nextLine();
		String message=blackSnail.addFilm(nameProduct,nameDirector,sinopsis,trailer,dateEstreno,nameProductora,categoryFilm,cont);
		System.out.println(message);
	}
	
	/**
	 * Mehot name: createSerie <br>
	 * Once the option is selected in the main method, the requested information is read. <br>
	 * <b> pre: </b> the user has selected the second option in the newProduct method, the lists has been inicializated. <br>
	 * <b> post: </b> the information is solve in the lists. <br>
	 * @param sc - Scanner represents the lector.
	 */
	public static void createSerie(Scanner sc,int cont){
		System.out.println("Enter series name");
		String nameProduct=sc.nextLine();
		System.out.println("Enter the Director name");
		String nameDirector=sc.nextLine();
		System.out.println("Enter the series synopsis");
		String sinopsis=sc.nextLine();
		System.out.println("Enter the series trailer");
		String trailer=sc.nextLine();
		System.out.println("Enter first issue date(dd-mm-yyyy)");
		String dateFirstE=sc.nextLine();
		System.out.println("There are two protagonists. Enter your names");
		System.out.println("Protagonisr 1: ");
		String nameProtagonist1=sc.nextLine();
		System.out.println("Protagonisr 2: ");
		String nameProtagonist2=sc.nextLine();
		System.out.println("Is the series censored?(Yes, no) If so, enter the reasons");
		String censure=sc.nextLine();
		System.out.println("Enter the number of seasons");
		int seasons=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the number of episodes per season (The series will always broadcast the same amount per season)");
		int capSeasons=sc.nextInt();
		sc.nextLine();
		String message=blackSnail.addSerie(nameProduct,nameDirector,sinopsis,trailer,dateFirstE,nameProtagonist1, nameProtagonist2, censure,seasons,capSeasons,cont);
		System.out.println(message);
	}

	/**
	 * Mehot name: searchProduct <br>
	 * Once the option is selected in the main method, the requested information is read. <br>
	 * <b> pre: </b> the user has selected the sixth option in the main method, the lists has been inicializated. <br>
	 * <b> post: </b> the information is solve in the lists. <br>
	 * @param sc - Scanner represents the lector.
	 */
	public static void searchProduct(Scanner sc){
		System.out.println("Enter the name of the product to search\n");
		String search=sc.nextLine();
		String message=blackSnail.searchProduct(search);
		System.out.println(message);
	}

	/**
	 * Mehot name: createSeason <br>
	 * Once the option is selected in the main method, the requested information is read. <br>
	 * <b> pre: </b> the user has selected the seventh option in the main method, the lists has been inicializated. <br>
	 * <b> post: </b> the information is solve in the lists. <br>
	 * @param sc - Scanner represents the lector.
	 */
	public static void createSeason(Scanner sc){
		System.out.println("Enter the name of the serie to search");
		String name=sc.nextLine();
		String message=blackSnail.createSeason(name);
		System.out.println(message);
	}

	/**
	 * Mehot name: listFilms <br>
	 * Once the option is selected in the main method, the requested information is read. <br>
	 * <b> pre: </b> the user has selected the eigth option in the main method, the lists has been inicializated. <br>
	 * <b> post: </b> the information is solve in the lists. <br>
	 * @param sc - Scanner represents the lector.
	 */
	public static void listFilms(Scanner sc){
		System.out.println("Select category. \n 1. Romantic 2. Action 3. Suspense 4. Terror 5. Comedy");
		int sel=sc.nextInt();
		sc.nextLine();
		String message=blackSnail.listFilms(sel);
		System.out.println(message);
	}

	/**
	 * Mehot name: listSeries <br>
	 * Once the option is selected in the main method, the requested information is read. <br>
	 * <b> pre: </b> the user has selected the ninth option in the main method, the lists has been inicializated. <br>
	 * <b> post: </b> the information is solve in the lists. <br>
	 * @param sc - Scanner represents the lector.
	 */
	public static void listSeries(Scanner sc){
		String message=blackSnail.listSeries();
		System.out.println(message);
	}
}
