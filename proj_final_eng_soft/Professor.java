package proj_final_eng_soft;

public class Professor extends Usuario {


    public Professor(String nome, String id) {
        super(nome, id);
    }

    @Override
    public int getTempoEmprestimo() {
        return 8; // Responde com o valor
    }
}
