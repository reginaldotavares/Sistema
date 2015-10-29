/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.DAO;

import br.com.corporacao.DAO.Interfaces.GeneroDAOInterface;
import br.com.corporacao.beans.DiretorBean;
import br.com.corporacao.beans.GeneroBean;
import br.com.corporacao.conexao.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Reginaldo
 */
public class GeneroDAO implements GeneroDAOInterface{
    private Connection connection;

    public GeneroDAO() {
        connection = DbUtil.getConnection();
    }

    public void adicionarGenero(GeneroBean g) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into generos (nome) values (?)");

            preparedStatement.setObject(1, g.getNomeGenero());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarGenero(String nome) {
        try {

            PreparedStatement preparedStatement = connection.prepareStatement("delete from generos where nome=?");

            preparedStatement.setString(1, nome);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateGenero(GeneroBean g) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update generos set nome = ?");

            preparedStatement.setString(1, g.getNomeGenero());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<GeneroBean> todosGeneros() {
        List<GeneroBean> generoBean = new ArrayList<GeneroBean>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from generos");
            while (rs.next()) {

                GeneroBean g = new GeneroBean();
                g.setNomeGenero(rs.getString("nome"));
               
                generoBean.add(g);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return generoBean;
    }

    
}
