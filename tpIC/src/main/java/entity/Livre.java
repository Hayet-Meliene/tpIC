package entity;

import java.util.Iterator;

public class Livre {
	private int idlivre;
	private String titre;
	private static int nb=0;
	public Livre[] livre;
	
	public Livre(int idlivre,String titre) {
		this.idlivre=idlivre;
		this.titre=titre;
		livre=new Livre[5];
		int nb=0;
		
	}
	public boolean ajouterlivre(Livre l){
        if(nb<livre.length)
           this.livre[nb++]= l;
        return true;
    }
	
	public boolean supprimer(Livre l){
		
        for(int i=0;i<livre.length;i++){
            if(livre[i].idlivre == idlivre )
              
                livre[i]=livre[i+1];
        }
        nb--;
            return true;     
    }
	
	
	public int getIdlivre() {
		return idlivre;
	}
	public void setIdlivre(int idlivre) {
		this.idlivre = idlivre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
		
		
	

}