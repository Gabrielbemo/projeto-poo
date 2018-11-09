package com.gabrielbemo.projetopoo.teste;

import com.gabrielbemo.projetopoo.classes.Poligonal;
import com.gabrielbemo.projetopoo.classes.Ponto;
import com.gabrielbemo.projetopoo.classes.Ponto2D;
import com.gabrielbemo.projetopoo.classes.PontoXY;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;

public class ProjetoParte1 {
    public static void main(String[] args) {


        Ponto p = new Ponto(2312.312,123.213,1132.312);
        Ponto p2 = new Ponto(23,23.22,232);

        System.out.println(p);
        System.out.println(p.equals(p2));
        System.out.println(p2.dist(p));

        PontoXY pe = new PontoXY(2312.312,123.213);
        PontoXY pa = new PontoXY(2312.312,123.213);

        ArrayList<PontoXY> array = new ArrayList<>();
        array.add(pe);
        array.add(pa);
        Poligonal<PontoXY> polis = new Poligonal(array);

        System.out.println(polis.getN());
        System.out.println(polis.get(1));

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
