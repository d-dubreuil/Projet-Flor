package Test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.interfaces.ICaracteristiqueRepository;
import model.Caracteristique;

public class test_query {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		 System.out.println("############");
		ICaracteristiqueRepository caracteristiqueDao = context.getBean(ICaracteristiqueRepository.class);
		
		 System.out.println("&&&&&&&&&&&&&");
		 List<Caracteristique> caracMais = caracteristiqueDao.findByFlore("mais");
	        System.out.println(caracMais);
	        
	        List<Caracteristique> courgeHaricot = caracteristiqueDao.findAllByBonusFl1FL2("courge","haricot");
	        System.out.println(courgeHaricot);
	        
	        List<Caracteristique> courgHaricot = caracteristiqueDao.findAllByMalusFl1FL2Carac("courge","haricot","strate");
	        System.out.println(courgHaricot);
	        List<Caracteristique> maisHaricot = caracteristiqueDao.findAllByMalusFl1FL2Carac("mais","haricot","strate");
	        System.out.println(maisHaricot);
		
		context.close();

	}

}
