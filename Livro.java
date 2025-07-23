public class Livro{

    private String nome;
    private int numPagina, estoque;
    private String categoria;
    private int isbn;
    
    public Livro(String nome, int numPagina, int estoque, String categoria, int isbn){

        this.nome = nome;
        this.numPagina = numPagina;
        this.estoque = estoque;
        this.categoria = categoria;
        this.isbn = isbn;

    }

    public String getNome(){

        return nome;

    }

    public int getnumPagina(){

        return numPagina;
        
    }

    public int getEstoque(){

        return estoque;
        
    }

    public String getCategoria(){

        return categoria;
        
    }

    public int getIsbn(){

        return isbn;
        
    }

    public boolean reduzirEstoque(){

        if (estoque > 0){

            estoque--;
            return true;

        }else{

            return false;

        }
    }

    
    public String mostrarLivro(){
        return "Nome: "+nome+" \ncategoria: "+categoria+" \nnumero de páginas: "+numPagina+" \nestoque: "+estoque+" \nisbn: "+isbn;
    }

}