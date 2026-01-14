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

    public Usuario buscarUsuarioPorMatricula(String matricula){
        for (Usuario usuario : usuarios){
            if (usuario.getMatricula().equals(matricula)){
                return usuario;
            }
        }
        return null;
    }


    /*Métodos do Livro*/

    public void cadastrarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro Cadastrado com sucesso");
    }

    public boolean verificarISBN(String isbn){
        for (Livro livro : livros){
            if (livro.getIsbn().equals(isbn)){
                return true;
            }
        }
        return false;
    }

    public void listarLivros(){
        System.out.println("===Livros===");
        for (Livro livro : livros){
            System.out.println(livro);
        }
        System.out.println("\n===Livros===");
    }


    /**
     * Painel principal
     */

    public void mostarPainelPrincipal(){
        System.out.println("===SELECIONE===");
        System.out.println("1 - Cadastrar Usuario");
        System.out.println("2 - Entrar como usuario");
        System.out.println("3 - Sair");
    }


    /**
     * Lugar onde vai estar os dois paineis quando a pessoa entrar
     */

    public void mostrarPainelUsuario(){
        System.out.println("===ESCOLHA===");
        System.out.println("1 - Ver livros disponíveis");
        System.out.println("2 - Fazer empréstimo");
        System.out.println("3 - Sair da conta");
    }

    public void mostrarPainelFuncionario(){
        System.out.println("===ESCOLHA===");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Listar os livros");
        System.out.println("3 - Remover livro");
        System.out.println("4 - Gerenciar usuários");
        System.out.println("5 - Sair da conta");
    }

    /* Onde ficará localizado o painel do tipo de usuario*/

    public void mostrarTipoDeUsuario(){
        System.out.println("Tipo de usuário: ");
        System.out.println("Digite '1' se você for um Usuario comum");
        System.out.println("Digite '2' se você for bibliotecario");
    }

}
