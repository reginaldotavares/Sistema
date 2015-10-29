package br.com.corporacao.DAOFactory;


import br.com.corporacao.DAO.UsuarioDAO;

public class DAOFactoryBD implements DAOFactoryIF{
    
    
     public  UsuarioDAO criarUsuarioDAO(){
         return new UsuarioDAO();
     }

}