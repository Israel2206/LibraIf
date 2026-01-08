package model;

import java.util.List;

/**
 * Todo o gerenciamento da biblioteca será realizado aqui
 */

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }


}
