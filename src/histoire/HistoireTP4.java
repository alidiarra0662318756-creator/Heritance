package histoire;

import personnage.Humain;

public class HistoireTP4 {
	public void main() {
		Humain professeur = new Humain("Prof", "kombucha", 54);
		professeur.direBonjour();
		professeur.acheter("une boisson", 12);
		professeur.boire();
		professeur.acheter("un jeu", 2);
		professeur.acheter("un kimono", 50);
	}
}

