package Test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.interfaces.ICaracteristiqueRepository;
import dao.interfaces.ICommandeRepository;
import dao.interfaces.ICompteUtilisateurRepository;
import dao.interfaces.IConseilRepository;
import dao.interfaces.IFauneRepository;
import dao.interfaces.IFavorisRepository;
import dao.interfaces.IFloreRepository;
import dao.interfaces.IHistoriqueRepository;
import dao.interfaces.IJardinRepository;
import dao.interfaces.IPaiementRepository;
import dao.interfaces.IPanierRepository;
import dao.interfaces.IProduitRepository;
import dao.interfaces.IReferentielCaracteristiqueRepository;
import dao.interfaces.IReferentielFauneRepository;
import dao.interfaces.IReferentielUtilisateurRepository;
import dao.interfaces.ISelectionRepository;
import dao.interfaces.IUtilisateurRepository;
import model.Caracteristique;
import model.Commande;
import model.CompteUtilisateur;
import model.Conseil;
import model.Faune;
import model.Favoris;
import model.Flore;
import model.Historique;
import model.Jardin;
import model.Paiement;
import model.Panier;
import model.Produit;
import model.ReferentielCaracteristique;
import model.ReferentielFaune;
import model.ReferentielUtilisateur;
import model.Selection;
import model.TypeCarac;
import model.TypeUtilisateur;
import model.Utilisateur;


public class Test_vide {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		
		ICaracteristiqueRepository caracteristiqueDao = context.getBean(ICaracteristiqueRepository.class);
		ICommandeRepository commandeDao = context.getBean(ICommandeRepository.class);
		ICompteUtilisateurRepository compteUtilisateurDao = context.getBean(ICompteUtilisateurRepository.class);
		IConseilRepository conseilDao = context.getBean(IConseilRepository.class);
		IFauneRepository fauneDao = context.getBean(IFauneRepository.class);
		IFloreRepository floreDao = context.getBean(IFloreRepository.class);
		IHistoriqueRepository historiqueDao = context.getBean(IHistoriqueRepository.class);
		IPaiementRepository paiementDao = context.getBean(IPaiementRepository.class);
		IProduitRepository produitDao = context.getBean(IProduitRepository.class);
		IReferentielCaracteristiqueRepository referentielCaracteristiqueDao = context.getBean(IReferentielCaracteristiqueRepository.class);
		IReferentielFauneRepository referentielFauneDao = context.getBean(IReferentielFauneRepository.class);
		IReferentielUtilisateurRepository referentielUtilisateurDao = context.getBean(IReferentielUtilisateurRepository.class);
		ISelectionRepository selectionDao = context.getBean(ISelectionRepository.class);
		IUtilisateurRepository utilisateurDao = context.getBean(IUtilisateurRepository.class);
		IPanierRepository panierDao = context.getBean(IPanierRepository.class);
		IFavorisRepository favorisDao = context.getBean(IFavorisRepository.class);
		IJardinRepository jardinDao = context.getBean(IJardinRepository.class);

		Historique historique1 = new Historique("faune", "fraises");

		historique1 = historiqueDao.save(historique1);

		CompteUtilisateur compte1 = new CompteUtilisateur("manoncharles", "mdp", "charles.manon@yahoo.com", "Charles",
				"21 avenue Colonel Pierre Bourgoin", "Maison D10", "33127", "Martignas sur Jalle", "06.35.24.43.32");

		compte1 = compteUtilisateurDao.save(compte1);

		historique1.setCompte(compte1);
		historique1 = historiqueDao.save(historique1);

		Utilisateur contrib1 = new Utilisateur(TypeUtilisateur.Contributeur);

		contrib1 = utilisateurDao.save(contrib1);

		contrib1.setCompteUtilisateur(compte1);
		contrib1 = utilisateurDao.save(contrib1);

		Conseil cons1 = new Conseil("La bouillie bordelaise en traitement de certaines maladies");
		cons1.setUtilisateur(contrib1);
		cons1 = conseilDao.save(cons1);

		Caracteristique cycle1 = new Caracteristique("Cycle de vie", "vivace", TypeCarac.Flore);
		Caracteristique type1 = new Caracteristique("Type de fraisier", "remontant", TypeCarac.Flore);
		Caracteristique plantation1 = new Caracteristique("Plantation", "automne", TypeCarac.Flore);
		Caracteristique recolte1 = new Caracteristique("Récolte", "mi-juin à fin juillet", TypeCarac.Flore);
		Caracteristique usage1 = new Caracteristique("Usage", "comestible", TypeCarac.Utilisation);
		Caracteristique predateur1 = new Caracteristique("Prédateurs", "limaces", TypeCarac.Faune);
		Caracteristique ensoleillement1 = new Caracteristique("Ensoleillement", "plein soleil", TypeCarac.Meteo);
		Caracteristique temperature1 = new Caracteristique("Température idéale", "entre 10 et 25°C", TypeCarac.Meteo);
		Caracteristique texture1 = new Caracteristique("Type de sol", "sol humifère meuble et sableux", TypeCarac.Sol);
		Caracteristique pH1 = new Caracteristique("pH du sol", "5,5 à 7,5 : acide à neutre", TypeCarac.Sol);
		Caracteristique arrosage1 = new Caracteristique("Arrosage", "arrosage sans excès", TypeCarac.Sol);

		cycle1 = caracteristiqueDao.save(cycle1);
		type1 = caracteristiqueDao.save(type1);
		plantation1 = caracteristiqueDao.save(plantation1);
		recolte1 = caracteristiqueDao.save(recolte1);
		usage1 = caracteristiqueDao.save(usage1);
		predateur1 = caracteristiqueDao.save(predateur1);
		ensoleillement1 = caracteristiqueDao.save(ensoleillement1);
		temperature1 = caracteristiqueDao.save(temperature1);
		texture1 = caracteristiqueDao.save(texture1);
		pH1 = caracteristiqueDao.save(pH1);
		arrosage1 = caracteristiqueDao.save(arrosage1);

		ReferentielCaracteristique ref1 = new ReferentielCaracteristique();
		ref1 = referentielCaracteristiqueDao.save(ref1);
		ref1.setCaracteristique(cycle1);
		ref1.setCaracteristique(type1);
		ref1.setCaracteristique(plantation1);
		ref1.setCaracteristique(recolte1);
		ref1.setCaracteristique(usage1);
		ref1.setCaracteristique(predateur1);
		ref1.setCaracteristique(ensoleillement1);
		ref1.setCaracteristique(temperature1);
		ref1.setCaracteristique(texture1);
		ref1.setCaracteristique(pH1);
		ref1.setCaracteristique(arrosage1);

		Flore fraisier = new Flore("Fraisier mariguette");
		fraisier = floreDao.save(fraisier);
		ref1.setFlore(fraisier);
		ref1 = referentielCaracteristiqueDao.save(ref1);

		fraisier.addUtilisateurs(contrib1);
		fraisier = floreDao.save(fraisier);

		ReferentielUtilisateur refuti1 = new ReferentielUtilisateur();
		refuti1.setCompteUtilisateur(compte1);
		refuti1.setCaracteristique(texture1);
		refuti1.setCaracteristique(pH1);
		refuti1 = referentielUtilisateurDao.save(refuti1);

		Faune limace = new Faune("Limace");
		limace = fauneDao.save(limace);
		ReferentielFaune ref2 = new ReferentielFaune();
		ref2 = referentielFauneDao.save(ref2);
		ref2.setFaune(limace);
		ref2.setCaracteristique(predateur1);
		ref2.setFlore(fraisier);
		ref2 = referentielFauneDao.save(ref2);

		Produit prod1 = new Produit(123, 29.99f, "Gamm Vert", 25);
		prod1 = produitDao.save(prod1);
		prod1.setFlore(fraisier);
		prod1.setFaune(limace);
		prod1.setUtilisateur(contrib1);
		prod1 = produitDao.save(prod1);

		Selection s1 = new Selection(1);
		s1.setProduit(prod1);
		s1 = selectionDao.save(s1);

		Panier panier1 = new Panier(29.99f);
		panier1 = panierDao.save(panier1);
		s1.setPanier(panier1);
		panier1.setUtilisateur(contrib1);
		panier1 = panierDao.save(panier1);
		Commande com1 = new Commande(4561, "postal", 29.99f);
		com1 = commandeDao.save(com1);
		com1.setPanier(panier1);
		Paiement pai1 = new Paiement("1234 1234 1234 1234", 29.99f);
		pai1 = paiementDao.save(pai1);
		com1.setPaiement(pai1);
		panier1 = panierDao.save(panier1);
		s1 = selectionDao.save(s1);
		com1 = commandeDao.save(com1);
		pai1 = paiementDao.save(pai1);

		Favoris fav1 = new Favoris("Fraises mariguette");
		fav1 = favorisDao.save(fav1);
		fav1.setCompteUtilisateur(compte1);
		fav1.addFlore(fraisier);
		fav1 = favorisDao.save(fav1);
		
		Jardin jar1 = new Jardin("Mon petit jardin");
		jar1 = jardinDao.save(jar1);
		jar1.setCompteUtilisateur(compte1);
		jar1.addFlores(fraisier);
		jar1 = jardinDao.save(jar1);

		contrib1.addFlores(fraisier);
		contrib1=utilisateurDao.save(contrib1);
		
		Caracteristique cycleAnnuelle = new Caracteristique("cycleDeVie", "annuelle", TypeCarac.Flore);
		Caracteristique typeGrimpant = new Caracteristique("strate", "grimpant", TypeCarac.Flore);
		Caracteristique debutPlantationAvril = new Caracteristique("debutPlantation", "avril", TypeCarac.Flore);
		Caracteristique finPlantationAout = new Caracteristique("finPlantation", "aout", TypeCarac.Flore);
		Caracteristique debutRecolteJuin = new Caracteristique("debutRecolte", "juin", TypeCarac.Flore);
		Caracteristique finRecolteSeptembre = new Caracteristique("finRecolte", "septembre", TypeCarac.Flore);
		Caracteristique usageComestible = new Caracteristique("usage", "comestible", TypeCarac.Utilisation);
		Caracteristique predateurPuceron = new Caracteristique("predateurs", "puceron", TypeCarac.Faune);
		Caracteristique ensoleillementPleinSoleil = new Caracteristique("ensoleillement", "soleil", TypeCarac.Meteo);
		Caracteristique resistanceAuFroidFragile = new Caracteristique("resistanceAuFroid", "fragile", TypeCarac.Meteo);
		Caracteristique typeDeSolSableux = new Caracteristique("typeDeSol", "sableux", TypeCarac.Sol);
		Caracteristique phNeutre = new Caracteristique("ph", "neutre", TypeCarac.Sol);
		Caracteristique arrosageMoyen = new Caracteristique("arrosage", "moyen", TypeCarac.Sol);
		Caracteristique entretienModere = new Caracteristique("entretien", "modere", TypeCarac.Flore);
		
		cycleAnnuelle = caracteristiqueDao.save(cycleAnnuelle);
		typeGrimpant = caracteristiqueDao.save(typeGrimpant);
		debutPlantationAvril = caracteristiqueDao.save(debutPlantationAvril);
		finPlantationAout = caracteristiqueDao.save(finPlantationAout);
		debutRecolteJuin = caracteristiqueDao.save(debutRecolteJuin);
		finRecolteSeptembre = caracteristiqueDao.save(finRecolteSeptembre);
		usageComestible = caracteristiqueDao.save(usageComestible);
		predateurPuceron = caracteristiqueDao.save(predateurPuceron);
		ensoleillementPleinSoleil = caracteristiqueDao.save(ensoleillementPleinSoleil);
		resistanceAuFroidFragile = caracteristiqueDao.save(resistanceAuFroidFragile);
		typeDeSolSableux = caracteristiqueDao.save(typeDeSolSableux);
		phNeutre = caracteristiqueDao.save(phNeutre);
		arrosageMoyen = caracteristiqueDao.save(arrosageMoyen);
		entretienModere = caracteristiqueDao.save(entretienModere);
		
		Flore haricot = new Flore("haricot");
		haricot = floreDao.save(haricot);
			
		ReferentielCaracteristique refCaracCycleHaricot = new ReferentielCaracteristique();
		refCaracCycleHaricot = referentielCaracteristiqueDao.save(refCaracCycleHaricot);
		refCaracCycleHaricot.setCaracteristique(cycleAnnuelle);
		refCaracCycleHaricot.setFlore(haricot);
		refCaracCycleHaricot = referentielCaracteristiqueDao.save(refCaracCycleHaricot);

		
		ReferentielCaracteristique refCaracTypeHaricot = new ReferentielCaracteristique();
		refCaracTypeHaricot = referentielCaracteristiqueDao.save(refCaracTypeHaricot);
		refCaracTypeHaricot.setCaracteristique(typeGrimpant);
		refCaracTypeHaricot.setFlore(haricot);
		refCaracTypeHaricot = referentielCaracteristiqueDao.save(refCaracTypeHaricot);

		ReferentielCaracteristique refCaracDebutPlantationHaricot = new ReferentielCaracteristique();
		refCaracDebutPlantationHaricot = referentielCaracteristiqueDao.save(refCaracDebutPlantationHaricot);
		refCaracDebutPlantationHaricot.setCaracteristique(debutPlantationAvril);
		refCaracDebutPlantationHaricot.setFlore(haricot); 
		refCaracDebutPlantationHaricot = referentielCaracteristiqueDao.save(refCaracDebutPlantationHaricot);

		ReferentielCaracteristique refCaracFinPlantationHaricot = new ReferentielCaracteristique();
		refCaracFinPlantationHaricot = referentielCaracteristiqueDao.save(refCaracFinPlantationHaricot);
		refCaracFinPlantationHaricot.setCaracteristique(finPlantationAout);
		refCaracFinPlantationHaricot.setFlore(haricot); 
		refCaracFinPlantationHaricot = referentielCaracteristiqueDao.save(refCaracFinPlantationHaricot);
	
		ReferentielCaracteristique refCaracDebutRecolteHaricot = new ReferentielCaracteristique();
		refCaracDebutRecolteHaricot = referentielCaracteristiqueDao.save(refCaracDebutRecolteHaricot);
		refCaracDebutRecolteHaricot.setCaracteristique(debutRecolteJuin);
		refCaracDebutRecolteHaricot.setFlore(haricot);
		refCaracDebutRecolteHaricot = referentielCaracteristiqueDao.save(refCaracDebutRecolteHaricot);

		ReferentielCaracteristique refCaracFinRecolteHaricot = new ReferentielCaracteristique();
		refCaracFinRecolteHaricot = referentielCaracteristiqueDao.save(refCaracFinRecolteHaricot);
		refCaracFinRecolteHaricot.setCaracteristique(finRecolteSeptembre);
		refCaracFinRecolteHaricot.setFlore(haricot);
		refCaracFinRecolteHaricot = referentielCaracteristiqueDao.save(refCaracFinRecolteHaricot);

		ReferentielCaracteristique refCaracUsageHaricot = new ReferentielCaracteristique();
		refCaracUsageHaricot = referentielCaracteristiqueDao.save(refCaracUsageHaricot);
		refCaracUsageHaricot.setCaracteristique(usageComestible);
		refCaracUsageHaricot.setFlore(haricot);
		refCaracUsageHaricot = referentielCaracteristiqueDao.save(refCaracUsageHaricot);

		ReferentielCaracteristique refCaracPredateurHaricot = new ReferentielCaracteristique();
		refCaracPredateurHaricot = referentielCaracteristiqueDao.save(refCaracPredateurHaricot);
		refCaracPredateurHaricot.setCaracteristique(predateurPuceron);
		refCaracPredateurHaricot.setFlore(haricot);
		refCaracPredateurHaricot = referentielCaracteristiqueDao.save(refCaracPredateurHaricot);

		ReferentielCaracteristique refCaracEnsoleillementHaricot = new ReferentielCaracteristique();
		refCaracEnsoleillementHaricot = referentielCaracteristiqueDao.save(refCaracEnsoleillementHaricot);
		refCaracEnsoleillementHaricot.setCaracteristique(ensoleillementPleinSoleil);
		refCaracEnsoleillementHaricot.setFlore(haricot);
		refCaracEnsoleillementHaricot = referentielCaracteristiqueDao.save(refCaracEnsoleillementHaricot);

		ReferentielCaracteristique refCaracResistanceFroidHaricot = new ReferentielCaracteristique();
		refCaracResistanceFroidHaricot = referentielCaracteristiqueDao.save(refCaracResistanceFroidHaricot);
		refCaracResistanceFroidHaricot.setCaracteristique(resistanceAuFroidFragile);
		refCaracResistanceFroidHaricot.setFlore(haricot);
		refCaracResistanceFroidHaricot = referentielCaracteristiqueDao.save(refCaracResistanceFroidHaricot);

		ReferentielCaracteristique refCaracTypeSolHaricot = new ReferentielCaracteristique();
		refCaracTypeSolHaricot = referentielCaracteristiqueDao.save(refCaracTypeSolHaricot);
		refCaracTypeSolHaricot.setCaracteristique(typeDeSolSableux);
		refCaracTypeSolHaricot.setFlore(haricot);
		refCaracTypeSolHaricot = referentielCaracteristiqueDao.save(refCaracTypeSolHaricot);

		ReferentielCaracteristique refCaracPhHaricot = new ReferentielCaracteristique();
		refCaracPhHaricot = referentielCaracteristiqueDao.save(refCaracPhHaricot);
		refCaracPhHaricot.setCaracteristique(phNeutre);
		refCaracPhHaricot.setFlore(haricot);
		refCaracPhHaricot = referentielCaracteristiqueDao.save(refCaracPhHaricot);

		ReferentielCaracteristique refCaracArrosageHaricot = new ReferentielCaracteristique();
		refCaracArrosageHaricot = referentielCaracteristiqueDao.save(refCaracArrosageHaricot);
		refCaracArrosageHaricot.setCaracteristique(arrosageMoyen);
		refCaracArrosageHaricot.setFlore(haricot);
		refCaracArrosageHaricot = referentielCaracteristiqueDao.save(refCaracArrosageHaricot);

		ReferentielCaracteristique refCaracEntretienHaricot = new ReferentielCaracteristique();
		refCaracEntretienHaricot = referentielCaracteristiqueDao.save(refCaracEntretienHaricot);
		refCaracEntretienHaricot.setCaracteristique(entretienModere);
		refCaracEntretienHaricot.setFlore(haricot);
		refCaracEntretienHaricot = referentielCaracteristiqueDao.save(refCaracEntretienHaricot);
		
		Caracteristique typeCouvrant = new Caracteristique("strate", "couvrant", TypeCarac.Flore);
		Caracteristique debutPlantationMai = new Caracteristique("debutPlantation", "mai", TypeCarac.Flore);
		Caracteristique finPlantationJuin = new Caracteristique("finPlantation", "juin", TypeCarac.Flore);
		Caracteristique debutRecolteJuillet = new Caracteristique("debutRecolte", "juillet", TypeCarac.Flore);
		Caracteristique finRecolteOctobre = new Caracteristique("finRecolte", "octobre", TypeCarac.Flore);
		Caracteristique predateurPunaise = new Caracteristique("predateurs", "punaise", TypeCarac.Faune);
		Caracteristique typeDeSolHumus = new Caracteristique("typeDeSol", "humus", TypeCarac.Sol);
		Caracteristique arrosageImportant = new Caracteristique("arrosage", "important", TypeCarac.Sol);
		Caracteristique entretienFacile = new Caracteristique("entretien", "facile", TypeCarac.Flore);
		
		typeCouvrant = caracteristiqueDao.save(typeCouvrant);
		predateurPunaise=caracteristiqueDao.save(predateurPunaise);
		debutPlantationMai = caracteristiqueDao.save(debutPlantationMai);
		finPlantationJuin = caracteristiqueDao.save(finPlantationJuin);
		debutRecolteJuillet = caracteristiqueDao.save(debutRecolteJuillet);
		finRecolteOctobre = caracteristiqueDao.save(finRecolteOctobre);
		predateurPuceron = caracteristiqueDao.save(predateurPuceron);
		typeDeSolHumus = caracteristiqueDao.save(typeDeSolHumus);
		arrosageImportant = caracteristiqueDao.save(arrosageImportant);
		entretienFacile = caracteristiqueDao.save(entretienFacile);
		
		Flore courge = new Flore("courge");
		courge = floreDao.save(courge);
			
		ReferentielCaracteristique refCaracCycleCourge = new ReferentielCaracteristique();
		refCaracCycleCourge = referentielCaracteristiqueDao.save(refCaracCycleCourge);
		refCaracCycleCourge.setCaracteristique(cycleAnnuelle);
		refCaracCycleCourge.setFlore(courge);
		refCaracCycleCourge = referentielCaracteristiqueDao.save(refCaracCycleCourge);

		
		ReferentielCaracteristique refCaracTypeCourge = new ReferentielCaracteristique();
		refCaracTypeCourge = referentielCaracteristiqueDao.save(refCaracTypeCourge);
		refCaracTypeCourge.setCaracteristique(typeCouvrant);
		refCaracTypeCourge.setFlore(courge);
		refCaracTypeCourge = referentielCaracteristiqueDao.save(refCaracTypeCourge);

		ReferentielCaracteristique refCaracDebutPlantationCourge = new ReferentielCaracteristique();
		refCaracDebutPlantationCourge = referentielCaracteristiqueDao.save(refCaracDebutPlantationCourge);
		refCaracDebutPlantationCourge.setCaracteristique(debutPlantationMai);
		refCaracDebutPlantationCourge.setFlore(courge); 
		refCaracDebutPlantationCourge = referentielCaracteristiqueDao.save(refCaracDebutPlantationCourge);

		ReferentielCaracteristique refCaracFinPlantationCourge = new ReferentielCaracteristique();
		refCaracFinPlantationCourge = referentielCaracteristiqueDao.save(refCaracFinPlantationCourge);
		refCaracFinPlantationCourge.setCaracteristique(finPlantationJuin);
		refCaracFinPlantationCourge.setFlore(courge); 
		refCaracFinPlantationCourge = referentielCaracteristiqueDao.save(refCaracFinPlantationCourge);
	
		ReferentielCaracteristique refCaracDebutRecolteCourge = new ReferentielCaracteristique();
		refCaracDebutRecolteCourge = referentielCaracteristiqueDao.save(refCaracDebutRecolteCourge);
		refCaracDebutRecolteCourge.setCaracteristique(debutRecolteJuillet);
		refCaracDebutRecolteCourge.setFlore(courge);
		refCaracDebutRecolteCourge = referentielCaracteristiqueDao.save(refCaracDebutRecolteCourge);

		ReferentielCaracteristique refCaracFinRecolteCourge = new ReferentielCaracteristique();
		refCaracFinRecolteCourge = referentielCaracteristiqueDao.save(refCaracFinRecolteCourge);
		refCaracFinRecolteCourge.setCaracteristique(finRecolteOctobre);
		refCaracFinRecolteCourge.setFlore(courge);
		refCaracFinRecolteCourge = referentielCaracteristiqueDao.save(refCaracFinRecolteCourge);

		ReferentielCaracteristique refCaracUsageCourge = new ReferentielCaracteristique();
		refCaracUsageCourge = referentielCaracteristiqueDao.save(refCaracUsageCourge);
		refCaracUsageCourge.setCaracteristique(usageComestible);
		refCaracUsageCourge.setFlore(courge);
		refCaracUsageCourge = referentielCaracteristiqueDao.save(refCaracUsageCourge);

		ReferentielCaracteristique refCaracPredateurCourge = new ReferentielCaracteristique();
		refCaracPredateurCourge = referentielCaracteristiqueDao.save(refCaracPredateurCourge);
		refCaracPredateurCourge.setCaracteristique(predateurPunaise);
		refCaracPredateurCourge.setFlore(courge);
		refCaracPredateurCourge = referentielCaracteristiqueDao.save(refCaracPredateurCourge);

		ReferentielCaracteristique refCaracEnsoleillementCourge = new ReferentielCaracteristique();
		refCaracEnsoleillementCourge = referentielCaracteristiqueDao.save(refCaracEnsoleillementCourge);
		refCaracEnsoleillementCourge.setCaracteristique(ensoleillementPleinSoleil);
		refCaracEnsoleillementCourge.setFlore(courge);
		refCaracEnsoleillementCourge = referentielCaracteristiqueDao.save(refCaracEnsoleillementCourge);

		ReferentielCaracteristique refCaracResistanceFroidCourge = new ReferentielCaracteristique();
		refCaracResistanceFroidCourge = referentielCaracteristiqueDao.save(refCaracResistanceFroidCourge);
		refCaracResistanceFroidCourge.setCaracteristique(resistanceAuFroidFragile);
		refCaracResistanceFroidCourge.setFlore(courge);
		refCaracResistanceFroidCourge = referentielCaracteristiqueDao.save(refCaracResistanceFroidCourge);

		ReferentielCaracteristique refCaracTypeSolCourge = new ReferentielCaracteristique();
		refCaracTypeSolCourge = referentielCaracteristiqueDao.save(refCaracTypeSolCourge);
		refCaracTypeSolCourge.setCaracteristique(typeDeSolHumus);
		refCaracTypeSolCourge.setFlore(courge);
		refCaracTypeSolCourge = referentielCaracteristiqueDao.save(refCaracTypeSolCourge);

		ReferentielCaracteristique refCaracPhCourge = new ReferentielCaracteristique();
		refCaracPhCourge = referentielCaracteristiqueDao.save(refCaracPhCourge);
		refCaracPhCourge.setCaracteristique(phNeutre);
		refCaracPhCourge.setFlore(courge);
		refCaracPhCourge = referentielCaracteristiqueDao.save(refCaracPhCourge);

		ReferentielCaracteristique refCaracArrosageCourge = new ReferentielCaracteristique();
		refCaracArrosageCourge = referentielCaracteristiqueDao.save(refCaracArrosageCourge);
		refCaracArrosageCourge.setCaracteristique(arrosageImportant);
		refCaracArrosageCourge.setFlore(courge);
		refCaracArrosageCourge = referentielCaracteristiqueDao.save(refCaracArrosageCourge);

		ReferentielCaracteristique refCaracEntretienCourge = new ReferentielCaracteristique();
		refCaracEntretienCourge = referentielCaracteristiqueDao.save(refCaracEntretienCourge);
		refCaracEntretienCourge.setCaracteristique(entretienFacile);
		refCaracEntretienCourge.setFlore(courge);
		refCaracEntretienCourge = referentielCaracteristiqueDao.save(refCaracEntretienCourge);

        Caracteristique typeHerbaceeHaute = new Caracteristique("strate", "herbaceeHaute", TypeCarac.Flore);
        Caracteristique debutPlantationMars = new Caracteristique("debutPlantation", "mars", TypeCarac.Flore);
        Caracteristique predateurMoucheSemis = new Caracteristique("predateurs", "moucheSemis", TypeCarac.Faune);
        
        typeHerbaceeHaute = caracteristiqueDao.save(typeHerbaceeHaute);
        debutPlantationMars = caracteristiqueDao.save(debutPlantationMars);
        predateurMoucheSemis = caracteristiqueDao.save(predateurMoucheSemis);
        
        Flore mais = new Flore("mais");
        mais = floreDao.save(mais);
       
        ReferentielCaracteristique refCaracCycleMais = new ReferentielCaracteristique();
        refCaracCycleMais = referentielCaracteristiqueDao.save(refCaracCycleMais);
        refCaracCycleMais.setCaracteristique(cycleAnnuelle);
        refCaracCycleMais.setFlore(mais);
        refCaracCycleMais = referentielCaracteristiqueDao.save(refCaracCycleMais);

       
        ReferentielCaracteristique refCaracTypeMais = new ReferentielCaracteristique();
        refCaracTypeMais = referentielCaracteristiqueDao.save(refCaracTypeMais);
        refCaracTypeMais.setCaracteristique(typeHerbaceeHaute);
        refCaracTypeMais.setFlore(mais);
        refCaracTypeMais = referentielCaracteristiqueDao.save(refCaracTypeMais);

        ReferentielCaracteristique refCaracDebutPlantationMais = new ReferentielCaracteristique();
        refCaracDebutPlantationMais = referentielCaracteristiqueDao.save(refCaracDebutPlantationMais);
        refCaracDebutPlantationMais.setCaracteristique(debutPlantationMars);
        refCaracDebutPlantationMais.setFlore(mais) ;
        refCaracDebutPlantationMais = referentielCaracteristiqueDao.save(refCaracDebutPlantationMais);

        ReferentielCaracteristique refCaracFinPlantationMais = new ReferentielCaracteristique();
        refCaracFinPlantationMais = referentielCaracteristiqueDao.save(refCaracFinPlantationMais);
        refCaracFinPlantationMais.setCaracteristique(finPlantationJuin);
        refCaracFinPlantationMais.setFlore(mais);
        refCaracFinPlantationMais = referentielCaracteristiqueDao.save(refCaracFinPlantationMais);
    
        ReferentielCaracteristique refCaracDebutRecolteMais = new ReferentielCaracteristique();
        refCaracDebutRecolteMais = referentielCaracteristiqueDao.save(refCaracDebutRecolteMais);
        refCaracDebutRecolteMais.setCaracteristique(debutRecolteJuillet);
        refCaracDebutRecolteMais.setFlore(mais);
        refCaracDebutRecolteMais = referentielCaracteristiqueDao.save(refCaracDebutRecolteMais);
        
        ReferentielCaracteristique refCaracFinRecolteMais = new ReferentielCaracteristique();
        refCaracFinRecolteMais = referentielCaracteristiqueDao.save(refCaracFinRecolteMais);
        refCaracFinRecolteMais.setCaracteristique(finRecolteOctobre);
        refCaracFinRecolteMais.setFlore(mais);
        refCaracFinRecolteMais = referentielCaracteristiqueDao.save(refCaracFinRecolteMais);
        
        ReferentielCaracteristique refCaracUsageMais = new ReferentielCaracteristique();
        refCaracUsageMais = referentielCaracteristiqueDao.save(refCaracUsageMais);
        refCaracUsageMais.setCaracteristique(usageComestible);
        refCaracUsageMais.setFlore(mais);
        refCaracUsageMais = referentielCaracteristiqueDao.save(refCaracUsageMais);
        
        ReferentielCaracteristique refCaracPredateurMais = new ReferentielCaracteristique();
        refCaracPredateurMais = referentielCaracteristiqueDao.save(refCaracPredateurMais);
        refCaracPredateurMais.setCaracteristique(predateurMoucheSemis);
        refCaracPredateurMais.setFlore(mais);
        refCaracPredateurMais = referentielCaracteristiqueDao.save(refCaracPredateurMais);

        ReferentielCaracteristique refCaracEnsoleillementMais = new ReferentielCaracteristique();
        refCaracEnsoleillementMais = referentielCaracteristiqueDao.save(refCaracEnsoleillementMais);
        refCaracEnsoleillementMais.setCaracteristique(ensoleillementPleinSoleil);
        refCaracEnsoleillementMais.setFlore(mais);
        refCaracEnsoleillementMais = referentielCaracteristiqueDao.save(refCaracEnsoleillementMais);

        ReferentielCaracteristique refCaracResistanceFroidMais = new ReferentielCaracteristique();
        refCaracResistanceFroidMais = referentielCaracteristiqueDao.save(refCaracResistanceFroidMais);
        refCaracResistanceFroidMais.setCaracteristique(resistanceAuFroidFragile);
        refCaracResistanceFroidMais.setFlore(mais);
        refCaracResistanceFroidMais = referentielCaracteristiqueDao.save(refCaracResistanceFroidMais);

        ReferentielCaracteristique refCaracTypeSolMais = new ReferentielCaracteristique();
        refCaracTypeSolMais = referentielCaracteristiqueDao.save(refCaracTypeSolMais);
        refCaracTypeSolMais.setCaracteristique(typeDeSolSableux);
        refCaracTypeSolMais.setFlore(mais);
        refCaracTypeSolMais = referentielCaracteristiqueDao.save(refCaracTypeSolMais);

        ReferentielCaracteristique refCaracPhMais = new ReferentielCaracteristique();
        refCaracPhMais = referentielCaracteristiqueDao.save(refCaracPhMais);
        refCaracPhMais.setCaracteristique(phNeutre);
        refCaracPhMais.setFlore(mais);
        refCaracPhMais = referentielCaracteristiqueDao.save(refCaracPhMais);

        ReferentielCaracteristique refCaracArrosageMais = new ReferentielCaracteristique();
        refCaracArrosageMais = referentielCaracteristiqueDao.save(refCaracArrosageMais);
        refCaracArrosageMais.setCaracteristique(arrosageMoyen);
        refCaracArrosageMais.setFlore(mais);
        refCaracArrosageMais = referentielCaracteristiqueDao.save(refCaracArrosageMais);

        ReferentielCaracteristique refCaracEntretienMais = new ReferentielCaracteristique();
        refCaracEntretienMais = referentielCaracteristiqueDao.save(refCaracEntretienMais);
        refCaracEntretienMais.setCaracteristique(entretienModere);
        refCaracEntretienMais.setFlore(mais);
        refCaracEntretienMais = referentielCaracteristiqueDao.save(refCaracEntretienMais);
        
		List <Faune>limacefind=fauneDao.findByNomFaune("Limace");
		System.out.println(limacefind);
		
		context.close();
	}

}
