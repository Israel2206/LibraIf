package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Todo o gerenciamento da biblioteca será realizado aqui
 */

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    /* Getter e Setters */

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /* Construtor */
    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    /* Métodos de Livro */

    public void cadastrarLivro(Livro livro){
        livros.add(livro);
    }

    public void removerLivro(Livro livro){
        if (livros.contains(livro)){
            livros.remove(livro);
        } else{
            System.out.println("O livro não foi localizado!");
        }
    }

    /* Métodos do Usuario */

    public void cadastrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario){
        if (usuarios.contains(usuario)){
            usuarios.remove(usuario);
        } else{
            System.out.println("O usuario não foi localizado!");
        }
    }

}
