package com.gabrielbemo.projetopoo.classes;

public class PontoXY extends Ponto2D {

    public PontoXY() {
    }

    public PontoXY(double x, double y) {
        super(x, y, 0);
    }

    @Override
    public String toString() {
        String retorno = String.format(" %s(%f,%f) ", getNome(), getX(), getY());
        return retorno;
    }
}
