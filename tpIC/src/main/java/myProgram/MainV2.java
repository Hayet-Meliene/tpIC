package myProgram;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.DAOImpGererLivre;
import metier.MetierImpLivre;

public class MainV2 {
	public static <IMetier, IDAO> void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"config.xml"});
			
			IMetier metier =(IMetier) context.getBean("metier");

			System.out.println(((MetierImpLivre) metier).insererlivre(null));
          	System.out.println(((DAOImpGererLivre) metier).supprimerlivre(null));
		
		

}
}
