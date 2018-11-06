package com.gabrielbemo.projetopoo.teste;

import com.gabrielbemo.projetopoo.classes.Ponto;
import com.gabrielbemo.projetopoo.classes.Ponto2D;

public class ProjetoParte1 {
    public static void main(String[] args) {


        Ponto p = new Ponto(2312.312,123.213,1132.312);
        Ponto p2 = new Ponto(23,23.22,232);
        System.out.println(p);
        System.out.println(p.equals(p2));
        System.out.println(p2.dist(p));

//        PontoXZ p1 = new PontoXZ(-3.0, 2.0);
//        PontoXZ p2 = new PontoXZ(-3.0, 6.0);
//        PontoXZ p3 = new PontoXZ(0.0, 2.0);
//
//        PontoXZ[] verts = {p1, p2, p3};
//
//        PoligonalFechada<PontoXZ> pol1 = new PoligonalFechada<>(verts);
//        System.out.println(String.format("Comprimento da poligonal = %f)", pol1.getComprimento()));
//
//        Poligonal<PontoXZ> pol2 = new Poligonal<>(verts);
//        System.out.println(String.format("Comprimento da poligonal = %f)", pol2.getComprimento()));

    }
}
