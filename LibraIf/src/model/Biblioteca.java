package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Todo o gerenciamento da biblioteca será realizado aqui.
 * Aqui também será o sistema da Biblioteca
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

    public boolean verificarMatricula(String matricula){
        for (Usuario usuario : usuarios){
            if (usuario.getMatricula().equals(matricula)){
                return true;
            }
        }
        return false;
    }

    public boolean verificarSenha(String senha){
        for (Usuario usuario : usuarios){
            if (usuario.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }

    public void mostrar(){
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    public void removerUsuario(Usuario usuario){
        if (usuarios.contains(usuario)){
            usuarios.remove(usuario);
        } else{
            System.out.println("O usuario não foi localizado!");
        }
    }

    /**
     * Lugar onde vai estar os dois paineis quando a pessoa entrar
     */

    public void painelUsuario(){
        System.out.println("===ESCOLHA===");
        System.out.println("1 - Ver livros disponíveis");
        System.out.println("2 - Fazer empréstimo");
        System.out.println("3 - Sair da conta");
    }

    public void painelfuncionario(){
        System.out.println("===ESCOLHA===");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Remover livro");
        System.out.println("3 - Gerenciar usuários");
        System.out.println("4 - Sair da conta");
    }

}
