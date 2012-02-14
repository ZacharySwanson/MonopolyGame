import java.util.*;

public class Player{

	//instance variables
	
	private int money = 1500;
	private ArrayList<Property> properties = new ArrayList<Property>();
	private String name;
	private Piece piece = new Piece();
	private boolean gojStatus = false;
	
	//methods
	
	public Player(String name){
		//constructor
		this.name = name;
	}
	
	public void playerReadout(){
		//to be called upon the start of the players turn, displays player name, location, money and number of properties
		System.out.println("Player " + name + " : you are on " + piece.getLocation().getName());
		System.out.println("You have " + money + " dollars and you own " + properties.size() + " properties:");
	}
	
	public void propertiesReadout(){
		//displays the players properties with number of houses/hotels and the current rent
		if(properties.size() > 0){
			for(Property p : properties){
				if(p.getHotel() == false){
					System.out.println(p.getName() + " (" + p.getNumHouses() + " Houses) : Rent = " + p.getRent());
				}
				else{
					System.out.println(p.getName() + " (Hotel) : Rent = " + p.getRent());
				}
			}
		}
	}
		
		
			
	public int getMoney(){return money;}
	
	public void addMoney(int value){
		//adds the input amount to the players current total
		money = money + value;
	}
	
	public void addProperty(Property p){
		properties.add(p);
	}
	
	public void removeProperty(Property p){
		properties.remove(p);
	}
	
	public boolean ownsProperty(Property p){
		//checks if a player owns the input property
		if(properties.contains(p)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void movePiece(Space s){
		//moves the players Piece to the input Space
		piece.setLocation(s);
	}
	
	public boolean getgojStatus(){return gojStatus;}
	
	public void setgojStatus(boolean b){
		gojStatus = b;
	}
	
}
	
	
