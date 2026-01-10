/**
 * Esta classe é responsável por iniciar a aplicação da biblioteca libraIf.
 * Aqui serão realizados testes e chamadas aos métodos do sistema.
*/

package app;

import model.Biblioteca;
import model.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();


        while (true){
            System.out.println("===SELECIONE===");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Entrar como usuario");
            System.out.println("3 - Sair");
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

                System.out.print("Tipo de usuário (comum/bibliotecario): ");
                String tipoDeUsuario = scanner.nextLine();


                if (biblioteca.verificarMatricula(matricula)){
                    System.out.println("Está matrícula já está sendo usada!");
                } else{
                    Usuario usuario = new Usuario(nome, senha, matricula, tipoDeUsuario);
                    biblioteca.cadastrarUsuario(usuario);
                    System.out.println("Usuário cadastrado com sucesso!");
                }

            } else if(opcao == 2){
                System.out.print("Digite sua mátricula: ");
                String matricula = scanner.next();

                if (biblioteca.verificarMatricula(matricula)){
                    System.out.print("Informe a sua Senha: ");
                    String senha = scanner.next();

                    if (biblioteca.verificarSenha(senha)){
                        System.out.println("senha certa fih, so testando até aqui!");
                    }else {
                        System.out.println("Senha Incorreta!");
                    }
                }else{
                    System.out.println("Está mátricula não existe ou foi digitada de forma errada!");
                }

            }else if (opcao == 3){
                System.out.println("Saindo...");
                break;
            }

        }
    }
}
