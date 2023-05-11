package org.example.kits.factories;

import org.example.elementos.Elemento;
import org.example.kits.Kit;

import java.util.List;

public interface KitFactory {
    Kit createKit(int codigo, List<Elemento> elementos);
}
