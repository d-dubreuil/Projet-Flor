package Test;

import model.Paiement;
import singleton.Application;

public class Test_fonctions {

	public static void main(String[] args) {
		testCRUD();

	}

	public static void testCRUD() {
		Paiement pai1 = new Paiement("1564 8554 8793 5456", 29.99f);

		pai1 = Application.getInstance().getPaiementDao().save(pai1);

		System.out.println(Application.getInstance().getPaiementDao().find(pai1.getId()));

		pai1.setMontant(34.99f);

		pai1 = Application.getInstance().getPaiementDao().save(pai1);
		System.out.println(Application.getInstance().getPaiementDao().find(pai1.getId()));

		System.out.println(Application.getInstance().getPaiementDao().findAll());
		Application.getInstance().getPaiementDao().delete(pai1);
		System.out.println(Application.getInstance().getPaiementDao().findAll());
	}

}
