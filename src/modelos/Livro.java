package modelos;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String id;
    private String titulo;
    private String editora;
    private String autores;
    private String edicao;
    private int anoPublicacao;
    private List<Exemplar> exemplares = new ArrayList<Exemplar>();
    private List<Reserva> reservas = new ArrayList<Reserva>();

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

    public Boolean temExemplaresDisponiveis() {
        for (Exemplar exemplar : exemplares) {
            if (exemplar.estaDisponivel()) {
                return true;
            }
        }
        return false;
    }

    public Exemplar getExemplarDisponivel() {
        for (Exemplar exemplar : exemplares) {
            if (exemplar.estaDisponivel()) {
                return exemplar;
            }
        }
        return null;
    }

    public int getQuantidadeDisponivel() {
        int quantidade = 0;
        for (Exemplar exemplar : exemplares) {
            if (exemplar.estaDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int getQuantidadeReservas() {
        return reservas.size();
    }

    public boolean estaReservadoPorUsuario(Usuario usuario) {
        for (Reserva reserva : reservas) {
            if (reserva.estaReservadoPorUsuario(usuario)) {
                return true;
            }
        }
        return false;
    }

    public Reserva getReservaPorUsuario(Usuario usuario) {
        for (Reserva reserva : reservas) {
            if (reserva.estaReservadoPorUsuario(usuario)) {
                return reserva;
            }
        }
        return null;
    }

    public void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void adicionarExemplar(Exemplar exemplar) {
        this.exemplares.add(exemplar);
    }

    public void removerReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }

}
