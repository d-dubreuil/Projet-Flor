package Test;

import Singleton.Application;
import model.Caracteristique;
import model.TypeCarac;

public class Test_fonctions {

	public static void main(String[] args) {
		testCRUD();

	}
	public static void testCRUD() {
		Caracteristique carac1 = new Caracteristique("taille","Haute",TypeCarac.Flore);

		carac1 = Application.getInstance().getCaracteristiqueDao().save(carac1);
		
		System.out.println(Application.getInstance().getCaracteristiqueDao().find(carac1.getId()));

		carac1.setNom("Allemagne");
		carac1 = Application.getInstance().getCaracteristiqueDao().save(carac1);
		System.out.println(Application.getInstance().getCaracteristiqueDao().find(carac1.getId()));
		
		System.out.println(Application.getInstance().getCaracteristiqueDao().findAll());
		Application.getInstance().getCaracteristiqueDao().delete(carac1);
		System.out.println(Application.getInstance().getCaracteristiqueDao().findAll());
	}

}
