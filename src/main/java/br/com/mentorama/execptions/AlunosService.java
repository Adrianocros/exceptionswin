package br.com.mentorama.execptions;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

    public class AlunosService{
       public List<String> findAll(){
        try{
           URI caminho = AlunosService.class
           .getClassLoader()
            .getResource("aluno.txt").toURI();
            final List<String>string = Files.readAllLines(Path.of(caminho));
            return string;
       }catch(IOException | URISyntaxException | NullPointerException e){
           return Collections.emptyList();
       }
    }
    public String findAluno(String nome) throws AlunoNaoEncontradoException{
        return findAll().stream()
        .filter(aluno -> aluno.equals(nome))
        .findFirst()
        .orElseThrow(() -> new AlunoNaoEncontradoException(nome));    }


}
