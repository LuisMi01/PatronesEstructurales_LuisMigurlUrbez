package org.example.kits.simple;

import org.example.elementos.Elemento;
import org.example.kits.Kit;
import org.example.kits.factories.KitFactory;

import java.util.List;

public class SimpleKitFactory implements KitFactory {
    @Override
    public Kit createKit(int codigo, List<Elemento> elementos) {
        return new SimpleKit(elementos.get(0));
    }
}
