/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.DAO;

import br.com.corporacao.DAO.Interfaces.FilmeDAOInterface;
import br.com.corporacao.beans.DiretorBean;
import br.com.corporacao.beans.FilmeBean;
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
public class FilmeDAO implements FilmeDAOInterface{
    private Connection connection;

    public FilmeDAO() {
        connection = DbUtil.getConnection();
    }

    public void adicionarFilme(FilmeBean f) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into filme(titulo, ano, sinopse, foto) values(?, ?, ?, ?)");

            preparedStatement.setObject(1, f.getTitulo());
            preparedStatement.setObject(2, f.getAno());
            preparedStatement.setObject(3, f.getSinopse());
            preparedStatement.setObject(1, f.getFoto());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarFilme(String nome) {
        try {

            PreparedStatement preparedStatement = connection.prepareStatement("delete from filme where titulo=?");

            preparedStatement.setString(1, nome);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateFilme(FilmeBean f) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update filme set titulo = ?, ano = ?, sinopse = ?, foto = ? where titulo = ?");

            preparedStatement.setString(1, f.getAno());
            preparedStatement.setString(2, f.getSinopse());
            preparedStatement.setString(3, f.getFoto());
            preparedStatement.setString(4, f.getTitulo());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<FilmeBean> todosFilmes() {
        List<FilmeBean> filmeBean = new ArrayList<FilmeBean>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from  filme");
            while (rs.next()) {

                FilmeBean f = new FilmeBean();
                f.setTitulo(rs.getString("titulo"));
                f.setAno(rs.getString("ano"));
                f.setSinopse(rs.getString("sinopse"));
                f.setFoto(rs.getString("foto"));
               
                filmeBean.add(f);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return filmeBean;
    }
    
    public FilmeBean selecionarPorTitulo(String titulo) {
        FilmeBean filme = new FilmeBean();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from filme where titulo=?");
            preparedStatement.setString(1, titulo);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                filme.setTitulo(rs.getString("titulo"));
                filme.setAno(rs.getString("ano"));
                filme.setSinopse(rs.getString("sinopse"));
                filme.setFoto(rs.getString("foto"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filme;
    }

    
}
