package Main;

import java.util.Random;
import java.util.Scanner;

public class Heros {
	
	static int Vie;
	static int Attaque;
	static int Defense;
	int Vitesse;
	static int fuite = 0;
	
	protected Heros (int hp, int atk, int def, int spd){
		Vie = hp;
		Attaque = atk;
		Defense = def;
		Vitesse = spd;
	}

	public static void Attaque() {
		int frappe = Heros.Attaque - Monstre.Defense;
		Monstre.Vie = Monstre.Vie - frappe;
	}
	
	public static void Fuire(){
		Random r = new Random();
		int valeur = 1 + r.nextInt(40 - 1);
		if(valeur > 30){
			System.out.println("Vous avez réussi à fuir !");
			fuite = 1;
		}
	}
		
	public static void TourHeros(){
				
		System.out.println("Vous vous trouvez face à un ennemi !");
		System.out.println("Que faites vous ?");
		System.out.println("1.Attaquez\n2.Soins\n3.Fuire");
		
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		
		if(choix == 1){
			Heros.Attaque();
			System.out.println("Point de vie restant a l'ennemi : " + Monstre.Vie);
		}
		
		if(choix == 2){
			Heros.Vie += 10;
		}
		if(choix == 3){
			Heros.Fuire();
		}
		
	}
}
