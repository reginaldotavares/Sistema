/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.DAO;

import br.com.corporacao.DAO.Interfaces.DiretorDAOInterface;
import br.com.corporacao.beans.AtorPrincipalBean;
import br.com.corporacao.beans.DiretorBean;
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
public class DiretorDAO implements DiretorDAOInterface {
    private Connection connection;

    public DiretorDAO() {
        connection = DbUtil.getConnection();
    }

    public void adicionarDiretor(DiretorBean d) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into nome_diretores (nomediretor) values (?)");

            preparedStatement.setObject(1, d.getNomeDiretor());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarDiretor(String nome) {
        try {

            PreparedStatement preparedStatement = connection.prepareStatement("delete from nome_diretores where nomediretor=?");

            preparedStatement.setString(1, nome);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateDiretor(DiretorBean d) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update nome_diretores set codigofilme = ?, nomediretor = ? where codigofilme = ?");

            preparedStatement.setString(1, d.getNomeDiretor());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<DiretorBean> todosDiretores() {
        List<DiretorBean> diretorBean = new ArrayList<DiretorBean>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from  nome_diretores");
            while (rs.next()) {

                DiretorBean d = new DiretorBean();
                d.setNomeDiretor(rs.getString("nomediretor"));
               
                diretorBean.add(d);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return diretorBean;
    }

    
}
