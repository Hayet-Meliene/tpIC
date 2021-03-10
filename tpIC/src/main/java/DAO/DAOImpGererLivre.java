package DAO;

import java.util.List;

import entity.Livre;

public class DAOImpGererLivre implements IDAOGererLivre {
	
	public boolean ajouterlivre(Livre l) {
		System.out.println("livre ajouté!");
		return true;
	}
	
	public boolean supprimerlivre(Livre l) {
		System.out.println("livre supprimé!");
		return false;
	}
	
	
	public List <Livre> get(){
		return null;
		
	}
	public Livre gett() {
		return null;}
	

}
