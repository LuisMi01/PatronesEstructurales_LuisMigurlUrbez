package org.example.kits.compuesto;

import org.example.elementos.Elemento;
import org.example.kits.Kit;
import org.example.kits.factories.KitFactory;

import java.util.List;

public class CompuestoKitFactory implements KitFactory {
    @Override
    public Kit createKit(int codigo, List<Elemento> elementos) {
        return new CompuestoKit(codigo, elementos);
    }
}
