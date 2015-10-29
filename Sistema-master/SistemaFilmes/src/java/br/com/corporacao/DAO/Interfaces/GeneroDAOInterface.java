/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.DAO.Interfaces;

import br.com.corporacao.beans.GeneroBean;
import java.util.List;

/**
 *
 * @author Reginaldo
 */
public interface GeneroDAOInterface {
   
    public void adicionarGenero(GeneroBean g);

    public void deletarGenero(String nome);

    public void updateGenero(GeneroBean g);

    public List<GeneroBean> todosGeneros();
}
