package IMetier;

import Dao.IDao;

public class IMetierImpl implements IMetier {
    public IMetierImpl() {

    }
    public IMetierImpl(IDao dao) {
        super();
        this.dao = dao;
    }
    private IDao dao=null;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res= tmp*223*Math.cos(tmp);
        return res;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
