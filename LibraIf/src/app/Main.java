/**
 * Esta classe é responsável por iniciar a aplicação da biblioteca libraIf.
 * Aqui serão realizados testes e chamadas aos métodos do sistema.
*/

package app;

import model.Biblioteca;
import model.Livro;
import model.PerfilUsuario;
import model.Usuario;

import java.util.Objects;
import java.util.Scanner;

import static model.PerfilUsuario.COMUM;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();


        while (true){
            biblioteca.mostarPainelPrincipal();
            System.out.print("Digite: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Senha: ");
                String senha = scanner.nextLine();

                System.out.print("Matrícula: ");
                String matricula = scanner.nextLine();

                biblioteca.mostrarTipoDeUsuario();
                System.out.println("Digite: ");
                int tipoDeUsuario = scanner.nextInt();
                PerfilUsuario perfil = PerfilUsuario.fromCodigo(tipoDeUsuario);


                if (biblioteca.verificarMatricula(matricula)){
                    System.out.println("Está matrícula já está sendo usada!");
                } else{
                    Usuario usuario = new Usuario(nome, senha, matricula, perfil);
                    biblioteca.cadastrarUsuario(usuario);
                    System.out.println("Usuário cadastrado com sucesso!");
                }

            } else if(opcao == 2){
                System.out.print("Digite sua mátricula: ");
                String matricula = scanner.next();
                Usuario usuario = biblioteca.buscarUsuarioPorMatricula(matricula);

                if (usuario == null){
                    System.out.println("matrícula inválida");
                } else{
                    System.out.print("Informe a sua Senha: ");
                    String senha = scanner.next();
                    if (Objects.equals(senha, usuario.getSenha())){
                        if (usuario.getTipoDeUsuario() == COMUM){
                            biblioteca.mostrarPainelUsuario();
                        }else{
                            while (true){
                                biblioteca.mostrarPainelFuncionario();
                                System.out.print("Digite: ");
                                int opcaoFuncionario = scanner.nextInt();
                                scanner.nextLine();

                                if (opcaoFuncionario == 1){
                                    System.out.println("===Cadastro de Livro===");
                                    System.out.print("Digite o título do livro: ");
                                    String titulo = scanner.nextLine();

                                    System.out.print("Digite o nome do autor: ");
                                    String autor = scanner.nextLine();

                                    System.out.print("Digite o ISBN do livro: ");
                                    String isbn = scanner.nextLine();

                                    System.out.print("Digite o ano de publicação do livro: ");
                                    int anoPublicacao = scanner.nextInt();

                                    if (biblioteca.verificarISBN(isbn)){
                                        System.out.println("ISBN já em uso!");
                                    }else {
                                        Livro livro = new Livro(titulo,autor,isbn,anoPublicacao);
                                        biblioteca.cadastrarLivro(livro);
                                    }

                                } else if (opcaoFuncionario == 2) {
                                    biblioteca.listarLivros();
                                } else if (opcaoFuncionario == 3) {
                                    System.out.print("Digite o ISBN do livro para ser removido: ");
                                    String isbn = scanner.nextLine();

                                    biblioteca.removerLivro(isbn);
                                } else if (opcaoFuncionario == 4) {
                                    System.out.println("Saindo da Conta!");
                                    break;
                                }

                            }
                        }
                    }else {
                        System.out.println("Senha Incorreta!");
                    }
                }

            }else if (opcao == 3){
                System.out.println("Saindo...");
                break;
            }

        }
    }
}
