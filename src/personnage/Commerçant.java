package personnage;

import personnage.Humain;

public class Commerçant extends Humain {
	public Commerçant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	public int seFaireExtorquer() {
		int argentDerobe = getArgent();
		perdreArgent(argentDerobe);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentDerobe;
	}
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
}
