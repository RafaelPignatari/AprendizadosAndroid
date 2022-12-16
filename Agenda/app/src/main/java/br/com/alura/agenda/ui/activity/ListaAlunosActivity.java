package br.com.alura.agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alura.agenda.R;

public class ListaAlunosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_alunos_activity);
        List<String> listaTeste = new ArrayList<>(Arrays.asList("Rafael", "Pedro", "Diego"));

        ListView aluno = findViewById(R.id.lista_alunos_lbLista);
        aluno.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaTeste));

        setTitle("Lista de Alunos");
    }
}