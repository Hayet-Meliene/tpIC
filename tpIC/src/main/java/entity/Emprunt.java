package entity;



public class Emprunt {
	private String datEmprunt;
	private String dateRet;
	private String nomMembre;
	private boolean emprunt = false;
    
    public boolean getEmprunt(){
        return this.emprunt;
    }
     
    public void setEmprunt(boolean emprunte){
        this.emprunt = emprunte;
    }

    public void emprunter(Livre livre){
        if(getEmprunt() == true )
        {
                setEmprunt(true);
                System.out.println("Un livre a été emprunté.");
        }
        else
        {
                System.out.println("Erreur");
        }
        
    }


	
	
	public String getDatEmprunt() {
		return datEmprunt;
	}
	public void setDatEmprunt(String datEmprunt) {
		this.datEmprunt = datEmprunt;
	}
	public String getDateRet() {
		return dateRet;
	}
	public void setDateRet(String dateRet) {
		this.dateRet = dateRet;
	}
	public String getNomMembre() {
		return nomMembre;
	}
	public void setNomMembre(String nomMembre) {
		this.nomMembre = nomMembre;
	}

}
