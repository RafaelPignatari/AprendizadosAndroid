package br.com.alura.agenda.model;

public class Aluno {
    private final String nomeAluno;
    private final String telefoneAluno;
    private final String emailAluno;

    public Aluno(String nomeAluno, String telefoneAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.telefoneAluno = telefoneAluno;
        this.emailAluno = emailAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    @Override
    public String toString() {
        return getNomeAluno();
    }
}
