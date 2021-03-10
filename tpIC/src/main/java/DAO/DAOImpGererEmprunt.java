package DAO;

import entity.Livre;

public class DAOImpGererEmprunt implements IDAOGererEmprunt{
	public boolean emprunterlivre(Livre livre){
		System.out.println("livre emprunté!");
		return true;
	}

}
