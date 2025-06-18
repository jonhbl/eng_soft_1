package regras;

import modelos.Emprestimo;
import modelos.Exemplar;
import modelos.Livro;
import modelos.Reserva;
import modelos.Usuario;

public class RealizadorEmprestimoProfessor implements IRealizadorEmprestimo {

    @Override
    public void realizarEmprestimo(Usuario usuario, Livro livro) {
        boolean condicaoUsuarioDevedor = usuario.estaDevedor();
        boolean condicaoLivroEmprestado = usuario.estaComLivro(livro);
        boolean condicaoLivro = livro.temExemplaresDisponiveis();
        boolean condicaoLivroReservadoPorUsuario = livro.estaReservadoPorUsuario(usuario);

        if (condicaoUsuarioDevedor) {
            throw new RuntimeException("Usuario está com empréstimos atrasados.");
        } else if (!condicaoLivro) {
            throw new RuntimeException("Livro não possui exemplares disponíveis.");
        } else if (condicaoLivroEmprestado) {
            throw new RuntimeException("Usuario já está com o livro emprestado.");
        }

        if (condicaoLivroReservadoPorUsuario) { // Faz sentido ele fazer reserva?
            Reserva reserva = livro.getReservaPorUsuario(usuario);
            livro.removerReserva(reserva);
        }

        Exemplar exemplar = livro.getExemplarDisponivel();
        Emprestimo emprestimo = new Emprestimo(usuario, exemplar);
        exemplar.setEmprestado();
        usuario.adicionarEmprestimo(emprestimo);
    }

}
