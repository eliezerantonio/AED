/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajoaquim;

/**
 *
 * @author eliezer
 */
public final class Funcionario {

    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;

    }

    public void desconto(double valorSegurancaSocial, double irt) {

        this.setSalario(this.getSalario() - valorSegurancaSocial - irt);
     
    }

    public void bonus(double bonus) {
        this.salario += bonus;
    }

    public void depositar(double saldo) {
        this.setSalario(this.getSalario() + saldo);
    }

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

    public void estados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Salario: " + this.getSalario());
    }

}
