package Main;

public class Monstre {
	
	static int Vie;
	static int Attaque;
	static int Defense;
	static int Vitesse;
	
	protected Monstre(int hp, int atk, int def, int spd){
		Vie = hp;
		Attaque = atk;
		Defense = def;
		Vitesse = spd;
	}
	
	public static void Attaque() {
		int frappe = Monstre.Attaque - Heros.Defense;
		Heros.Vie = Heros.Vie - frappe;
	}
	
	public static void TourMonstre(){
		Monstre.Attaque();
		System.out.println("Vos point de vie: " + Heros.Vie);
	}
}
