package com.ueuo.gabrieltavares.main.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public static final String PT = "pt";
    public static final String BR = "br";
    public static final String R$ = "R$";
    public static final String R$_COM_ESPACO = "R$ ";

    public static String getPrecoFormatadoEmReal(BigDecimal valor){
        NumberFormat formatoBrasileiroMoeda = DecimalFormat.getCurrencyInstance(new Locale(PT, BR));
        return formatoBrasileiroMoeda.format(valor).replace(R$, R$_COM_ESPACO);
    }

}
