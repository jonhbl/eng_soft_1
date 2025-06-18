package modelos;

import enums.Disponibilidade;

public class Exemplar {

    private String id;
    private Disponibilidade disponivel;
    private Livro livro;
    private Emprestimo emprestimo;

    public Exemplar(String id, boolean disponivel, Livro livro, Emprestimo emprestimo) {
        this.id = id;
        this.disponivel = Disponibilidade.DISPONIVEL;
        this.livro = livro;
        this.emprestimo = emprestimo;
    }

    public String getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean estaDisponivel() {
        return this.disponivel == Disponibilidade.DISPONIVEL;
    }

    public void setEmprestado() {
        this.disponivel = Disponibilidade.EMPRESTADO;
    }

}
