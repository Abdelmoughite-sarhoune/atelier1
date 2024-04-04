package pres;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presspringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","Metier");
        Imetier metier=context.getBean(Imetier.class);
        System.out.println("resultat"  + metier.calcul());
    }
}
