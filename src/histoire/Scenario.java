package histoire;
import personnages.*;


public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 20, 2);
		Romain minus = new Romain("Minus", 10);
		Gaulois obelix = new Gaulois("Ob�lix", 50, 3);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("bonjour");
		minus.parler("UN GAU... UN GAULOIS !!");
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
