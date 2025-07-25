import java.util.Scanner;

    public class MenuUsuario {
    
      public static int exibirMenuUsuario(Scanner input) {
        System.out.println("\n--- MENU DO USUÁRIO ---");
        System.out.println("1 - Ver livros disponíveis");
        System.out.println("2 - Comprar livro");
        System.out.println("3 - Voltar");

        System.out.print("Escolha uma opção: ");
        return input.nextInt();
    }
}
