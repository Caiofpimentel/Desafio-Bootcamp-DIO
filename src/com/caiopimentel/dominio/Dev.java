package com.caiopimentel.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConsluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){}

    public void progredir(){}

    public void calcularTotalXp(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<Conteudo> getConteudosConsluidos() {
        return conteudosConsluidos;
    }

    public void setConteudosConsluidos(Set<Conteudo> conteudosConsluidos) {
        this.conteudosConsluidos = conteudosConsluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncritos, dev.conteudosIncritos) && Objects.equals(conteudosConsluidos, dev.conteudosConsluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncritos, conteudosConsluidos);
    }
}
