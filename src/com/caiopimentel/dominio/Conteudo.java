package com.caiopimentel.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    public abstract double calcularXp();

    private String titulo;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrucao) {
        this.descricao = descrucao;
    }
}
