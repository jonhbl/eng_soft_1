package proj_final_eng_soft;

public class Emprestimo {

    private String dataEmprestimo;
    private String dataDevolucao;
    private Usuario usuario;
    private Exemplar livro;

    public Emprestimo(String dataEmprestimo, String dataDevolucao, Usuario usuario, Exemplar livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.usuario = usuario;
        this.livro = livro;
    }

}
