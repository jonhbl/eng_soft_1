package proj_final_eng_soft;

public class Livro {

    private String id;
    private String titulo;
    private String editora;
    private String autores;
    private String edicao;
    private int anoPublicacao;

    public Livro(String id, String titulo, String editora, String autores, String edicao, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public String getAutores() {
        return autores;
    }

    public String getEdicao() {
        return edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

}
