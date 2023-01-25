package br.com.alura.agenda.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import br.com.alura.agenda.R;
import br.com.alura.agenda.dao.AlunoDAO;
import br.com.alura.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {
    private String nomeAluno;
    private String telefoneAluno;
    private String emailAluno;

    private EditText campoNome;
    private EditText campoTelefone;
    private EditText campoEmail;

    private AlunoDAO alunoDAO = new AlunoDAO();

    private final String TITULO_APPBAR = "Novo Aluno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle(TITULO_APPBAR);
        inicializacaoCampos();

        configuraBtnSalvar();
    }

    private void configuraBtnSalvar() {
        Button btnSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);

        btnSalvar.setOnClickListener(view -> {
            Aluno aluno = criaAluno();

            salvaAluno(aluno);
        });
    }

    private void inicializacaoCampos() {
        campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        campoEmail = findViewById(R.id.activity_formulario_aluno_email);
    }

    private Aluno criaAluno() {
        nomeAluno = campoNome.getText().toString();
        telefoneAluno = campoTelefone.getText().toString();
        emailAluno = campoEmail.getText().toString();

        return new Aluno(nomeAluno, telefoneAluno, emailAluno);
    }

    private void salvaAluno(Aluno aluno) {
        alunoDAO.salva(aluno);

        //startActivity(new Intent(FormularioAlunoActivity.this, ListaAlunosActivity.class));

        finish();
    }

}