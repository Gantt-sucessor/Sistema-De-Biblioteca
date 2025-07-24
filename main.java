import java.util.Scanner;

public class main{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de biblioteca");

        System.out.println("1- ADM");
        System.out.println("2- Usuário");

        System.out.println("Por qual login você irá acessar");
        int opcoes = input.nextInt();

        System.out.println("------------------");

        switch (opcoes) {
            case 1:
                
                System.out.println("Nome: ");
                String nomePessoa = input.next();

                System.out.println("Email:");
                String emailPessoa = input.next();

                System.out.println("Senha: ");
                String senhaPessoa = input.next();

                Bibliotecario bibliotecario = new Bibliotecario(nomePessoa, emailPessoa, senhaPessoa);

                if (nomePessoa.equals("Luciano") && emailPessoa.equals("bolhadeplastico@outlook.com") && senhaPessoa.equals("123")) {
                    

                    while (true) { 

                        System.out.println("----------------------------------");
            
                        System.out.println("Bem vindo ADM ");

                        System.out.println("1- Cadastrar livro ");
                        System.out.println("2- Visuazliar livros cadastrados");
                        System.out.println("3- Sair");

                        System.out.println("Escolhe a opção que você deseja realizar");
                        int opcoesAdm = input.nextInt();
 
                        input.nextLine();

                            switch(opcoesAdm){

                                case 1:
                                        
                                    System.out.println("Cadastre o livro");

                                    System.out.println("Nome:");
                                    String nomeLivro = input.nextLine();

                                    System.out.println("Categoria: ");
                                    String categoriaLivro = input.nextLine();

                                    System.out.println("Numero de Paginas: ");
                                    int numeroPaginas = input.nextInt();

                                    System.out.println("Estoque: ");
                                    int estoqueLivro = input.nextInt();

                                    input.nextLine();

                                    System.out.println("Isbn: ");
                                    int isbnLivro = input.nextInt();
                                
                                    Livro novoLivro = new Livro(nomeLivro, numeroPaginas, estoqueLivro, categoriaLivro, isbnLivro);

                                    SistemaBiblioteca.adicionarLivro(novoLivro);

                                    break;

                        
                                case 2:

                                    SistemaBiblioteca.listarLivros();

                                    break;

                                case 3:

                                    System.out.println("Até mais "+nomePessoa+" saindo....");
                                    input.close();
                                    return;
                    
                            } 
                        }
                }else{
                    System.out.println("Dados inválidos, por favor informa o login certo");
                
                }
                break;

            case 2:
                
                
                System.out.println("Nome: ");
                String nomeUsuario = input.next();

                System.out.println("Email:");
                String emailUsuario = input.next();

                System.out.println("Senha: ");
                String senhaUsuario = input.next();

                UsuarioComum usuarioComum = new UsuarioComum(nomeUsuario, emailUsuario, senhaUsuario);


                while (true) { 
                    
                    System.out.println("----------------------------------");
            
                    System.out.println("Bem vindo Usuario ");

                    System.out.println("1- Ver Livros Disponíveis ");
                    System.out.println("2- Comprar Livro");
                    System.out.println("3- Sair");

                    System.out.println("Escolhe a opção que você deseja realizar");
                    int opcoesUsuario = input.nextInt();

                    switch(opcoesUsuario){
                        
                        case 1:

                            SistemaBiblioteca.listarLivros();

                        case 2:
                            
                    }

                }
                
        }
    }  
}

 

