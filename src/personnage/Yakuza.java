package personnage;

import personnage.Commerçant;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 6;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentExtorque = victime.seFaireExtorquer();
		reputation++;
		gagnerArgent(argentExtorque);
		parler("J’ai piqué les " + argentExtorque + " sous de " + victime.getNom()+ ", ce qui me fait " + getArgent() + " dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int sommePerdue = getArgent();
		perdreArgent(sommePerdue);
		reputation--;
		parler("J’ai perdu mon duel et mes "+ sommePerdue+ " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		return sommePerdue;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
}