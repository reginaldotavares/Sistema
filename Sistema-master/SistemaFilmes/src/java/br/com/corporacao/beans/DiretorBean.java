/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.beans;
import java.sql.ResultSet;


public class DiretorBean {
    private String nomeDiretor;

    public DiretorBean() {
    }

    public DiretorBean(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

}

