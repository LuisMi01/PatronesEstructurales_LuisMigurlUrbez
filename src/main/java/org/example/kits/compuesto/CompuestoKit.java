package org.example.kits.compuesto;

import org.example.elementos.Elemento;
import org.example.kits.Kit;

import java.util.List;

public class CompuestoKit extends Kit {

    private List<Elemento> elementos;

    public CompuestoKit(int codigo, List<Elemento> elementos) {
        super(codigo);
        this.elementos = elementos;
    }

    @Override
    public List<Elemento> getElementos() {
        return elementos;
    }

    @Override
    public double calcularPrecio() {
        double precio = 0;
        for (Elemento elemento : elementos) {
            precio += elemento.getPrecio();
        }
        return precio * 0.9;
    }

}
