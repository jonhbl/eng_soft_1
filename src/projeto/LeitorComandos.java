package projeto;

import commander.CommandVerificar;
import commander.CommandConsultarLivro;
import commander.CommandConsultarUsuario;
import commander.CommandEmprestarLivro;
import commander.CommandDevolverLivro;

public class LeitorComandos {

    private static final String COMANDO_CONSULTAR_LIVRO = "liv";
    private static final String COMANDO_CONSULTAR_USUARIO = "usu";
    private static final String COMANDO_EMPRESTAR_LIVRO = "emp";
    private static final String COMANDO_DEVOLVER_LIVRO = "dev";
    private static final String COMANDO_RESERVAR_LIVRO = "res";
    private static final String COMANDO_OBSERVAR_LIVRO = "obs";
    private static final String COMANDO_SAIR = "sai";

    public void processarComando(String comandoCompleto) {
        String[] partes = comandoCompleto.split(" ");
        String tipoComando = partes[0].toLowerCase();
        switch (tipoComando) {
            case COMANDO_CONSULTAR_LIVRO:
                comando = new CommandConsultarLivro(partes);
                break;
            case COMANDO_CONSULTAR_USUARIO:
                comando = new CommandConsultarUsuario(partes);
                break;
            case COMANDO_EMPRESTAR_LIVRO:
                comando = new CommandEmprestarLivro(partes);
                break;
            case COMANDO_DEVOLVER_LIVRO:
                comando = new CommandDevolverLivro(partes);
                break;
            case COMANDO_RESERVAR_LIVRO:
                // Lógica para reservar livro
                break;
            case COMANDO_OBSERVAR_LIVRO:
                // Lógica para cancelar reserva
                break;
            case COMANDO_SAIR:
                System.out.println("Saindo do sistema...");
                // Lógica para sair do sistema
                break;
            default:
                System.out.println("Comando desconhecido: " + comando);
        }
    }
}
