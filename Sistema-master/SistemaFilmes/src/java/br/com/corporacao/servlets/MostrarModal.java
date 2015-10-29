/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class MostrarModal extends HttpServlet {

    private UsuarioDAOInterface usuarioDAO = DAOFactory.createFactory(NomeBanco.DAO_BD).criarUsuarioDAO();

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");

        UsuarioBean usuario = new UsuarioBean();

        usuario = usuarioDAO.selecionarPorEmail(email);
        request.setAttribute("usuario", usuario);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("Modal.jsp");

        dispatcher.forward(request, response);

    }
}
