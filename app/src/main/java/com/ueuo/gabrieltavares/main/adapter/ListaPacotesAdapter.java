package com.ueuo.gabrieltavares.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.ueuo.gabrieltavares.main.model.Pacote;
import com.ueuo.gabrieltavares.your_travel_app.R;

import java.util.List;

public class ListaPacotesAdapter extends BaseAdapter {

    private List<Pacote> pacotes;
    private Context context;

    public ListaPacotesAdapter(List<Pacote> pacotes, Context context){
        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Object getItem(int posicao) {
        return pacotes.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View viewCriada;

        if (view == null) {
            viewCriada = LayoutInflater.from(context).inflate(R.layout.item_pacote, parent, false);
        }else {
            viewCriada = view;
        }

        Pacote pacote = pacotes.get(i);

        TextView cidade = viewCriada.findViewById(R.id.item_pacote_cidade);
        cidade.setText(pacote.getLocal());

        // TODO: 29/01/18 TERMINAR PROCESSO DE BIND 
        return viewCriada;
    }
}
