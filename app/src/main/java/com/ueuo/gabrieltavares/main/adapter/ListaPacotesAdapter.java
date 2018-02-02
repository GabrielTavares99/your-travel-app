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

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

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

        NumberFormat formatoBrasileiroMoeda = DecimalFormat.getCurrencyInstance(new Locale("pt", "br"));
        TextView preco = viewCriada.findViewById(R.id.item_pacote_preco);
        preco.setText(String.valueOf(formatoBrasileiroMoeda.format(pacote.getPreco()).replace("R$", "R$ ")));

        TextView dias = viewCriada.findViewById(R.id.item_pacote_dias);
        dias.setText(getQuantidadeDiasEmTexto(pacote.getDias()));

        return viewCriada;
    }

    private String getQuantidadeDiasEmTexto(int quantidadeDias){
        if (quantidadeDias > 1){
            return quantidadeDias + " dias";
        }else {
            return quantidadeDias + " dia";
        }
    }
}
