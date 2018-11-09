package com.gabrielbemo.projetopoo.classes;

public class PontoXZ extends Ponto2D {

    public PontoXZ() {
    }

    public PontoXZ(double x, double z) {
        super(x, 0, z);
    }

    @Override
    public String toString() {
        String retorno = String.format(" %s(%f,%f) ", getNome(), getX(), getZ());
        return retorno;
    }

}
