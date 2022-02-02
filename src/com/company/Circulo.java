package com.company;

public class Circulo implements AreaCalculavel {

    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    //metodo para calculo de area
    public double valorarea(){

        double area = this.raio*3.14;
        return area;
    }

}
