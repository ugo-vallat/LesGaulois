package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int attaque = 2;
	private int effetPotion;
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		System.out.println(nom + " rejoind la partie !!\n");
	}

	public String getNom() {
		return nom;
	}
	
	public int getAttaque() {
		return attaque*effetPotion;
	}
	
	public void setAttaque(int attaque) {
		this.attaque = attaque;
		System.out.println("La force de " + nom + " passe à : " + attaque + "\n");
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte + " » \n");

	}
	
	private String prendreParole() {
		return("Le gaulois " + nom + " : ");
	}
	
	public void frapper(Romain romain) {
		System.out.println("Le Gaulois " + nom + " chatouille le romain " + romain.getNom() + " et lui infflige " + getAttaque() 
				+ " points de dommages (RIP l'amitié)\n");
		romain.recevoirCoup(getAttaque());
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que mon attaque est "+ effetPotion + " fois décuplée.");

	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
		Romain jules = new Romain("JulesDu31", 2);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		asterix.parler("tabernacle mon brave");
		asterix.frapper(jules);
		asterix.boirePotion(panoramix.preparerPotion());
	}
	

}
