package model;

public enum PerfilUsuario {
    COMUM(1, "Pessoa Comum"),
    BIBLIOTECARIO(2, "Bibliotecário");

    private int codigo;
    private String descricao;

    //Construtor
    PerfilUsuario(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    //Getters

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    //Métodos

    public static PerfilUsuario fromCodigo(int codigo) {
        for (PerfilUsuario perfil : PerfilUsuario.values()) {
            if (perfil.codigo == codigo) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Código de perfil inválido");
    }
}
