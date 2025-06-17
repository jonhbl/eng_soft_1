package proj_final_eng_soft;

public class AlunoPosgraduacao extends Aluno {


    public AlunoPosgraduacao(String nome, String id) {
        super(nome, id);
    }

    @Override
    public int getTempoEmprestimo() {
        return 5; // Responde com o valor
    }

    @Override
    public int getLimiteEmprestimo() {
        return 3;
    }
}
