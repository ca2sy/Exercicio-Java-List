package Pesquisa;

public class Livro {
    private String autor, titulo;
    private int anoDePublicacao;
    

    //construtor

    public Livro(String autor, String titulo, int anoDePublicacao){
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.autor = autor;
    }

    //getters

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
    
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    //setters

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
