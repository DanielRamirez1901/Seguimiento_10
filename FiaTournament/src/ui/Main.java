package ui;
import java.util.Scanner;

import model.Championship;

public class Main {//Start Main class
	
	public final static Scanner sc = new Scanner(System.in);
	
	
	public static void main (String [] args) {
		
		Championship championship = createChampionship();
		for ( int i = 0; i < championship.getPilots().length; i++) {
			createPilot(championship);
		}
		System.out.println(championship.showAverageTimes());
	
			
	}
	
	private static Championship createChampionship() {//Create championship
	
	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=Welcome to FIA=-=-=-=-=-=-=-=-=-=-=-=");

	System.out.println("\nEscriba el año del campeonato");
	int year = sc.nextInt();sc.nextLine();

	System.out.println("Escriba la cantidad de premios");
	int races = sc.nextInt();sc.nextLine();

	System.out.println("Escriba el numero de pilotos");
	int pilots= sc.nextInt();sc.nextLine();
	System.out.println("-------------------------------");

	
	Championship championshipx= new Championship(year, races, pilots);
		
	return championshipx;
}//End
	
	private static void createPilot(Championship championship) {// Add a new pilot
		String name = new String();
		int age = 0;
		String team = new String();
		int[] scores = new int[championship.getRaces()];
		
		System.out.println("\nIngrese el nombre del piloto");
		name = sc.nextLine();
		
		System.out.println("Ingrese la edad del piloto");
		age = sc.nextInt();sc.nextLine();
		
		System.out.println("Ingrese el equipo del piloto");
		team = sc.nextLine();
		
		for ( int i = 0; i< scores.length;i++) {
			System.out.println("Ingrese el tiempo en segundos del piloto en el premio " + (i+1)+":");
			scores [i] = sc.nextInt();sc.nextLine();
			
		}
		System.out.println("Piloto registrado exitosamente");

		System.out.println("-------------------------------");

		championship.addPilot(name, age, team, scores);
	}//End add a new pilot
	
}//end Main class
