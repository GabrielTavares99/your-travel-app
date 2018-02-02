package com.ueuo.gabrieltavares.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.ueuo.gabrieltavares.main.adapter.ListaPacotesAdapter;
import com.ueuo.gabrieltavares.main.dao.PacoteDAO;
import com.ueuo.gabrieltavares.main.model.Pacote;
import com.ueuo.gabrieltavares.your_travel_app.R;

import java.util.List;

public class ListaPacotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);

        setTitle(R.string.nome_categoria);

        List<Pacote> listaPacotes = new PacoteDAO().lista();

        ListView listViewPacotes = findViewById(R.id.lista_pacotes_listView);
        listViewPacotes.setAdapter(new ListaPacotesAdapter(listaPacotes, this));

    }
}
