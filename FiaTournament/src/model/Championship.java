package model;
import java.util.Scanner;

public class Championship {//Start of Championship class
	Scanner sc = new Scanner(System.in);

	//Attributes
	private int year=0;
	private int races=0;
	//Relations
	private Pilot[] pilots;
	
	
	//Constructor
	public Championship (int xYear, int xRaces, int XPilots) {
		year = xYear;
		races= xRaces;
		pilots= new Pilot[XPilots];
	}//End constructor
	
	
	//add pilot
	public void addPilot( String xName, int xAge, String team, int [] scores) {
		boolean a= false;
		for (int i = 0; i <pilots.length &&  !a; i++) {//Start for
			if(pilots[i] == null) {//Start if
				pilots[i]= new Pilot (xName, xAge, team, scores);
				a = true;
			}//End if
		}//End for
	}//End add pilot
	
	//Find pilots
	public boolean findPilots(String name) {
		boolean found = false;
		for ( int i = 0; i <pilots.length && !found; i++) {//Start for
			if (pilots[i] !=null && pilots[i].getName().equalsIgnoreCase(name)) {//Start if
				found = true;
			}//End if
		}//End for
		return found;
	}//End findPilot

	//show average times
	public String showAverageTimes() {
		String message= new String();
		int hours=0;
		int minutes=0;
		int seconds=0;
		int average=0;
		for ( int i = 0; i <pilots.length ; i++) {//Start for
			if (pilots[i] !=null) {//Start if
				average=pilots[i].calculateAverage();
				hours= average/3600;
				minutes = (average-(3600*hours))/60;
				seconds= average-((hours*3600)+(minutes*60));
				message += "\nNombre del piloto: " + pilots[i].getName() + "\nTiempo promedio: " + hours + ":" + minutes + ":" + seconds + "\n------------------------------------";
			}//End if
		}//End for
		return message;
	}//End showAverageTimes
	
	
	//Setters and Getters 
	public int getYear() {
		return year;
	}
	public int getRaces() {
		return races;
	}

	public void setYear(int xYear){
		year = xYear;
	}
	
	public void setRaces(int xRaces){
		races = xRaces;
	}
	
	public Pilot []	 getPilots() {
		return pilots;
	}
}
