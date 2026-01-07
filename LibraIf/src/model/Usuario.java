package model;

public class Usuario {
    private String nome;
    private int matricula;

    /* Definindo os Getters */
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    /* Definindo os Setters */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
