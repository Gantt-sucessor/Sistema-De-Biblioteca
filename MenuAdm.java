import java.util.Scanner;

public class MenuAdm {
    
        public static int exibirMenuAdm(Scanner input) {
        System.out.println("\n--- MENU DO BIBLIOTECÁRIO ---");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Excluir livros");
        System.out.println("4 - Voltar");

        System.out.print("Escolha uma opção: ");
        return input.nextInt();
    }
}
