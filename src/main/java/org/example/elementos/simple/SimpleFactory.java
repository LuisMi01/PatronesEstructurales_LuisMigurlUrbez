package org.example.elementos.simple;

import org.example.elementos.Elemento;
import org.example.elementos.compuesto.Compuesto;
import org.example.elementos.factories.ElementoFactory;

public class SimpleFactory implements ElementoFactory {

    @Override
    public Elemento crearElementoSimple(double precio, int codigo) {
        return null;
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
        return new Simple(precio, codigo);
    }
}
