package Presentation;

import Dao.IDao;
import Dao.IDaoImpl;
import IMetier.IMetier;
import IMetier.IMetierImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
       IDao o = (IDao) cDao.newInstance();
        String metierClassName = scanner.nextLine();
        Class cMetier= Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();
        Method method=cMetier.getMethod("setDao",IDao.class);
        System.out.println("Resultats= "+metier.calcul());
    }
}
