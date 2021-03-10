package metier;

import java.util.List;

import entity.Livre;



public interface IMetierLivre {
	public boolean insererlivre(Livre l) ;
	public boolean supprimerlivre(Livre l);
	public List <Livre> get() ;
	public Livre gett();

}
