package ext;

import Dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs");
        double data=77;
        return data;
    }
}
