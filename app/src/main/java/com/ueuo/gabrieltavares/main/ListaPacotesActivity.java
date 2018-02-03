package com.ueuo.gabrieltavares.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ueuo.gabrieltavares.main.adapter.ListaPacotesAdapter;
import com.ueuo.gabrieltavares.main.dao.PacoteDAO;
import com.ueuo.gabrieltavares.main.model.Pacote;
import com.ueuo.gabrieltavares.your_travel_app.R;

import java.io.Serializable;
import java.util.List;

public class ListaPacotesActivity extends AppCompatActivity {

    PacoteDAO pacoteDAO;
    List<Pacote> listaPacotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);

        setTitle(R.string.nome_categoria);

        pacoteDAO = new PacoteDAO();
        listaPacotes = pacoteDAO.lista();

        ListView listViewPacotes = findViewById(R.id.lista_pacotes_listView);
        listViewPacotes.setAdapter(new ListaPacotesAdapter(listaPacotes, this));



        listViewPacotes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ItemPacoteDetalhe.class);
                intent.putExtra("pacote", listaPacotes.get(i));
                startActivityForResult(intent, 1);
            }
        });

    }
}
