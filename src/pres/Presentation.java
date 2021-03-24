package pres;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class Presentation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/*
		 * Injection des dépendances par des instanciations statiques ==> new
		 *  
		 
		DaoImpl dao=new DaoImpl();
		MetierImpl metier=new MetierImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());
		*/
		 try {


	            Scanner scanner = new Scanner(new File("config.txt"));

	            String daoClassName=scanner.nextLine();
	            Class<?> cDao=Class.forName(daoClassName); 
	            
	            IDao dao=(IDao) cDao.getDeclaredConstructor().newInstance();

	            String metierName=scanner.nextLine();
	            Class<?> metierClass=Class.forName(metierName);
	            IMetier metier = (IMetier) metierClass.getDeclaredConstructor().newInstance();

	            Method m = metierClass.getMethod("setDao", IDao.class );
	            m.invoke(metier, dao);

	            System.out.println(metier.calcul());

	        }catch (Exception ex){
	            System.out.println(ex.getMessage());
	        }



	}

}
