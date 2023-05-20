package Presentation;

import Dao.IDaoImpl;
import IMetier.IMetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        IMetierImpl metier= new IMetierImpl();
        IDaoImpl dao=new IDaoImpl();
        metier.setDao(dao);
        System.out.println("la temperature est: "+metier.calcul());
    }
}
