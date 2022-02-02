package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here

        //Codigo de calculo de área do quadrado
        Quadrado quad = new Quadrado(3);
        System.out.println(quad.valorarea());
        // Codigo de calculo de área do retangulo
        Retangulo ret = new Retangulo(3,3);
        System.out.println(quad.valorarea());
        // Codigo de calculo de área do circulo
        Circulo circ = new Circulo(3);
        System.out.println(circ.valorarea());
    }
}
