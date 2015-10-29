/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.DAO.Interfaces;

import br.com.corporacao.beans.FilmeBean;
import java.util.List;

/**
 *
 * @author Reginaldo
 */
public interface FilmeDAOInterface {
    
    public void adicionarFilme(FilmeBean f);

    public void deletarFilme(String nome);

    public void updateFilme(FilmeBean f);

    public List<FilmeBean> todosFilmes();
    
    public FilmeBean selecionarPorTitulo(String titulo);
}
