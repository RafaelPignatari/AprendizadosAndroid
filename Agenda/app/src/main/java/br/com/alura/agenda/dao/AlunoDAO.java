package br.com.alura.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.agenda.model.Aluno;

public class AlunoDAO {
    private static List<Aluno> listaAlunos = new ArrayList<>();

    public static void salva(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public static List<Aluno> listaAlunos() {
        return listaAlunos;
    }
}
