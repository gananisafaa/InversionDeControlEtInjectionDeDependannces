package dao;

public class DaoImpl implements IDao {

	@Override
	public double getData() {

		System.out.println("Version Base de donnees");
		double data=22;
		return data;
	}

}
