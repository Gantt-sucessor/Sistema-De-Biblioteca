import java.util.ArrayList;

public class Bibliotecario extends Usuario{
    
    private ArrayList<Livro> livros = new ArrayList<>();

    public Bibliotecario (String nome, String email, String senha){

        super(nome, email, senha);

    }
    
    public String cadastrarLivro(String nome, int numPagina, int estoque, String categoria, int isbn){
        Livro novoLivro = new Livro(nome, numPagina, estoque, categoria, isbn);
        livros.add(novoLivro);
        return "Livro: " +nome+" cadastrado com sucesso!!";
    }

    public void listarLivro(){

        for (Livro l : livros){
            System.out.println("------------------------");

            System.out.println(l.mostrarLivro());

            System.out.println("------------------------");

        }
    }

    public ArrayList<Livro> getLivros(){
        return livros;
    }
}
