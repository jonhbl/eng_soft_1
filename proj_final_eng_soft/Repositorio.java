package proj_final_eng_soft;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    private static Repositorio instance;

    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private List<Livro> livros = new ArrayList<Livro>();
    private List<Reserva> reservas = new ArrayList<Reserva>();
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    private Repositorio() {
    }

    public static Repositorio getInstance() { // Singleton
        if (instance == null) {
            instance = new Repositorio();
        }
        return instance;
    }

    public Usuario buscarUsuarioPorId(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    public Livro buscarLivroPorId(String id) {
        for (Livro livro : livros) {
            if (livro.getId().equals(id)) {
                return livro;
            }
        }
        return null;
    }

}
