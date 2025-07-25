import java.util.ArrayList;
import java.util.Scanner;

public class ExecutarMenuUsuario {
    
       public static void main(Scanner input) {
        ArrayList<Livro> livros = new ArrayList<>();
    
        System.out.println("\nCadastro de Livro:");
    
        System.out.print("Nome: ");
        String nomeLivro = input.nextLine();
    
        System.out.print("Categoria: ");
        String categoriaLivro = input.nextLine();
    
        System.out.print("Número de Páginas: ");
        int numeroPaginas = input.nextInt();
    
        System.out.print("Estoque: ");
        int estoqueLivro = input.nextInt();
    
        System.out.print("ISBN: ");
        int isbnLivro = input.nextInt();
        input.nextLine(); 
    
        Livro novoLivro = new Livro(nomeLivro, numeroPaginas, estoqueLivro, categoriaLivro, isbnLivro);
        SistemaBiblioteca.adicionarLivro(novoLivro);
    }   

}
