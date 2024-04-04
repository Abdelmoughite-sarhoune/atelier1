package pres;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  presspring  {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("configue.xml");
        Imetier Metier=(Imetier)  context.getBean( ("Metier"));
        System.out.println(Metier.calcul());


    }
}
