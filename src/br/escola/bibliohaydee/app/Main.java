package br.escola.bibliohaydee.app;

import br.escola.bibliohaydee.model.Autor;
import br.escola.bibliohaydee.model.Livro;
import br.escola.bibliohaydee.model.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        Autor autor = new Autor();
        autor.setNome("Machado de Assis");
        autor.setNacionalidade("Brasileiro");
        autor.setAnoNascimento(1839);
        autores.add(autor);


        Livro livro = new Livro(
                "Dom Casmurro",
                "123456789",
                autor,
                1899,
                "Romance"
        );


        livros.add(livro);


        System.out.println("===== AUTORES =====");
        for (Autor a : autores) {
            System.out.println(a);
            System.out.println("-------------------");
        }


        System.out.println("\n===== LIVROS =====");
        if (livros.isEmpty()) {
            for (Livro l : livros) {
                System.out.println(l);
                System.out.println("----------------------");
            }

            scanner.close();
        }

        System.out.println("\n===== CADASTRO DE USUÁRIO =====");

        System.out.print("Nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Tipo (ALUNO/PROFESSOR): ");
        String tipo = scanner.nextLine().toUpperCase();

        System.out.print("Definir o limite? (S/N): ");
        String resposta = scanner.nextLine();

        Usuario usuario;

        if (resposta.equalsIgnoreCase("S")) {
            System.out.print("Digite o limite de empréstimos: ");
            int limite = Integer.parseInt(scanner.nextLine());

            usuario = new Usuario(nome, matricula, tipo, limite);
        } else {
            usuario = new Usuario(nome, matricula, tipo);
        }

        usuarios.add(usuario);

        System.out.println("\nUsuário cadastrado:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Matrícula: " + usuario.getMatricula());
        System.out.println("Tipo: " + usuario.getTipo());
        System.out.println("Limite de empréstimos: " + usuario.getLimiteEmprestimos());
    }
}