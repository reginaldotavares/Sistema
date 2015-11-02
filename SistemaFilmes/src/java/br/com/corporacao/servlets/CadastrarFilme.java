package br.com.corporacao.servlets;

import br.com.corporacao.DAO.Interfaces.FilmeDAOInterface;
import br.com.corporacao.DAOFactory.DAOFactory;
import br.com.corporacao.ENUM.NomeBanco;
import br.com.corporacao.beans.FilmeBean;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CadastrarFilme extends HttpServlet {

  private FilmeDAOInterface filmeDAO = DAOFactory.createFactory(NomeBanco.DAO_BD).criarFilmeDAO();

    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
       // id ,titulo,ano , sinopse ,foto ,generos,atores, diretores
        String titulo= request.getParameter("titulo");
        String ano = request.getParameter("ano");
        String sinopse = request.getParameter("sinopse");
        String foto = request.getParameter("foto");
        String generos = request.getParameter("generos");
        String atores = request.getParameter("atores");
        String diretores = request.getParameter("diretores");



        FilmeBean filme = new FilmeBean( foto,titulo, sinopse,ano,generos, atores, diretores);

        filmeDAO.adicionarFilme(filme);
        request.setAttribute("filme", filme);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("Home.jsp");

        dispatcher.forward(request, response);

    }
}


   