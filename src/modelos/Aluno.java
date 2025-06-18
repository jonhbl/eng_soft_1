package modelos;

public abstract class Aluno extends Usuario {

    public Aluno(String nome, String id) {
        super(nome, id);
    }

    public abstract int getLimiteDeEmprestimo();

    public boolean atingiuLimiteDeEmprestimos() {
        return getEmprestimos().size() >= getLimiteDeEmprestimo();
    }

}
