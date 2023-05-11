package org.example.kits.simple;

import org.example.elementos.Elemento;
import org.example.kits.Kit;

import java.util.Collections;
import java.util.List;

public class SimpleKit extends Kit {
    private Elemento elemento;

    public SimpleKit(Elemento elemento) {
        super(elemento.getCodigo());
        this.elemento = elemento;
    }

    @Override
    public List<Elemento> getElementos() {
        return Collections.singletonList(elemento);
    }

    @Override
    public double calcularPrecio() {
        return elemento.getPrecio() * 0.9;
    }
}


