package br.com.corporacao.servlets;

import br.com.corporacao.DAO.Interfaces.UsuarioDAOInterface;
import br.com.corporacao.DAOFactory.DAOFactory;
import br.com.corporacao.ENUM.NomeBanco;
import br.com.corporacao.beans.UsuarioBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class CadastrarUsuario extends HttpServlet {

    private UsuarioDAOInterface usuarioDAO = DAOFactory.createFactory(NomeBanco.DAO_BD).criarUsuarioDAO();

    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String nomeCompleto = request.getParameter("nomeCompleto");
        String apelido = request.getParameter("apelido");
        String email = request.getParameter("email");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String senha = request.getParameter("password");
        String tipo = request.getParameter("");
        String imagem = request.getParameter("");
        String sexo = request.getParameter("sexo");
        String dataNascimento = request.getParameter("dataNascimento");

        UsuarioBean usuario = new UsuarioBean(nomeCompleto, apelido, email, cidade, estado, senha, tipo, imagem, sexo, dataNascimento);

        usuarioDAO.adicionarUsuario(usuario);
        request.setAttribute("usuario", usuario);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("Home.jsp");

        dispatcher.forward(request, response);

    }
}
