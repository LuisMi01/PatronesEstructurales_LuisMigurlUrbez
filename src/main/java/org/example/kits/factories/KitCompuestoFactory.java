package org.example.kits.factories;

import org.example.elementos.Elemento;
import org.example.kits.Kit;
import org.example.kits.compuesto.CompuestoKit;

import java.util.List;

public class KitCompuestoFactory implements KitFactory{
    @Override
    public Kit createKit(int codigo, List<Elemento> elementos) {
        return new CompuestoKit(codigo, elementos);
    }

}
