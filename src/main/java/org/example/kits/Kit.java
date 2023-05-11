package org.example.kits;

import org.example.elementos.Elemento;

import java.util.ArrayList;
import java.util.List;

public abstract class Kit extends Elemento {
    private List<Elemento> elementos = new ArrayList<>();
    public Kit(int codigo) {
        super(0, codigo);
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
        return precio * 0.9; // Aplica el 10% de descuento
    }

    public abstract double calcularPrecio();
}
