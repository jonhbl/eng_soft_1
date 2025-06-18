package commander;

public class CommandEmprestar implements ICommand {
	private String codigoUsuario;
    private String codigoLivro;

    public CommandEmprestar(String codigoUsuario, String codigoLivro) {
        this.codigoUsuario = codigoUsuario;
        this.codigoLivro = codigoLivro;
    }
    
    
    public void executar(){
    	
    }
}
