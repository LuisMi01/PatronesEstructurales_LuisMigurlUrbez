package org.example.elementos.compuesto;

import org.example.elementos.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Compuesto extends Elemento {
    private List<Elemento> elementos = new ArrayList<>();

    public Compuesto(double precio, int codigo) {
        super(precio, codigo);
    }

    public void add(Elemento elemento) {
        elementos.add(elemento);
    }

    public void remove(Elemento elemento) {
        elementos.remove(elemento);
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for (Elemento elemento : elementos) {
            precio += elemento.getPrecio();
        }
        return precio * 0.9;
    }


}
