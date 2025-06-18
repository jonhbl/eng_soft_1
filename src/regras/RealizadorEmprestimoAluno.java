package regras;

import modelos.Emprestimo;
import modelos.Exemplar;
import modelos.Livro;
import modelos.Reserva;
import modelos.Usuario;

public class RealizadorEmprestimoAluno implements IRealizadorEmprestimo {

    @Override
    public void realizarEmprestimo(Usuario usuario, Livro livro) {
        boolean condicaoAlunoDevedor = usuario.estaDevedor();
        boolean condicaoAlunoLimite = usuario.atingiuLimiteDeEmprestimos();
        boolean condicaoLivroEmprestado = usuario.estaComLivro(livro);
        boolean condicaoLivro = livro.temExemplaresDisponiveis();
        boolean condicaoLivroReservadoPorUsuario = livro.estaReservadoPorUsuario(usuario);
        boolean condicaoLivroReservado = livro.estaReservado();

        if (condicaoAlunoDevedor) {
            throw new RuntimeException("Aluno está com empréstimos atrasados.");
        } else if (condicaoAlunoLimite) {
            throw new RuntimeException("Aluno atingiu o limite de empréstimos.");
        } else if (!condicaoLivro) {
            throw new RuntimeException("Livro não possui exemplares disponíveis.");
        } else if (condicaoLivroEmprestado) {
            throw new RuntimeException("Aluno já está com o livro emprestado.");
        }

        if (condicaoLivroReservado) {
            if (condicaoLivroReservadoPorUsuario) {
                Reserva reserva = livro.getReservaPorUsuario(usuario);
                livro.removerReserva(reserva); // Remove a reserva do usuário
            } else {
                throw new RuntimeException("Livro já está reservado por outro(s) usuário(s).");
            }
        }

        Exemplar exemplar = livro.getExemplarDisponivel();
        Emprestimo emprestimo = new Emprestimo(usuario, exemplar);
        exemplar.setEmprestado();
        usuario.adicionarEmprestimo(emprestimo);
    }

}
