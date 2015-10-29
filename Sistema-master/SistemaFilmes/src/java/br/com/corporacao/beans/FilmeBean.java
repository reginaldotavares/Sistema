package br.com.corporacao.beans;

import java.util.Collections;
import java.util.List;

public class FilmeBean {
    private String titulo;
    private String sinopse  ;
    private String ano; 
    private String foto;
    private List<GeneroBean> listaGenero;
    private List<AtorPrincipalBean> listaAtorPricipal;
    private List<DiretorBean> listaDiretor;

    public FilmeBean() {
        
    }

    public FilmeBean(String titulo, String sinopse, String ano, String foto, String genero, List<GeneroBean> listaGenero, List<AtorPrincipalBean> listaAtorPricipal, List<DiretorBean> listaDiretor) {
   
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.ano = ano;
        this.foto = foto;
        this.listaAtorPricipal = listaAtorPricipal;
        this.listaDiretor = listaDiretor;
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

    public String getFoto() {
        return foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public List<GeneroBean> getListaGenero() {
        return Collections.unmodifiableList(listaGenero);
    }

    public void setListaGenero(List<GeneroBean> listaGenero) {
        this.listaGenero = listaGenero;
    }

    
    public List<AtorPrincipalBean> getListaAtorPricipal() {
        return Collections.unmodifiableList(listaAtorPricipal);
    }

    public void setListaAtorPricipal(List<AtorPrincipalBean> listaAtorPricipal) {
        this.listaAtorPricipal = listaAtorPricipal;
    }

    public List<DiretorBean> getListaDiretor() {
        return Collections.unmodifiableList(listaDiretor);
    }

    public void setListaDiretor(List<DiretorBean> listaDiretor) {
        this.listaDiretor = listaDiretor;
    }
   
}