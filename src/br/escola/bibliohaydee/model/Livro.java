package br.escola.bibliohaydee.model;

public class Livro {

    public String titulo;
    public String ISBN;
    public Autor autor;
    public int anoPublicacao;
    public String genero;
    public boolean disponivel;

    public Livro(String titulo, String ISBN, Autor autor,
                 int anoPublicacao, String genero) {

        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.disponivel = true;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo +
                "\nISBN: " + ISBN +
                "\nAutor: " + autor.nome +
                "\nAno de publicação: " + anoPublicacao +
                "\nGênero: " + genero +
                "\nDisponível: " + disponivel;
    }
}