package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		int boucle = 1;
		
		Heros Paladin = new Paladin(100, 10, 5, 20);
		Monstre LezardMan = new LezardMan(50, 15, 3, 15);
		
		List<Heros> Joueur = new ArrayList<Heros>();
		Joueur.add(Paladin);
		
		List<Monstre> PNJ = new ArrayList<Monstre>();
		PNJ.add(LezardMan);
		
		while(boucle == 1){
			
			Heros.TourHeros();
			
			if(Monstre.Vie<0){
				System.out.println("Bravo !! Vous avez gagné !!");
				boucle=0;
			}
			
			Monstre.TourMonstre();
		}
	}
}
 