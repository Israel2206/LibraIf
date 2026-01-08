/**
 * Esta classe é responsável por iniciar a aplicação da biblioteca libraIf.
 * Aqui serão realizados testes e chamadas aos métodos do sistema.
*/

package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("===SELECIONE===");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Entrar na conta do usuario");
            System.out.println("3 - Sair");
            System.out.print("Digite: ");
            byte opcao = scanner.nextByte();

        }
    }
}
