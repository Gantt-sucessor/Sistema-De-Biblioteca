
import java.util.Scanner;

public class MenuPrincipal {
    
    public static int exibirMenuPrincipal(Scanner input){

        System.out.println("\nBem-vindo ao sistema de biblioteca!");
        System.out.println("1 - Login como ADM");
        System.out.println("2 - Login como Usuário");
        System.out.println("3 - Sair");

        System.out.print("Por qual login você irá acessar: ");
        return input.nextInt();

    }
}
