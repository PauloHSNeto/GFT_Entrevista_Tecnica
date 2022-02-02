package com.company;

public class Gerente extends Funcionarios{
    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificação() {
        salario += 10000.00;
        return super.bonificação();
    }
}
