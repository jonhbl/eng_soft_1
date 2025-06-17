package proj_final_eng_soft;

public class Reserva {

    private Usuario usuario;
    private Livro livro;
    private String dataReserva;

    public Reserva(Usuario usuario, Livro livro, String dataReserva) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataReserva = dataReserva;
    }

}
