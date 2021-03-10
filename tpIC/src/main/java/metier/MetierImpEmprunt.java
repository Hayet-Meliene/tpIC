package metier;

import DAO.IDAOGererEmprunt;

import entity.Emprunt;
import entity.Livre;

public class MetierImpEmprunt implements IMetierEmprunt{
     private IDAOGererEmprunt dao=null;
	
	public void setDao(IDAOGererEmprunt dao) {
		this.dao = dao;
	}
	
	
	
	public boolean emprunter(Livre livre) {
		boolean emprunt =dao.emprunterlivre(livre);
		return emprunt;

}
	


}
