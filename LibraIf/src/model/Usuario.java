package model;

/**
 * O gerenciamento do usuario será realizado aqui
 */

public class Usuario {
    private String nome;
    private int matricula;
    private boolean atrasado;


    /* Definindo os Getters */
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    /* Definindo os Setters */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }

    /* Iniciando os métodos da classe usuario*/



}
