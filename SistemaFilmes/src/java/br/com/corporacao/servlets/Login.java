/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.servlets;

import br.com.corporacao.DAO.Interfaces.UsuarioDAOInterface;
import br.com.corporacao.DAO.UsuarioDAO;
import br.com.corporacao.DAOFactory.DAOFactory;
import br.com.corporacao.ENUM.NomeBanco;
import br.com.corporacao.beans.UsuarioBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Reginaldo
 */
public class Login extends HttpServlet {

    private UsuarioDAOInterface usuarioDAO = DAOFactory.createFactory(NomeBanco.DAO_BD).criarUsuarioDAO();

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");
        String senha = request.getParameter("password");
        UsuarioBean usuario = new UsuarioBean();
        usuario = usuarioDAO.selecionarPorEmail(email);
        RequestDispatcher dispatcher = null;
           if (usuario==null){
               request.setAttribute("mensagem", "usuario/Senha inválido");
                dispatcher = request.getRequestDispatcher("/login.jsp");
                dispatcher.forward(request, response);
           }else if((usuario.getEmail().equals(email)) && (usuario.getSenha().equals(senha))) {

            HttpSession session  =  request.getSession();
            session.setAttribute("sessaoUsuario",usuario.getNomeCompleto() );
            dispatcher = request.getRequestDispatcher("/index.jsp");

            dispatcher.forward(request, response);
            }else{
                request.setAttribute("mensagem", "usuario/Senha inválido");
                dispatcher = request.getRequestDispatcher("/login.jsp");
                dispatcher.forward(request, response);
                
            }
        
    }

    
}
