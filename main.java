import java.util.ArrayList;
import java.util.Scanner;

public class main{
    
    public static void main(String[] args) {
        
        ArrayList<Livro> livro = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de biblioteca, por qual login você irá acessar");

        System.out.println("1- ADM");
        System.out.println("2- Usuário");
        int opcoes = input.nexInt();

        switch (opcoes) {
            case 1:
                
                break;
           
        }

        System.out.println("Nome: ");
        String nomePessoa = input.nextLine();

        System.out.println("Email:");
        String emailPessoa = input.next();

        System.out.println("Senha: ");
        String senhaPessoa = input.next();

        Bibliotecario bibliotecario = new Bibliotecario(nomePessoa, emailPessoa, senhaPessoa);


        if (nomePessoa.equals("Luciano") && emailPessoa.equals("bolhadeplastico@outlook.com") && senhaPessoa.equals("123")) {
        
            System.out.println("----------------------------------");
            
            System.out.println("Bem vindo ADM "+nomePessoa);
            
            System.out.println("Cadastre o livro");

            System.out.println("Nome:");
            String nomeLivro = input.next();

            System.out.println("Categoria: ");
            String categoriaLivro = input.next();

            System.out.println("Numero de Paginas: ");
            int numeroPaginas = input.nextInt();

            System.out.println("Estoque: ");
            int estoqueLivro = input.nextInt();

            input.nextLine();

            System.out.println("Isbn: ");
            int isbnLivro = input.nextInt();

            bibliotecario.cadastrarLivro(nomeLivro, numeroPaginas, estoqueLivro, categoriaLivro, isbnLivro);

        }else{

            System.out.println("Bem vindo ADM "+nomePessoa);

        }

    }
}
