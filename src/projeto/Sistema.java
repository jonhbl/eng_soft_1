package projeto;

import commander.ICommand;

public class Sistema {

    private LeitorComandos leitorComandos;

    public Sistema() {
        this.leitorComandos = new LeitorComandos();
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao sistema de gerenciamento de biblioteca!");
        ICommand commander = null;
        Repositorio repositorio = Repositorio.getInstance();

        while (true) {
            String comandoCompleto = lerEntradaUsuario();
            commander = leitorComandos.processarComando(comandoCompleto);
            commander.executar();
        }
    }

    private String lerEntradaUsuario() {
        // Simulação de leitura de entrada do usuário
        // Em um sistema real, você usaria Scanner ou BufferedReader
        return "liv 123"; // Exemplo de comando
    }
}
