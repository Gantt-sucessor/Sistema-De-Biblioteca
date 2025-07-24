import java.util.ArrayList;

public class SistemaBiblioteca {
    
    private static ArrayList<Livro> livros = new ArrayList<>();

    public static void adicionarLivro(Livro livro){

        livros.add(livro);

    }

    public static ArrayList<Livro> getLivros(){
        return livros;

    }

    public static void listarLivros() {
        for (Livro l : livros) {
            System.out.println("Livros cadastrados:");
            System.out.println(l.mostrarLivro());
        }
    }
}
