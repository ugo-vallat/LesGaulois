package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		System.out.println("Un nouveau village apparaît : " + nom + "\n");
	}
	public String getNom() {
		return nom;
	}
	public int getTaille() {
		return nbVillageoisMaximum;
	}
	public Chef getChef() {
		return chef;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		System.out.println("Le village à un nouveau chef : " + chef.getNom());
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < nbVillageoisMaximum) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			System.out.println(gaulois.getNom() + " à rejoind le village !!\n");
		} else {
			System.out.println("Le village est déjà complet.\n");
		}

	}
	
	public Gaulois trouverHabitant(int ref) {
		if (ref < nbVillageois) {
			return (villageois[ref]);
		} else {
			System.out.println("Habitant introuvable\n");
			return null;
		}
	}
	
	 public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println(" - " + villageois[i].getNom());
		}

	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		village.trouverHabitant(2);
		
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		
		Gaulois gaulois = village.trouverHabitant(0);
		System.out.println(gaulois.getNom());
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
	
	
}
