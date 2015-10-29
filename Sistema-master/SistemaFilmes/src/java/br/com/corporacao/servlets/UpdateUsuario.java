package br.com.corporacao.servlets;

import br.com.corporacao.DAO.Interfaces.UsuarioDAOInterface;
import br.com.corporacao.DAOFactory.DAOFactory;
import br.com.corporacao.ENUM.NomeBanco;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateUsuario extends HttpServlet {

    private UsuarioDAOInterface usuarioBeanDAO = DAOFactory.createFactory(NomeBanco.DAO_BD).criarUsuarioDAO();

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");
       // usuarioBeanDAO.updateUsuario(email);

        RequestDispatcher dispatcher = request.getRequestDispatcher("ListarUsuarios");

        dispatcher.forward(request, response);

    }
}
