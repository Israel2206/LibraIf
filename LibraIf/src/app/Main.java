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
            byte opcao = scanner.nextByte();

            if (opcao == 1){
                System.out.print("Nome: ");
                String nome = scanner.next();

                System.out.print("Senha: ");
                String senha = scanner.next();

                System.out.print("Matrícula: ");
                int matricula = scanner.nextInt();

                System.out.print("Tipo de usuário(comum/bibliotecario(a): ");
                String tipoDeUsuario = scanner.next();

                Usuario usuario = new Usuario(nome, senha, matricula, tipoDeUsuario);
            }

        }
    }
}
