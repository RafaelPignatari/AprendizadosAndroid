package br.com.alura.agenda.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.alura.agenda.R;
import br.com.alura.agenda.dao.AlunoDAO;
import br.com.alura.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        final EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);

        Button btnSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);

        btnSalvar.setOnClickListener(view -> {
            String nomeAluno = campoNome.getText().toString();
            String telefoneAluno = campoTelefone.getText().toString();
            String emailAluno = campoEmail.getText().toString();

            Aluno aluno = new Aluno(nomeAluno, telefoneAluno, emailAluno);
            AlunoDAO alunoDAO = new AlunoDAO();

            alunoDAO.salva(aluno);

            //startActivity(new Intent(FormularioAlunoActivity.this, ListaAlunosActivity.class));

            finish();
        });
    }

}