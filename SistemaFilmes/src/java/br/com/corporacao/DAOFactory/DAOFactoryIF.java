package br.com.corporacao.DAOFactory;


import br.com.corporacao.DAO.FilmeDAO;
import br.com.corporacao.DAO.UsuarioDAO;


public interface DAOFactoryIF {   
    
      public  UsuarioDAO criarUsuarioDAO();
           
      public FilmeDAO  criarFilmeDAO();
}
