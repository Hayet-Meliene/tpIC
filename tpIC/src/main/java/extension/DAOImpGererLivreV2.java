package extension;

import java.util.List;

import DAO.IDAOGererLivre;
import entity.Livre;

public class DAOImpGererLivreV2 implements IDAOGererLivre {


	public boolean ajouterlivre(Livre l) {
		System.out.println("****************livre ajouté!****************");
		return true;
	}
	
	public boolean supprimerlivre(Livre l) {
		System.out.println("***************livre supprimé!***************");
		return false;
	}
	

	public List<Livre> get() {
		// TODO Auto-generated method stub
		return null;
	}

	public Livre gett() {
		// TODO Auto-generated method stub
		return null;
	}

}
