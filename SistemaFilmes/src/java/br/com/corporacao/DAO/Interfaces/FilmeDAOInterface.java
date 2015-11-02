package br.com.corporacao.DAO.Interfaces;

import br.com.corporacao.beans.FilmeBean;
import java.util.List;

public interface FilmeDAOInterface {
    
    public void adicionarFilme(FilmeBean filme);

    public void deletarFilme(int id);

    public void updateFilme(FilmeBean us);

    public List<FilmeBean> todosFilmes();
    
    public FilmeBean selecionarPorTitulo(String titulo);

}
