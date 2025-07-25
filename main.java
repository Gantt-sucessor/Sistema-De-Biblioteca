import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        MenuAdm menuAdm = new MenuAdm();

        while (true) { 
            
            int opcoesMenuGeral = menuPrincipal.exibirMenuPrincipal(input);

            switch (opcoesMenuGeral) {
                case 1:         

                    while (true) {
                        
                        int opcoesMenuAdm = menuAdm.exibirMenuAdm(input);
            
                        switch (opcoesMenuAdm ) {
                            case 1:
                                
                                ExecutarMenuAdm executarMenuAdm = new ExecutarMenuAdm();

                                break;

                            case 2:
                            
                                System.out.println("Livros cadastrados:");
                                SistemaBiblioteca.listarLivros();
                                break;

                            case 3:
                                    
                                System.out.println("Digite o nome do livro que você deseja escluir: ");
                                String nomeExcluir = input.next();

                                if (SistemaBiblioteca.excluirLivro(nomeExcluir)) {
                                    System.out.println("Livro removido com sucesso!");
                                }else{
                                    System.out.println("Livro não encontrado!");
                                }

                                break; 

                            case 4:
                                System.out.println("Saindo da conta do ADM...");
                                break; 
                        }

                        if (opcoesMenuAdm == 3){
                            break;
                        }
                    }            

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

