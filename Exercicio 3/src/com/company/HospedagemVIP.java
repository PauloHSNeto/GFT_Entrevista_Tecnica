package com.company;

public class HospedagemVIP extends Hospedagem{


    public HospedagemVIP(double valor) {
        super(valor);
    }

    @Override
    public void printValor() {
//valor adicional de 1000 reais
        this.valor = this.valor+ 1000;
        System.out.println("Hospedagem VIP custa "+ this.valor);
    }
}
