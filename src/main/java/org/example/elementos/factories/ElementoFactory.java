package org.example.elementos.factories;

import org.example.elementos.compuesto.Compuesto;
import org.example.elementos.Elemento;
import org.example.elementos.simple.Simple;

public interface ElementoFactory {
    Elemento crearElementoSimple(double precio, int codigo);

    Elemento crearElementoCompuesto(double precio, int codigo);

    Simple crearSimple(double precio, int codigo);
    Compuesto crearCompuesto(double precio, int codigo);

    Elemento createElemento(double precio, int codigo);
}
