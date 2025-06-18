package modelos;

public class Professor extends Usuario {


    public Professor(String nome, String id) {
        super(nome, id);
    }
    
    @Override
    public int getTempoDeEmprestimo() {
        return 8;
    }

	@Override
	public int getLimiteDeEmprestimo() {
		return Integer.MAX_VALUE;
	}
    
  

}
