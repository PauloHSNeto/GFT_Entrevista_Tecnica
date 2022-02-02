package com.company;

public class Retangulo implements AreaCalculavel{
    //metodo para calculo de area

    public double ladoA;
    public double ladoB;
    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public double getLadoA() {
        return ladoA;
    }


    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

//Calculo de Area
    public double valorarea(){
        //calculo com os construtores
        return this.ladoB*this.ladoA;
    }
}
