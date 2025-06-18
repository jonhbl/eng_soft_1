package regras;

import modelos.Aluno;
import modelos.Livro;
import modelos.Usuario;

public interface IRealizadorEmprestimo {
	void realizarEmprestimo(Usuario usuario, Livro livro);

}
