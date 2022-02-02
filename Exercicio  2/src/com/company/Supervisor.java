package com.company;

public class Supervisor extends Funcionarios{
    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificação() {
        salario += 5000.00;
        return super.bonificação();
    }
}
