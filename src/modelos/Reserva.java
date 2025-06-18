package modelos;

public class Reserva {

    private Usuario usuario;
    private Livro livro;
    private String dataReserva;

    public Reserva(Usuario usuario, Livro livro, String dataReserva) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataReserva = dataReserva;
    }

    public boolean estaReservadoPorUsuario(Usuario usuario) {
        return this.usuario.equals(usuario);
    }

}
