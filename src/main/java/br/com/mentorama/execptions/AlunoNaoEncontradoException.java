package br.com.mentorama.execptions;

public class AlunoNaoEncontradoException extends Exception{

    public AlunoNaoEncontradoException(String nome) {
        super("O ALUNO " + nome + " NÃO FOI ENCONTRADO");
    }
    
}
