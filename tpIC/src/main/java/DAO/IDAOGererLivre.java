package DAO;

import java.util.List;

import entity.Livre;

public interface IDAOGererLivre {
	public boolean ajouterlivre(Livre l);
	public boolean supprimerlivre(Livre l);
	public List <Livre> get() ;
	public Livre gett();
}
