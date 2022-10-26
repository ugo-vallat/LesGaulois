package personnages;

public class Musee {
	private String nom;
	private Trophee [] collection;
	private int nbTrophee = 0;
	private int tailleMusee = 200;
	
	
	public Musee(String nom) {
		super();
		this.nom = nom;
		this.collection = new Trophee[tailleMusee];
	}
	public String getNom() {
		return nom;
	}
	
	public void donnerTrophees(Gaulois gaulois, Trophee trophee) {
        if (nbTrophee >= 200) {
            throw new IllegalArgumentException("Musee complet, trophee rejeté :" + trophee.getEquipement());
        } else {
            collection[nbTrophee] = trophee;
            nbTrophee++;
//            System.out.println(gaulois.getNom() + "vient d'ajouter le trophee " + equipement.getNom() + " au musee.\n");
        }
    }

	
	public String extraireInstructionsCaml() {
		String texte = "let " + this.nom + " = [\n";
		for (int i = 0; i < nbTrophee; i++) {
			texte = texte +  "\t\"" + collection[i].getNomDonnateur() + "\", \"" 
					+ collection[i].getNomTrophee() + "\";\n";
		}
		texte += "]";
		return(texte);
	}
	

}

