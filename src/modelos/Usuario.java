package modelos;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    private String nome;
    private String id;
    private List<Reserva> reservas = new ArrayList<Reserva>();
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
    }

    public boolean estaComLivro(Livro livro) {
        for (Emprestimo emprestimo : emprestimos) {
            Exemplar exemplar = emprestimo.getExemplar();
            Livro livroEmprestado = exemplar.getLivro();
            if (livroEmprestado.equals(livro)) {
                return true;
            }
        }
        return false;
    }

    public boolean estaDevedor() {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.estaAtrasado()) {
                return true;
            }
        }
        return false;
    }

    public boolean atingiuLimiteDeEmprestimos() {
        return getEmprestimos().size() >= getLimiteDeEmprestimo();
    }

    public abstract int getLimiteDeEmprestimo();

    public abstract int getTempoDeEmprestimo();

}
