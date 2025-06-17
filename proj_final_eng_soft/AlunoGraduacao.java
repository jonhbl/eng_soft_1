package proj_final_eng_soft;

public class AlunoGraduacao extends Aluno {


    public AlunoGraduacao(String nome, String id) {
        super(nome, id);
    }

    @Override
    public int getTempoEmprestimo() {
        return 4; // Responde com o valor
    }

    @Override
    public int getLimiteEmprestimo() {
        return 2;
    }

}
