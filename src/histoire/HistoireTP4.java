package histoire;

import personnage.Commerçant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain professeur = new Humain("Prof", "kombucha", 54);
		professeur.direBonjour();
		professeur.acheter("une boisson", 12);
		professeur.boire();
		professeur.acheter("un jeu", 2);
		professeur.acheter("un kimono", 50);
		
		Commerçant marco = new Commerçant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		Ronin ronin = new Ronin("Roro", "shochu", 60);
		ronin.direBonjour();
		ronin.donner(marco);
		ronin.provoquer(yaku);
	}
}

