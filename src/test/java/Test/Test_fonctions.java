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
import singleton.Application;

public class Test_fonctions {

	public static void main(String[] args) {
		testCRUD();

	}
	public static void testCRUD() {
		Utilisateur util1 = new Utilisateur(TypeUtilisateur.Fournisseur);

		util1 = Application.getInstance().getUtilisateurDao().save(util1);
		
		System.out.println(Application.getInstance().getUtilisateurDao().find(util1.getId()));

		util1.setDisc(TypeUtilisateur.Administrateur);
		util1 = Application.getInstance().getUtilisateurDao().save(util1);
		System.out.println(Application.getInstance().getUtilisateurDao().find(util1.getId()));
		
		System.out.println(Application.getInstance().getUtilisateurDao().findAll());
//		Application.getInstance().getUtilisateurDao().delete(util1);
//		System.out.println(Application.getInstance().getUtilisateurDao().findAll());
	}

}
