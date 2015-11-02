/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.corporacao.servlets;

import br.com.corporacao.DAO.Interfaces.FilmeDAOInterface;
import br.com.corporacao.DAOFactory.DAOFactory;
import br.com.corporacao.ENUM.NomeBanco;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ListarFilmes extends HttpServlet {
        private FilmeDAOInterface filmeDAO = DAOFactory.createFactory(NomeBanco.DAO_BD).criarFilmeDAO();

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setCharacterEncoding("UTF-8");
        HttpSession session  =  request.getSession();
       
        RequestDispatcher dispatcher = request.getRequestDispatcher("/listarFilmes.jsp");
        List listaFilme = new ArrayList();
        listaFilme = filmeDAO.todosFilmes();
        session.setAttribute("listaFilmes", listaFilme);
  
        dispatcher.forward(request, response);

    }
}
