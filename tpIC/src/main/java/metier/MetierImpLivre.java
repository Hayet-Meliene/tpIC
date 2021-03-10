package metier;

import java.util.List;

import DAO.IDAOGererLivre;
import entity.Livre;


public class MetierImpLivre implements IMetierLivre {
	
	private IDAOGererLivre dao=null;
	
	public void setDao(IDAOGererLivre dao) {
		this.dao = dao;
	}

		public boolean insererlivre(Livre l){
			boolean livre=dao.ajouterlivre(l);
			return livre;
	        
	    }

		public boolean supprimerlivre(Livre l) {
			boolean livre=dao.supprimerlivre(l);
			return livre;
		}
		
		
		
	
	public List <Livre> get() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Livre gett() {
		// TODO Auto-generated method stub
		return null;
	}



}
