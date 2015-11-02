package br.com.corporacao.DAOFactory;


import br.com.corporacao.DAO.FilmeDAO;
import br.com.corporacao.DAO.UsuarioDAO;

public class DAOFactoryBD implements DAOFactoryIF{
    
    
     public  UsuarioDAO criarUsuarioDAO(){
         return new UsuarioDAO();
     }
     
      public  FilmeDAO criarFilmeDAO(){
         return new FilmeDAO();
     }
}