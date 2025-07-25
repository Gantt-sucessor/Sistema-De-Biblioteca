import java.util.ArrayList;
import java.util.Iterator;

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
   
            System.out.println(l.mostrarLivro());
        }
    }

    public static boolean comprarLivros(String nomeLivro, int quantidade){
        for (Livro l: livros){

            if(l.getNome().equalsIgnoreCase(nomeLivro)){
                if(l.reduzirEstoque(quantidade)){
                    System.out.println("Compra realizado com sucesso!!");
                    return true;
                }else{
                    System.out.println("Estoque insuficiente. Temos apenas: "+l.getEstoque()+" unidades");
                    return false;
                }

            }
        }

        System.out.println("Livro não encontrado");
        return false;
    }

    public static boolean excluirLivro(String nomeLivro){

        Iterator<Livro> iterator = livros.iterator();

        while(iterator.hasNext()){
            Livro livro = iterator.next();
            if(livro.getNome().equalsIgnoreCase(nomeLivro)){
                iterator.remove();
                return true;
            }
        }
        return false;

    }
}
