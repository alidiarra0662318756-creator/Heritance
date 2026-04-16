package personnage;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private int nbConnaissance;
	private int maxCon=3;
	protected Humain[] memoire= new Humain[maxCon];
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
	}
	
	public void boire() {
			parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent > prix - 1) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à "+ prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent+ " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix+ " sous.");
		}
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	protected void gagnerArgent(int sommeGagnee) {
		argent += sommeGagnee;
	}
	
	protected void perdreArgent(int sommePerdue) {
		argent -= sommePerdue;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	private void repondre(Humain autreHumain) {
		this.direBonjour();
		this.memoriser(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		if (nbConnaissance<maxCon) {
			memoire[nbConnaissance]= autreHumain;
			nbConnaissance++;
		} else {
			for (int i=1; i<maxCon;i++) {
				memoire[i-1]=memoire[i];
			}
			memoire[nbConnaissance-1]=autreHumain;
		}
	}
	
	public void listerConnaissance() {
		System.out.print("Je connais beaucoup de monde dont:");
		for (int i = 0; i<nbConnaissance; i++) {
			if (i+1<nbConnaissance) {
				System.out.print(memoire[i].getNom()+", ");
			}else {
				System.out.println(memoire[i].getNom());
			}
		}
	}
}
