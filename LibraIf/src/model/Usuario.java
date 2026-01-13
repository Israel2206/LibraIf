package model;

/**
 * O gerenciamento do usuario será realizado aqui
 */

public class Usuario {
    private String nome;
    private String senha;
    private String matricula;
    private boolean atrasado;
    private PerfilUsuario tipoDeUsuario;

    /* Definindo os Getters */

    public PerfilUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(PerfilUsuario tipoDeUsuario) {
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

    public String getMatricula() {
        return matricula;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    /* Definindo os Setters */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }

    /* Construtor */

    public Usuario(String nome, String senha, String matricula, PerfilUsuario tipoDeUsuario) {
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
