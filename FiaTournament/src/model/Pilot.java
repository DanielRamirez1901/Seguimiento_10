package model;

	
public class Pilot {//Start Pilot class
	

	//Attributes
	private String name;
	private int age=0;
	private int [] scores;
	private String team;
	
	
	
	//Constructor
	public Pilot(String xName, int xAge, String xTeam, int [] score) {
		name = xName;
		age = xAge;
		team = xTeam;
		scores= score;
	}//End constructor

	//Calculate Average
	public int calculateAverage() {
		
		int total = 0;
		for (int i = 0; i <scores.length ; i++) {
			total += scores[i];
		}
		total /= scores.length;
		return total;
	}//End calculate Average
	
	//Setters and Getters
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getTeam(){
		return team;
	}
	
	public void setName(String xName){
		name = xName;
	}
	
	public void setAge(int xAge) {
		age = xAge;
	}
	
	public void setTeam(String xTeam) {
		team = xTeam;
	}
}//End pilot class
