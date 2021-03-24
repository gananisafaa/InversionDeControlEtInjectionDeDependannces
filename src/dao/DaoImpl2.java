package dao;

public class DaoImpl2 implements IDao{

    @Override
    public double getData() {

        double data=33;
        System.out.println("Version WebService");
        return data;
    }
}

