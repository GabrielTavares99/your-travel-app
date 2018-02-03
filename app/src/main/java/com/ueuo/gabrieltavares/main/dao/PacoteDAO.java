package com.ueuo.gabrieltavares.main.dao;

import com.ueuo.gabrieltavares.main.model.Pacote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacoteDAO {

    String descricao = "\tLorem ipsum ante phasellus libero ac ad luctus habitant massa adipiscing vulputate felis pulvinar, amet felis per euismod platea blandit nunc gravida lobortis sagittis turpis senectus pulvinar congue, ut proin curabitur est eleifend fermentum ut primis eu lacus ut per. erat varius tincidunt ac tempus fames curae nam sapien, pharetra praesent condimentum fames euismod praesent ultricies luctus amet, leo ultrices convallis tortor sem est mi. placerat congue phasellus magna fringilla porta in turpis elit, augue diam mi justo suscipit sem hac non magna, nam cursus posuere nunc taciti risus ultrices. ";

    public List<Pacote> lista() {
        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
                new Pacote("São Paulo", "sao_paulo_sp", 2, new BigDecimal(243.99), descricao),
                new Pacote("Belo Horizonte", "belo_horizonte_mg", 3, new BigDecimal(421.50), descricao),
                new Pacote("Recife", "recife_pe", 4, new BigDecimal(754.20), descricao),
                new Pacote("Rio de Janeiro", "rio_de_janeiro_rj", 6, new BigDecimal(532.55), descricao),
                new Pacote("Salvador", "salvador_ba", 5, new BigDecimal(899.99), descricao),
                new Pacote("Foz do Iguaçu", "foz_do_iguacu_pr", 1, new BigDecimal(289.90), descricao)));
        return pacotes;
    }

}
