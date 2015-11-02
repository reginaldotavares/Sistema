/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.servlets;

import br.com.corporacao.DAO.Interfaces.FilmeDAOInterface;
import br.com.corporacao.DAO.Interfaces.UsuarioDAOInterface;
import br.com.corporacao.DAOFactory.DAOFactory;
import br.com.corporacao.ENUM.NomeBanco;
import br.com.corporacao.beans.FilmeBean;
import br.com.corporacao.beans.UsuarioBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EncontrarFilme extends HttpServlet {

    private FilmeDAOInterface filmeDAO = DAOFactory.createFactory(NomeBanco.DAO_BD).criarFilmeDAO();

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String titulo = request.getParameter("titulo");

        FilmeBean filme = new FilmeBean();

        filme = filmeDAO.selecionarPorTitulo(titulo);
        request.setAttribute("filme", filme);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("ResultadoBuscaFilme.jsp");

        dispatcher.forward(request, response);

    }
}
