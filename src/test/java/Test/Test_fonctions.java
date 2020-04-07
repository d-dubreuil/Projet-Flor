package Test;

import model.Caracteristique;
import model.CompteUtilisateur;
import model.Panier;
import model.Produit;
import model.ReferentielCaracteristique;
import model.Selection;
import model.TypeCarac;
import model.TypeUtilisateur;
import model.Utilisateur;
import model.Paiement;
import singleton.Application;

public class Test_fonctions {

	public static void main(String[] args) {
		testCRUD();

	}

	public static void testCRUD() {
		Utilisateur util1 = new Utilisateur(TypeUtilisateur.Fournisseur);
		Paiement pai1 = new Paiement("1564 8554 8793 5456", 29.99f);

		util1 = Application.getInstance().getUtilisateurDao().save(util1);
		
		System.out.println(Application.getInstance().getUtilisateurDao().find(util1.getId()));
		pai1 = Application.getInstance().getPaiementDao().save(pai1);

		util1.setDisc(TypeUtilisateur.Administrateur);
		util1 = Application.getInstance().getUtilisateurDao().save(util1);
		System.out.println(Application.getInstance().getUtilisateurDao().find(util1.getId()));
		
		System.out.println(Application.getInstance().getUtilisateurDao().findAll());
//		Application.getInstance().getUtilisateurDao().delete(util1);
//		System.out.println(Application.getInstance().getUtilisateurDao().findAll());
		System.out.println(Application.getInstance().getPaiementDao().find(pai1.getId()));

		pai1.setMontant(34.99f);

		pai1 = Application.getInstance().getPaiementDao().save(pai1);
		System.out.println(Application.getInstance().getPaiementDao().find(pai1.getId()));

		System.out.println(Application.getInstance().getPaiementDao().findAll());
		Application.getInstance().getPaiementDao().delete(pai1);
		System.out.println(Application.getInstance().getPaiementDao().findAll());
	}

}
