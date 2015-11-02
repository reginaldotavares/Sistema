package br.com.corporacao.DAO;

import br.com.corporacao.DAO.Interfaces.FilmeDAOInterface;
import br.com.corporacao.conexao.DbUtil;
import br.com.corporacao.beans.FilmeBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO implements FilmeDAOInterface {

    private Connection connection;

    public FilmeDAO() {
        connection = DbUtil.getConnection();
    }

    public void adicionarFilme(FilmeBean filme) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into filme (titulo,ano , sinopse ,foto ,generos,atores, diretores) values (?,?,?,?,?,?,?)");

            preparedStatement.setString(1, filme.getTitulo());
            preparedStatement.setString(2, filme.getAno());
            preparedStatement.setString(3, filme.getSinopse());
            preparedStatement.setString(4, filme.getFoto());
            preparedStatement.setString(5, filme.getGeneros());
            preparedStatement.setString(6, filme.getAtores());
            preparedStatement.setString(7, filme.getDiretores());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarFilme(int id) {
        try {

            PreparedStatement preparedStatement = connection.prepareStatement("delete from filme where id=?");

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateFilme(FilmeBean filme) {

        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update filme set titulo=?,ano=? , sinopse=? ,foto=? ,generos=?,atores=?, diretores=?"
                            + "where id=?");

            preparedStatement.setString(1, filme.getTitulo());
            preparedStatement.setString(2, filme.getAno());
            preparedStatement.setString(3, filme.getSinopse());
            preparedStatement.setString(4, filme.getFoto());
            preparedStatement.setString(5, filme.getGeneros());
            preparedStatement.setString(6, filme.getAtores());
            preparedStatement.setString(7, filme.getDiretores());

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

                FilmeBean filme = new FilmeBean();
                filme.setId(rs.getInt(1));
                filme.setTitulo(rs.getString(2));
                filme.setAno(rs.getString(3));
                filme.setSinopse(rs.getString(4));
                filme.setFoto(rs.getString(5));
                filme.setGeneros(rs.getString(6));
                filme.setAtores(rs.getString(7));
                filme.setDiretores(rs.getString(8));

                filmeBean.add(filme);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return filmeBean;
    }

  public FilmeBean selecionarPorTitulo(String titulo){
        FilmeBean filme = new FilmeBean();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from filme where  titulo=?");
            preparedStatement.setString(1, titulo);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                filme.setId(rs.getInt(1));
                filme.setTitulo(rs.getString(2));
                filme.setAno(rs.getString(3));
                filme.setSinopse(rs.getString(4));
                filme.setFoto(rs.getString(5));
                filme.setGeneros(rs.getString(6));
                filme.setAtores(rs.getString(7));
                filme.setDiretores(rs.getString(8));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filme;
    }
}

 // id ,titulo,ano , sinopse ,foto ,generos,atores, diretores
