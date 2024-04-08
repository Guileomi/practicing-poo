package org.listasforeach.listas.exercicios;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(){

    }
    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentoSalario(Double porcentagem){
        salario += salario * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return "Funcionario: "
                + "\nID: " + id
                + "\nNome: " + nome
                + String.format("\nSalario: %.2f", salario);
    }
}
