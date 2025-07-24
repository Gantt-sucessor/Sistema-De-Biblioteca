import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem-vindo ao sistema de biblioteca");
            System.out.println("1 - ADM");
            System.out.println("2 - Usuário");
            System.out.println("3 - Sair");

            System.out.print("Por qual login você irá acessar: ");
            int opcoes = input.nextInt();
            input.nextLine(); 

            System.out.println("------------------");

            switch (opcoes) {
                case 1:
                    System.out.print("Nome: ");
                    String nomePessoa = input.next();

                    System.out.print("Email: ");
                    String emailPessoa = input.next();

                    System.out.print("Senha: ");
                    String senhaPessoa = input.next();

                    if (nomePessoa.equals("Luciano") &&
                        emailPessoa.equals("bolhadeplastico@outlook.com") &&
                        senhaPessoa.equals("123")) {

                        while (true) {
                            System.out.println("\nBem-vindo ADM " + nomePessoa);
                            System.out.println("1 - Cadastrar livro");
                            System.out.println("2 - Visualizar livros cadastrados");
                            System.out.println("3 - Sair");

                            System.out.print("Escolha a opção: ");
                            int opcoesAdm = input.nextInt();
                            input.nextLine(); 
                            
                            switch (opcoesAdm) {
                                case 1:
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
                                    break;

                                case 2:
                                    System.out.println("Livros cadastrados:");
                                    SistemaBiblioteca.listarLivros();
                                    break;

                                case 3:
                                    System.out.println("Saindo da conta do ADM...");
                                    break; 
                            }

                            if (opcoesAdm == 3){
                                break;
                            }
                        }
                    } else {
                        System.out.println("Login inválido. Tente novamente.");
                    }
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeUsuario = input.next();

                    System.out.print("Email: ");
                    String emailUsuario = input.next();

                    System.out.print("Senha: ");
                    String senhaUsuario = input.next();

                    UsuarioComum usuarioComum = new UsuarioComum(nomeUsuario, emailUsuario, senhaUsuario);

                    while (true) {
                        System.out.println("\nBem-vindo, " + nomeUsuario);
                        System.out.println("1 - Ver Livros Disponíveis");
                        System.out.println("2 - Comprar Livro");
                        System.out.println("3 - Sair");

                        System.out.print("Escolha a opção: ");
                        int opcoesUsuario = input.nextInt();
                        input.nextLine();

                        switch (opcoesUsuario) {
                            case 1:
                                SistemaBiblioteca.listarLivros();
                                break;

                            case 2:
                                System.out.println("Digite o nome do livro que deseja comprar: ");
                                String nomeLivro = input.next();

                                System.out.println("Digite quantos exemplares deseja comprar:");
                                int quantidadeLivro = input.nextInt();

                                SistemaBiblioteca.comprarLivros(nomeLivro, quantidadeLivro);

                                break;

                            case 3:
                                System.out.println("Saindo da conta de usuário...");
                                break;
                        }

                        if (opcoesUsuario == 3){

                            break;
                        } 

                    }
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    input.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
