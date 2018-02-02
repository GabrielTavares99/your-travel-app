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
import com.ueuo.gabrieltavares.main.util.DiasUtil;
import com.ueuo.gabrieltavares.main.util.MoedaUtil;
import com.ueuo.gabrieltavares.main.util.ResourceUtil;
import com.ueuo.gabrieltavares.your_travel_app.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ListaPacotesAdapter extends BaseAdapter {

    private List<Pacote> pacotes;
    private final Context context;

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

    private View getViewReciclada(View view, ViewGroup parent){
        if (view == null) {
            return LayoutInflater.from(context).inflate(R.layout.item_pacote, parent, false);
        }
        return view;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        View viewCriada = getViewReciclada(view, parent);

        Pacote pacote = pacotes.get(i);

        TextView cidade = viewCriada.findViewById(R.id.item_pacote_cidade);
        cidade.setText(pacote.getLocal());

        ImageView imageView = viewCriada.findViewById(R.id.item_pacote_imagem);
        imageView.setImageDrawable(ResourceUtil.getDrawableImage(context, pacote.getImagem()));

        TextView preco = viewCriada.findViewById(R.id.item_pacote_preco);
        preco.setText(String.valueOf(MoedaUtil.getPrecoFormatadoEmReal(pacote.getPreco())));

        TextView dias = viewCriada.findViewById(R.id.item_pacote_dias);
        dias.setText(DiasUtil.getQuantidadeDiasEmTexto(pacote.getDias()));

        // TODO: 02/02/18 Alterar readme para adicionar observações sobre a formatação dos dados

        return viewCriada;
    }


}
