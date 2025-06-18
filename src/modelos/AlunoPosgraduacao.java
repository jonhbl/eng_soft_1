package modelos;

public class AlunoPosgraduacao extends Aluno {

    public AlunoPosgraduacao(String nome, String id) {
        super(nome, id);
    }

    @Override
    public int getTempoDeEmprestimo() {
        return 5;
    }

    @Override
    public int getLimiteDeEmprestimo() {
        return 3;
    }
}
