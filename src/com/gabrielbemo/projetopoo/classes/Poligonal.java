package com.gabrielbemo.projetopoo.classes;

import java.util.List;

public class Poligonal<E> {

    private List<E> vertices;

    public Poligonal(List<E> vertices) {
        if (vertices.size() < 2) {
            throw new RuntimeException("Poligonal deve ter ao menos dois vértices");
        } else {
            this.vertices = vertices;
        }
    }

    public int getN() {
        return this.vertices.size();
    }

    public E get(int n) {
        if(n >= vertices.size()){
            return null;
        }
        return vertices.get(n);
    }

}
