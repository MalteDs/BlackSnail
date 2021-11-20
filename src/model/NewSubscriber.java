package model;
/**
 * The objetc NweSubscriber represets the information of the subscribers
 */
public class NewSubscriber{
	//Atributes
	private long id;
	private String name;
	private int age;
	private int hours;
	//relations
	private ClientType clientType;
	private ActiveSub activeSub;
	
	/**
	 * Constructor method: NewSubscriber
	 * @param id - integer represents the id of subscribers
	 * @param name - String the name of subscribers
	 * @param age - integer representes the age of subscribers
	 * @param hours - integer representes the hours dedicated of subscribers
	 * @param activeSub - integer represemte the client status
	 * @param clienType - integer represente the client type
	 */
	public NewSubscriber(long id,String name,int age, int hours,int activeSub,int clientType){
		this.id=id;
		this.name=name;
		this.age=age;
		this.hours=hours;
		switch(activeSub){
			case 1: this.activeSub=ActiveSub.ACTIVE;
				break;
			case 2: this.activeSub=ActiveSub.INACTIVE;
				break;
		}
		
		switch(clientType){
			case 1: this.clientType=ClientType.NORMAL;
				break;
			case 2: this.clientType=ClientType.GOLD;
				break;
			case 3: this.clientType=ClientType.PLATINUM;
				break;
			case 4: this.clientType=ClientType.DIAMOND;
				break;
		}		
	}
	public long getId(){
		return id;
	}
	public void setId(long id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getHours(){
		return hours;
	}
	public void setHours(int hours){
		this.hours=hours;
	}
	public ActiveSub getActiveSub(){
		return activeSub;
	}
	public void setActiveSub(ActiveSub activeSub){
		this.activeSub=activeSub;
	}
	public ClientType getClientType(){
		return clientType;
	}
	public void setClientType(ClientType clientType){
		this.clientType=clientType;
	}
}
