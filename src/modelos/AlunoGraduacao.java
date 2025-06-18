package modelos;

public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(String nome, String id) {
        super(nome, id);
    }

    @Override
    public int getTempoDeEmprestimo() {
        return 4;
    }

    @Override
    public int getLimiteDeEmprestimo() {
        return 2;
    }

}
