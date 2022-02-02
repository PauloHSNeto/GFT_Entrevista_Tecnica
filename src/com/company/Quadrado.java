package com.company;

public class Quadrado implements AreaCalculavel{
        //metodo para calculo de area

    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double valorarea(){
            return (this.lado*this.lado);
    }
}
