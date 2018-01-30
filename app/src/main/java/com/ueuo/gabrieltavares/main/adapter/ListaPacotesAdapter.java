package com.ueuo.gabrieltavares.main.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
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

        ImageView imageView = viewCriada.findViewById(R.id.item_pacote_imagem);
        Resources resources = context.getResources();
        int idDrawable = resources.getIdentifier(pacote.getImagem(), "drawable", context.getPackageName());
        Drawable drawableImagemPacote = resources.getDrawable(idDrawable);
        imageView.setImageDrawable(drawableImagemPacote);

        // TODO: 30/01/18 CORRIGIR FORMATAÇÃO DE VALORES
        TextView preco = viewCriada.findViewById(R.id.item_pacote_preco);
        preco.setText(String.valueOf(pacote.getPreco()));

        TextView dias = viewCriada.findViewById(R.id.item_pacote_dias);
        dias.setText(String.valueOf(pacote.getDias())+" dias");

        return viewCriada;
    }
}
