package br.com.alura.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alura.agenda.R;
import br.com.alura.agenda.dao.AlunoDAO;

public class ListaAlunosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lista_alunos_activity);

        setTitle("Lista de Alunos");

        FloatingActionButton btnAdicionar = findViewById(R.id.activity_lista_alunos_botao_adicionar);

        btnAdicionar.setOnClickListener(view -> startActivity(new Intent(ListaAlunosActivity.this, FormularioAlunoActivity.class)));

    }

    @Override
    protected void onResume() {
        super.onResume();
        ListView aluno = findViewById(R.id.lista_alunos_lbLista);

        aluno.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, AlunoDAO.listaAlunos()));
    }
}
