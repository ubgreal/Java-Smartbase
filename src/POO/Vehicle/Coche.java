package POO.Vehicle;

public class Coche {

    // Atributos

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Integer velocidad = 0;

    // Constructor

    public Coche(String color, String fabricante, String modelo, Double peso) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
    }

    // Comportamiento

    public void acelerar(Integer cantidad) {
        if (cantidad > 0 && cantidad <= 120) ;
        this.velocidad += cantidad;
    }
}

