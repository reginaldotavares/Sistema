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
import javax.servlet.http.HttpSession;

public class UpdateUsuario extends HttpServlet {

    private UsuarioDAOInterface usuarioBeanDAO = DAOFactory.createFactory(NomeBanco.DAO_BD).criarUsuarioDAO();

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setCharacterEncoding("UTF-8");
        UsuarioBean usuario = new UsuarioBean();
        
        usuario.setEmail(request.getParameter("email"));
        usuario.setNomeCompleto(request.getParameter("nomeCompleto"));
        usuario.setImagem(request.getParameter("imagem"));
        usuario.setSenha(request.getParameter("senha"));
        usuario.setTipo(request.getParameter("tipo"));
        usuario.setCidade(request.getParameter("cidade"));
        usuario.setEstado(request.getParameter("estado"));
        usuario.setApelido(request.getParameter("apelido"));
        usuario.setDataNascimento(request.getParameter("dataNascimento"));
        usuario.setSexo(request.getParameter("sexo"));

   
        usuarioBeanDAO.updateUsuario(usuario);

        RequestDispatcher dispatcher = request.getRequestDispatcher("ListarUsuarios");

        dispatcher.forward(request, response);

    }
}
