package personnages;


public class Romain {
	private String nom;
	private int force;
	private Equipement [] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		super();
		if (force <= 0) {
		throw new IllegalArgumentException( "Erreur force : " + force);
		}
		this.nom = nom;
		this.force = force;
		System.out.println(nom + " rejoind la partie !!\n");
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�\n");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "coup romain mort";
		int var = force;
		force -= forceCoup;
		assert var > force : "coup sans effet";
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2: {
			System.out.println("Le soldat " + nom + " est d�j� bien prot�g� !");
			break;
		}
		
		case 1 : {
			if (equipement == equipements[0]) {
				System.out.println("Le soldat " + nom + " poss�de d�j� un " + equipement.toString() + " !");
			} else {
				ajouterEquipemet(equipement);
			}
			break;
		}
		case 0 : {
			ajouterEquipemet(equipement);
			break;
		}
		default:
			System.out.println("Nombre equipements invalide: " + nbEquipement);
			break;
		}

	}
	
	private void ajouterEquipemet(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s��quipe avec un " + equipement.toString());

	}

	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	public static void main(String[] args) {
		Romain jules = new Romain("JulesDu31", 6);
		jules.parler("Hum hum");
		jules.recevoirCoup(1);
		
		Equipement bouclier = Equipement.BOUCLIER;
		Equipement casque = Equipement.CASQUE;
		
		jules.sEquiper(casque);
		jules.sEquiper(casque);
		jules.sEquiper(bouclier);
		jules.sEquiper(casque);
	}
}