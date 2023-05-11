package org.example.elementos.compuesto;

import org.example.elementos.Elemento;
import org.example.elementos.factories.ElementoFactory;
import org.example.elementos.simple.Simple;

public class CompuestoFactory implements ElementoFactory {

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
        return new Compuesto(precio, codigo);
    }


}
