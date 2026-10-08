package br.escola.bibliohaydee.model;

public class Autor {

    public String nome;
    public String nacionalidade;
    public int anoNascimento;

    public Autor() {
    }

    @Override
    public String toString() {
        return "Autor: " + nome +
                "\nNacionalidade: " + nacionalidade +
                "\nAno de nascimento: " + anoNascimento;
    }
}