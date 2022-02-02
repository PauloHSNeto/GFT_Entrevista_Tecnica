package com.company;

public class Funcionarios {

    public String nome;
    public int idade;
    public double salario;
//construtores
    public Funcionarios(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
//getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
// metodo bonificacao
    public double  bonificação(){
        return this.salario;

    }
}
