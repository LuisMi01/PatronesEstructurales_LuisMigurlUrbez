package org.example.kits.factories;

import org.example.elementos.Elemento;
import org.example.kits.Kit;
import org.example.kits.simple.SimpleKit;

import java.util.List;

public class KitSimpleFactory implements KitFactory{
    @Override
    public Kit createKit(int codigo, List<Elemento> elementos) {
        return new SimpleKit(elementos.get(0));
    }

}
