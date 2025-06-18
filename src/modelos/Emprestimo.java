package modelos;

import java.time.LocalDate;

public class Emprestimo {

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Usuario usuario;
    private Exemplar exemplar;

    public Emprestimo(Usuario usuario, Exemplar exemplar) {
        int tempodeEmprestimo = usuario.getTempoDeEmprestimo();
        LocalDate hoje = LocalDate.now();
        this.dataEmprestimo = hoje;
        this.dataDevolucao = hoje.plusDays(tempodeEmprestimo);
        this.usuario = usuario;
        this.exemplar = exemplar;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public boolean estaAtrasado() {
        LocalDate hoje = LocalDate.now();
        return hoje.isAfter(this.dataDevolucao);
    }

}
