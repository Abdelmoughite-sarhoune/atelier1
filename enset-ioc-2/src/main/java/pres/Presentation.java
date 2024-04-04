package pres;

import Metier.Metierimpl;
import ext.DaoImpl2;

public class Presentation {
    public static void main(String[] args ){
        DaoImpl2 dao=new DaoImpl2();
        Metierimpl metier =new Metierimpl(dao);
       // metier.setDao(dao);
        System.out.println("resultat"+metier.calcul());
    }
}
