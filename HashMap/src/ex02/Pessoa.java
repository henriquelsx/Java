package ex02;

import java.time.LocalDate;

public class Pessoa {
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private double peso;

    public Pessoa(String cpf, String nome, LocalDate nascimento, double peso) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.peso = peso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", peso=" + peso +
                '}';
    }
}
