package org.example.elementos.factories;

import org.example.elementos.compuesto.Compuesto;
import org.example.elementos.Elemento;
import org.example.elementos.simple.Simple;

public class SimpleFactory implements ElementoFactory {
    @Override
    public Elemento crearElementoSimple(double precio, int codigo) {
        return new Simple(precio, codigo);
    }

    @Override
    public Elemento crearElementoCompuesto(double precio, int codigo) {
        return null;
    }

    @Override
    public Simple crearSimple(double precio, int codigo) {
        return null;
    }

    @Override
    public Compuesto crearCompuesto(double precio, int codigo) {
        return null;
    }

    @Override
    public Elemento createElemento(double precio, int codigo) {
        return null;
    }
}
