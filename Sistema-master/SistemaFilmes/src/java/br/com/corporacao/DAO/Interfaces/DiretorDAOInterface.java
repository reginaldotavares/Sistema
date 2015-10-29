/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.DAO.Interfaces;

import br.com.corporacao.beans.AtorPrincipalBean;
import br.com.corporacao.beans.DiretorBean;
import java.util.List;

/**
 *
 * @author Reginaldo
 */
public interface DiretorDAOInterface {
    
    public void adicionarDiretor(DiretorBean ap);

    public void deletarDiretor(String nome);

    public void updateDiretor(DiretorBean ap);

    public List<DiretorBean> todosDiretores();
    
}


