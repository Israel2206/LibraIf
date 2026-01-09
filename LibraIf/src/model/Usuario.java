package model;

/**
 * O gerenciamento do usuario será realizado aqui
 */

public class Usuario {
    private String nome;
    private String senha;
    private int matricula;
    private boolean atrasado;
    private String tipoDeUsuario;

    /* Definindo os Getters */

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

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

    /* Construtor */

    public Usuario(String nome, String senha, int matricula, String tipoDeUsuario) {
        this.nome = nome;
        this.senha = senha;
        this.matricula = matricula;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    /* toString */

    @Override
    public String toString() {
        return "Usuario {" +
                "nome = '" + nome + '\'' +
                ", matricula = " + matricula +
                ", atrasado = " + atrasado +
                ", tipoDeUsuario = '" + tipoDeUsuario + '\'' +
                '}';
    }
}
