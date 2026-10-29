package br.escola.bibliohaydee.model;


public class Usuario {

    public static final int LIMITE_PADRAO = 3;
    private String nome;
    private String matricula;
    private String tipo;
    private Integer limiteEmprestimos;
    private Integer emprestimosAtivos;



    public Usuario(String nomeUsuario, String matriculaUsuario,
                   String tipoUsuario, Integer limiteUsuario) {


        if (nomeUsuario == null || nomeUsuario.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }


        if (tipoUsuario == null ||
                (!tipoUsuario.equals("ALUNO") &&
                        !tipoUsuario.equals("PROFESSOR"))) {
            throw new IllegalArgumentException(
                    "O tipo deve ser ALUNO ou PROFESSOR."
            );
        }


        this.nome = nomeUsuario;
        this.matricula = matriculaUsuario;
        this.tipo = tipoUsuario;
        this.limiteEmprestimos = limiteUsuario;
        this.emprestimosAtivos = 0;
    }
    public Usuario(String nomeUsuario, String matriculaUsuario, String tipoUsuario) {
        this(nomeUsuario, matriculaUsuario, tipoUsuario, LIMITE_PADRAO);
    }

    public String getNome() {
        return nome;
    }


    public String getMatricula() {
        return matricula;
    }


    public String getTipo() {
        return tipo;
    }


    public Integer getLimiteEmprestimos() {
        return limiteEmprestimos;
    }


    public Integer getEmprestimosAtivos() {
        return emprestimosAtivos;
    }


    public void setNome(String novoNome) {
        if (novoNome == null || novoNome.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "O nome não pode ser vazio."
            );
        }
        this.nome = novoNome;
    }


    public void setTipo(String novoTipo) {
        if (novoTipo == null ||
                (!novoTipo.equals("ALUNO") &&
                        !novoTipo.equals("PROFESSOR"))) {
            throw new IllegalArgumentException(
                    "O tipo deve ser ALUNO ou PROFESSOR."
            );
        }


        this.tipo = novoTipo;
    }


}



