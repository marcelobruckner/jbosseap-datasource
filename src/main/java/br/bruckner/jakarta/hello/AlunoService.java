package br.bruckner.jakarta.hello;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class AlunoService {
    @Inject
    private AlunoRepository dao;

    public List<Aluno> listarTodos(){
        return dao.listarTodos();
    }

    public Aluno salvar(Aluno aluno) {
        return dao.salvar(aluno);
    }
}
