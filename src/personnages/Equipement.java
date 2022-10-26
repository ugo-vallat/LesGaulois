package personnages;

public enum Equipement {
	CASQUE ("casque"),
	BOUCLIER ("bouclier"),
	EPEE ("epee");
	
	private String nom;
	
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
}
