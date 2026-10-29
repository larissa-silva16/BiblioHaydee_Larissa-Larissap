package br.escola.bibliohaydee.model;

public class Livro {

    private String titulo;
    private String ISBN;
    private Autor autor;
    private int anoPublicacao;
    private String genero;

    public Livro() {
    }

    public Livro(String titulo, String ISBN, Autor autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                "\nISBN: " + ISBN +
                "\n" + autor +
                "\nAno de publicação: " + anoPublicacao +
                "\nGênero: " + genero;
    }
}