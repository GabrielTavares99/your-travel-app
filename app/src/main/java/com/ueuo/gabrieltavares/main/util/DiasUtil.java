package com.ueuo.gabrieltavares.main.util;

public class DiasUtil {

    public static final String DIAS = " dias";
    public static final String DIA = " dia";

    public static String getQuantidadeDiasEmTexto(int quantidadeDias){
        if (quantidadeDias > 1) {
            return quantidadeDias + DIAS;
        }
        return quantidadeDias + DIA;
    }
}
