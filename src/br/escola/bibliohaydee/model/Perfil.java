package br.escola.bibliohaydee.model;


public class Perfil {


    private String apelido;


    public String getApelido() {
        return apelido;
    }


    public void setApelido(String novoApelido) {
        if (novoApelido != null && !novoApelido.trim().isEmpty()) {
            apelido = novoApelido;
        } else {
            System.out.println("Apelido inválido!");
        }
    }
}
