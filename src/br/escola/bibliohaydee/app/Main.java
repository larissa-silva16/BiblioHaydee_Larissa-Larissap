package br.escola.bibliohaydee.app;

import br.escola.bibliohaydee.model.Autor;
import br.escola.bibliohaydee.model.Livro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Listas do acervo
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();

        // Criando autor
        Autor autor = new Autor();

        autor.nome = "Machado de Assis";
        autor.nacionalidade = "Brasileiro";
        autor.anoNascimento = 1839;

        // Guardando o autor na lista
        autores.add(autor);

        // Criando livro
        Livro livro = new Livro(
                "Dom Casmurro",
                "123456789",
                autor,
                1899,
                "Romance"
        );

        // Guardando o livro na lista
        livros.add(livro);

        // Listando autores
        System.out.println("===== AUTORES =====");

        for (Autor a : autores) {
            System.out.println(a);
        }

        // Listando livros
        System.out.println("\n===== ACERVO =====");

        if (livros.isEmpty()) {
            System.out.println("O acervo está vazio.");
        } else {
            for (Livro l : livros) {
                System.out.println(l);
                System.out.println("----------------------");
            }
        }
    }
}