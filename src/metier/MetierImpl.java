package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

	private IDao dao;
	@Override
	public double calcul() {
		double data=dao.getData();
		double res=data*Math.PI;
		return res;
	}
	public void setDao(IDao dao) {
		this.dao=dao;
	}
	
}
