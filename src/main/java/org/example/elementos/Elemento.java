package org.example.elementos;

public abstract class Elemento {
    private double precio;
    private int codigo;

    public Elemento(double precio, int codigo) {
        this.precio = precio;
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
