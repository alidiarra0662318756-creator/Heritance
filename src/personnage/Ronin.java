package personnage;

public class Ronin extends Humain {
	private int honneur = 1;
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	public int getHonneur() {
		return honneur;
	}
	public void donner(Commerçant beneficiaire) {
		int don = getArgent() * 10 / 100;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		perdreArgent(don);
		honneur++;
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int maForce = honneur *2;
		int forceEnnemie = adversaire.getReputation();
		if (maForce >= forceEnnemie) {
			parler("Je t’ai eu petit yakusa!");
			honneur++;
			gagnerArgent(adversaire.perdre());
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honneur--;
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
		}
	}
}