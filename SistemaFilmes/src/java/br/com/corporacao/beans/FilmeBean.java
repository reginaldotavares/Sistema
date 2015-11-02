package br.com.corporacao.beans;

import java.util.ArrayList;
import java.util.List;

public class FilmeBean {

    private int id;
    private String foto;
    private String titulo;
    private String sinopse;
    private String ano;
    private String generos;
    private String atores;
    private String diretores;

    public FilmeBean() {
    }

    public FilmeBean(String foto, String titulo, String sinopse, String ano, String generos, String atores, String diretores) {
        this.id = id;
        this.foto = foto;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.ano = ano;
        this.generos = generos;
        this.atores = atores;
        this.diretores = diretores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public String getDiretores() {
        return diretores;
    }

    public void setDiretores(String diretores) {
        this.diretores = diretores;
    }

  

}
