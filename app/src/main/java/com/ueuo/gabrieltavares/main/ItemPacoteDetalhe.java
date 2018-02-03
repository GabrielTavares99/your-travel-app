package com.ueuo.gabrieltavares.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ueuo.gabrieltavares.main.model.Pacote;
import com.ueuo.gabrieltavares.main.util.MoedaUtil;
import com.ueuo.gabrieltavares.main.util.ResourceUtil;
import com.ueuo.gabrieltavares.your_travel_app.R;

import java.io.Serializable;

public class ItemPacoteDetalhe extends AppCompatActivity {

    TextView lbl_local, lbl_preco, lbl_descrição;
    ImageView img_local;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_pacote_detalhe);

        Bundle bundle = getIntent().getExtras();
        Pacote pacote = (Pacote) bundle.getSerializable("pacote");

        lbl_local = findViewById(R.id.item_pacote_detalhe_local);
        lbl_local.setText(pacote.getLocal());

        lbl_preco = findViewById(R.id.item_pacote_detalhe_preco);
        lbl_preco.setText(MoedaUtil.getPrecoFormatadoEmReal(pacote.getPreco()));

        lbl_descrição = findViewById(R.id.item_pacote_detalhe_descricao);
        lbl_descrição.setText(pacote.getDescrição());

        img_local = findViewById(R.id.item_pacote_detalhe_imagem);
        img_local.setImageDrawable(ResourceUtil.getDrawableImage(getApplicationContext(), pacote.getImagem()));
    }
}
