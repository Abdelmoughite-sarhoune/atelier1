package Metier;
import dao.iDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Metier")
public class Metierimpl implements Imetier{

    private iDao dao;
    public Metierimpl(iDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res = tmp * 540 / Math.cos(tmp * Math.PI);
        return res;
    }

    public void setDao(iDao dao) {
        this.dao = dao;
    }
}
