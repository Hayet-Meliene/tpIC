package myProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import DAO.DAOImpGererEmprunt;
import DAO.DAOImpGererLivre;
import DAO.IDAOGererEmprunt;
import DAO.IDAOGererLivre;
import entity.Livre;
import metier.MetierImpEmprunt;
import metier.MetierImpLivre;

public class Main {

	public static <IMetier, IDAO> void main(String[] args) {
//		DAOImpGererLivre dao = new DAOImpGererLivre();
//		MetierImpLivre metier = new MetierImpLivre();
//		metier.setDao(dao); 
//		System.out.println(metier.insererlivre(null));
//		System.out.println(metier.supprimerlivre(null));
//		
//		DAOImpGererEmprunt dao2 = new DAOImpGererEmprunt();
//    	MetierImpEmprunt metier2 = new MetierImpEmprunt();
//		metier2.setDao(dao2);
//		System.out.println(metier2.emprunter(null));
		
		try { /** AU LIEU DE FAIRE NEW -_-
		        instanciation dynamique :    */
			Scanner scanner = new Scanner(new File("config.txt"));
			//on va lire à travers le fichier de config:: ca permet aussi de'éviter l'utilisation de new qui son (-) est la maintenance: un couplage fort 
			//lire la classe dao et metier:
			String daoClassName =scanner.next();
			String metierClassName=scanner.next();
			System.out.println(daoClassName);
			System.out.println(metierClassName);
			//=> instanciation dynamique:je vais chercher la classe et je vais la charger au mémoire:
			Class cDAO = Class.forName(daoClassName);// classe chargée au mémoire
			IDAOGererLivre DAO = (IDAOGererLivre) cDAO.newInstance(); // instancier la classe,retourne un objet de type idao
			
			Class cMetier = Class.forName(metierClassName);
			IMetier  metier = (IMetier) cMetier.newInstance();
			
			//l'association:
			Method m1 =cMetier.getMethod("setDao", new Class[]{IDAOGererLivre.class});
			//exécuter la méthode:équivalent à:   metier.setDao(dao);
			m1.invoke(metier,new Object[]{DAO} );//faire appel à la méthode setDao de couche  métier 
			
			//l'injection:
			System.out.println(((MetierImpLivre) metier).insererlivre(null));
          	System.out.println(((DAOImpGererLivre) metier).supprimerlivre(null));
			
          	
          	
          //on va lire à travers le fichier de config:: ca permet aussi de'éviter l'utilisation de new qui son (-) est la maintenance: un couplage fort 
			//lire la classe dao et metier:
			String daoClassName2 =scanner.next();
			String metierClassName2=scanner.next();
			System.out.println(daoClassName2);
			System.out.println(metierClassName2);
			//=> instanciation dynamique:je vais chercher la classe et je vais la charger au mémoire:
			Class cDAO2 = Class.forName(daoClassName);// classe chargée au mémoire
			IDAOGererEmprunt DAO2 = (IDAOGererEmprunt) cDAO2.newInstance(); // instancier la classe,retourne un objet de type idao
			
			Class cMetier2 = Class.forName(metierClassName);
			IMetier  metier2 = (IMetier) cMetier2.newInstance();
			
			//l'association:
			Method m2 =cMetier2.getMethod("setDao", new Class[]{IDAOGererEmprunt.class});
			//exécuter la méthode:équivalent à:   metier.setDao(dao);
			m2.invoke(metier,new Object[]{DAO2} );//faire appel à la méthode setDao de couche  métier 
			
			//l'injection:
			System.out.println(((MetierImpEmprunt) metier).emprunter(null));
			
          	
          	
		   } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
