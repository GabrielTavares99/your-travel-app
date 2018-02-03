package com.ueuo.gabrieltavares.main.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pacote implements Serializable{

    private final String local;
    private final String imagem;
    private final int dias;
    private final BigDecimal preco;
    private String descrição;

    public Pacote(String local, String imagem, int dias, BigDecimal preco, String descricao) {
        this.local = local;
        this.imagem = imagem;
        this.dias = dias;
        this.preco = preco;
        this.descrição = descricao;
    }

    public String getLocal() {
        return local;
    }

    public String getImagem() {
        return imagem;
    }

    public int getDias() {
        return dias;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}