/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.beans;
import java.sql.ResultSet;


public class AtorPrincipalBean {
    private String nomeAtor;

    public AtorPrincipalBean() {
    }

    public AtorPrincipalBean(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

}
