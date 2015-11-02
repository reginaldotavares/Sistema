package br.com.corporacao.DAO.Interfaces;

import br.com.corporacao.beans.UsuarioBean;
import java.util.List;

public interface UsuarioDAOInterface {

    public void adicionarUsuario(UsuarioBean us);

    public void deletarUsuario(String email);

    public void updateUsuario(UsuarioBean us);

    public List<UsuarioBean> todosUsuarios();
    
    public UsuarioBean selecionarPorEmail(String email);

}
