package br.com.mentorama.execptions;


public class AlunosMain {

	public static void main(String[] args){
		try {
			final String aluno = new AlunosService().findAluno("Aline");
			System.out.println("O aluno " + aluno + " foi encontrado");
		} catch (AlunoNaoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SUCESSO");
	}
}
