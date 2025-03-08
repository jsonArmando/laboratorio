package com.java.practice.example;

public class Rectangulo implements Figura{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto =alto;
    }

    @Override
    public double calcularArea() {
      return ancho * alto;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPerimetro'");
    }

    
    
}
