package br.com.corporacao.DAO;

import br.com.corporacao.conexao.DbUtil;
import br.com.corporacao.DAO.Interfaces.UsuarioDAOInterface;
import br.com.corporacao.beans.UsuarioBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements UsuarioDAOInterface {

    private Connection connection;

    public UsuarioDAO() {
        connection = DbUtil.getConnection();
    }

    public void adicionarUsuario(UsuarioBean us) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into usuario (email , foto ,senha ,tipo, cidade ,estado, nomecompleto ,apelido, datanascimento, sexo) values (?,?,?,?,?,?,?,?,?,?)");

            preparedStatement.setObject(1, us.getEmail());
            preparedStatement.setObject(2, us.getImagem());
            preparedStatement.setObject(3, us.getSenha());
            preparedStatement.setObject(4, us.getTipo());
            preparedStatement.setObject(5, us.getCidade());
            preparedStatement.setObject(6, us.getEstado());
            preparedStatement.setObject(7, us.getNomeCompleto());
            preparedStatement.setObject(8, us.getApelido());
            preparedStatement.setObject(9, us.getDataNascimento());
            preparedStatement.setObject(10, us.getSexo());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarUsuario(String email) {
        try {

            PreparedStatement preparedStatement = connection.prepareStatement("delete from usuario where email=?");

            preparedStatement.setString(1, email);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUsuario(UsuarioBean us) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update usurario set foto=? senha=?  tipo=?  cidade=?  estado=?  nomecompleto=?  apelido=? datanascimento=?  sexo=?"
                            + "where email=?");

            preparedStatement.setString(1, us.getImagem());
            preparedStatement.setString(2, us.getSenha());
            preparedStatement.setString(3, us.getTipo());
            preparedStatement.setString(4, us.getCidade());
            preparedStatement.setString(5, us.getEstado());
            preparedStatement.setString(6, us.getNomeCompleto());
            preparedStatement.setString(7, us.getApelido());
            preparedStatement.setString(8, us.getDataNascimento());
            preparedStatement.setString(9, us.getSexo());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<UsuarioBean> todosUsuarios() {
        List<UsuarioBean> usuarioBean = new ArrayList<UsuarioBean>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from  usuario");
            while (rs.next()) {

                UsuarioBean us = new UsuarioBean();
                us.setEmail(rs.getString(1));
                us.setImagem(rs.getString(2));
                us.setSenha(rs.getString(3));
                us.setTipo(rs.getString(4));
                us.setCidade(rs.getString(5));
                us.setEstado(rs.getString(6));
                us.setNomeCompleto(rs.getString(7));
                us.setApelido(rs.getString(8));
                us.setDataNascimento(rs.getString(9));
                us.setSexo(rs.getString(10));
                usuarioBean.add(us);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarioBean;
    }

    public UsuarioBean selecionarPorEmail(String email) {
        UsuarioBean user = new UsuarioBean();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from usuario where email=?");
            preparedStatement.setString(1, email);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setEmail(rs.getString("email"));
                user.setImagem(rs.getString("foto"));
                user.setSenha(rs.getString("senha"));
                user.setTipo(rs.getString("tipo"));
                user.setCidade(rs.getString("cidade"));

                user.setEstado(rs.getString("estado"));
                user.setNomeCompleto(rs.getString("nomeCompleto"));
                user.setApelido(rs.getString("apelido"));
                user.setDataNascimento(rs.getString("dataNascimento"));
                user.setSexo(rs.getString("sexo"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}



//  email foto senha  tipo  cidade  estado  nomecompleto  apelido datanascimento  sexo
