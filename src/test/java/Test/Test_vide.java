package Test;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test_vide {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("flore");
		
		
		
		
		
		
		emf.close();
	}

}
