package com.gabrielbemo.projetopoo.classes;

import java.util.Objects;

public class Ponto {

    private double x;
    private double y;
    private double z;

    public Ponto(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Ponto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getNome() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        String retorno = String.format(" %s(%f,%f,%f) ", getNome(), this.x, this.y, this.z);
        return retorno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ponto ponto = (Ponto) o;
        return Double.compare(ponto.x, x) == 0 &&
                Double.compare(ponto.y, y) == 0 &&
                Double.compare(ponto.z, z) == 0;
    }

    public double dist(Ponto p){
        double retorno;
        retorno = Math.sqrt(((p.getX() - this.x)*(p.getX() - this.x)) +
                  ((p.getY() - this.y)*(p.getY() - this.y)) +
                  ((p.getZ() - this.z)*(p.getZ() - this.z)));
        return retorno;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
