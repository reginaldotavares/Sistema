/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.DAO.Interfaces;

import br.com.corporacao.beans.AtorPrincipalBean;
import java.util.List;

/**
 *
 * @author Reginaldo
 */
public interface AtorPrincipalDAOInterface {
    
    public void adicionarAtor(AtorPrincipalBean ap);

    public void deletarAtor(String nome);

    public void updateAtor(AtorPrincipalBean ap);

    public List<AtorPrincipalBean> todosAtores();
    
}
