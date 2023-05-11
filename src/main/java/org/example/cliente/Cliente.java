package org.example.cliente;

import org.example.elementos.compuesto.Compuesto;
import org.example.elementos.Elemento;
import org.example.elementos.simple.Simple;
import org.example.elementos.factories.CompuestoFactory;
import org.example.elementos.factories.ElementoFactory;
import org.example.elementos.factories.SimpleFactory;
import org.example.kits.Kit;

public class Cliente {
    public static void crearKit() {


        ElementoFactory simpleFactory = new SimpleFactory();
        ElementoFactory compuestoFactory = new CompuestoFactory();
        // Crea un elemento simple
        Simple silla = simpleFactory.crearSimple(50, 1);

        // Crea un elemento compuesto con 2 elementos simples
        Compuesto mesa = compuestoFactory.crearCompuesto(150, 2);
        mesa.add(simpleFactory.crearSimple(80, 3));
        mesa.add(simpleFactory.crearSimple(70, 4));

        // Crea un kit con un elemento simple y un elemento compuesto
        Kit kit = new Kit(5) {
            @Override
            public double getPrecio() {
                return 0;
            }

            @Override
            public double calcularPrecio() {
                return 0;
            }
        };
        kit.add(silla);
        kit.add(mesa);

        // Calcula el precio del kit
        System.out.println("Precio del kit: " + kit.getPrecio());
        System.out.println("Precio del kit: " + kit.getPrecio());

        // Muestra los elementos del kit
        System.out.println("Elementos del kit:");
        for (Elemento elemento : kit.getElementos()) {
            if (elemento instanceof Simple simple) {
                System.out.println("- Simple - Código: " + simple.getCodigo() + ", Precio: " + simple.getPrecio());
            } else if (elemento instanceof Compuesto compuesto) {
                System.out.println("- Compuesto - Código: " + compuesto.getCodigo() + ", Precio: " + compuesto.getPrecio());
                for (Elemento subElemento : compuesto.getElementos()) {
                    System.out.println("  - Subelemento - Código: " + subElemento.getCodigo() + ", Precio: " + subElemento.getPrecio());
                }
            }
        }
    }

}

