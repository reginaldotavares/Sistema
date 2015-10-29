/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.DAO;

/**
 *
 * @author Reginaldo
 */

import br.com.corporacao.DAO.Interfaces.AtorPrincipalDAOInterface;
import br.com.corporacao.beans.AtorPrincipalBean;
import br.com.corporacao.beans.UsuarioBean;
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
 * @author Norma
 */
public class AtorPrincipalDAO implements AtorPrincipalDAOInterface{
    private Connection connection;

    public AtorPrincipalDAO() {
        connection = DbUtil.getConnection();
    }

    public void adicionarAtor(AtorPrincipalBean ap) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into nome_atores (nomeator) values (?)");

            preparedStatement.setObject(1, ap.getNomeAtor());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarAtor(String nome) {
        try {

            PreparedStatement preparedStatement = connection.prepareStatement("delete from nome_atores where nomeator=?");

            preparedStatement.setString(1, nome);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateAtor(AtorPrincipalBean ap) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update nome_atores set codigofilme = ?, nomeator = ? where codigofilme = ?");

            preparedStatement.setString(1, ap.getNomeAtor());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<AtorPrincipalBean> todosAtores() {
        List<AtorPrincipalBean> atorBean = new ArrayList<AtorPrincipalBean>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from  nome_atores");
            while (rs.next()) {

                AtorPrincipalBean ap = new AtorPrincipalBean();
                ap.setNomeAtor(rs.getString("nomeator"));
               
                atorBean.add(ap);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return atorBean;
    }

    
}
