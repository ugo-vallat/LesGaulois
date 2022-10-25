package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int forcePotion = 1;
	private int effetPotionMin;
	private int effetPotionMax;
	private Random rand  = new Random();


	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMax = effetPotionMax;
		this.effetPotionMin = effetPotionMin;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " 
		+ effetPotionMin + " à " + effetPotionMax + "." );
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»\n");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public int preparerPotion() {
		parler("Je vais aller préparer une petite potion...");
		forcePotion = effetPotionMin + rand.nextInt(effetPotionMax - effetPotionMin + 1);
		if (forcePotion > 7) {
			parler(" J'ai préparé une super potion de force " + forcePotion);
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
		}
		return forcePotion;
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() != null &&  gaulois.getNom().equals("Obélix")) {
			parler(" Non, Obélix !... Tu n’auras pas de potion magique ! ");
		} else {
			gaulois.boirePotion(forcePotion);
		}

	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		
	}

}
