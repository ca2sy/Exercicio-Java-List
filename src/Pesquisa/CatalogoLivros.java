package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    public List<Livro> Livros;

    public CatalogoLivros (){
        this.Livros = new ArrayList<>();
    }

    public void adicionarLivroNoCatalogo(String titulo, String autor, int anoDePublicacao){
        Livros.add(new Livro(autor, titulo, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> LivrosEncontradosPorAutor = new ArrayList<>();

        for(Livro l : Livros){
            if (l.getAutor().equalsIgnoreCase(autor)) {
                LivrosEncontradosPorAutor.add(l);
            }
        }
        return LivrosEncontradosPorAutor;
    }

        public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> LivrosEncontradosPorAno = new ArrayList<>();
        for(Livro l : Livros){
            if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
                LivrosEncontradosPorAno.add(l);
            }
        }
     
        return LivrosEncontradosPorAno;
    }


     public Livro pesquisarPorTitulo(String titulo){

        Livro livroEncontradoPorTitulo = null;

        for(Livro l : Livros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                break;
            }
        }
     
        return livroEncontradoPorTitulo;
    }
}
