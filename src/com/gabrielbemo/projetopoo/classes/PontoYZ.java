package com.gabrielbemo.projetopoo.classes;

public class PontoYZ extends  Ponto2D {

    public PontoYZ() {
    }

    public PontoYZ(double y, double z) {
        super(0, y, z);
    }

    @Override
    public String toString() {
        String retorno = String.format(" %s(%f,%f) ", getNome(), getY(), getZ());
        return retorno;
    }
}
