package com.company;

public class Vendedor extends Funcionarios{
    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificação() {
        salario += 3000.00;
        return super.bonificação();
    }
}
