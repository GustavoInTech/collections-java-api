package comparableXcomparator;

import java.util.Comparator;

// Uma classe 'Livro' que implementa Comparable 
public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    // Contritor
    public Livro(String ti, String au, int an) {
        this.titulo = ti;
        this.autor = au;
        this.ano = an;
    }

    // Usano para ordenar livros por ano
    public int compareTo(Livro l) {
        return titulo.compareTo(l.titulo);
    }

    // Métodos getters para acessar os dados provados
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
}

class CompararAno implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
        /*
         * if (l1.getAno() < l2.getAno())
         * return -1;
         * if (l1.getAno() > l2.getAno())
         * return 1;
         * else
         * return 0;
         */
    }

}

class CompararAnoAutorTitulo implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano != 0)
            return ano;
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor != 0)
            return autor;
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}
