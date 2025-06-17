package proj_final_eng_soft;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

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
}
