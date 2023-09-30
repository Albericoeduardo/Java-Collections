package List.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPubli){
        System.out.println("Adicionando "+titulo+"...");
        listaLivros.add(new Livro(titulo, autor, anoPubli));
    }

    public void pesquiarPorAutor(String autor){
        System.out.println("Livros do "+autor+":");
        for (Livro i : listaLivros){
            if(i.autor.equalsIgnoreCase(autor)){
                System.out.println(i.titulo);
            }
        }
    }

    public void pesquisarPorIntervalorDeAno(int anoInicial, int anoFinal){
        System.out.println("Livros entre "+anoInicial+" e "+anoFinal);
        for (Livro i : listaLivros){
            if(i.anoPubli >= anoInicial && i.anoPubli <= anoFinal){
                System.out.println("Livro: "+i.titulo+", Autor: "+ i.autor);
            }
        }
    }

    public void pesquiarPorTitulo(String titulo){
        for (Livro i : listaLivros){
            if (i.titulo.equalsIgnoreCase(titulo)){
                System.out.println("Livro encontrado: "+i.titulo);
            }
        }
    }

    public static void main(String[] args) {
        CatalogoLivros listaLivros = new CatalogoLivros();

        listaLivros.adicionarLivro("albericoBorn", "Albérico", 2015);
        listaLivros.adicionarLivro("albericoLife", "Albérico", 2020);
        listaLivros.adicionarLivro("albericoDeath", "Albérico", 2028);
        listaLivros.adicionarLivro("albericoAfterDeath", "Albérico", 2032);

        listaLivros.pesquiarPorAutor("Albérico");
        listaLivros.pesquisarPorIntervalorDeAno(2022, 2032);
        listaLivros.pesquiarPorTitulo("albericoAfterDeath");
    }
}
