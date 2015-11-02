<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:import url="cabecalho.jsp"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="images/video.ico" type="image/x-icon">
       	<link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/bootstrap-responsive.css"/>
    </head>
    <body>
        <div class="quadro">
        <div class="row-fluid">
            <div class="offset3 span6 offset3 tentando">
                <table class="table  table-hover">

                    <thead>
                        <tr>
                            <th>Id</th>               
                            <th>Titulo</th>
                            <th>Ano</th>
                            <th>Sinopse</th> 
                            <th>Foto</th>
                            <th>Generos</th>
                            <th>Atores</th>
                            <th>Diretores</th>
                                                   
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listaFilmes}" var="filmes">
                            <tr>
                                <td><c:out value="${filmes.id}" /></td>
                                <td><c:out value="${filmes.titulo}"/></td>                         
                                <td><c:out value="${filmes.ano}" /></td>
                                <td><c:out value="${filmes.sinopse}" /></td> 
                                <td><c:out value="${filmes.foto}" /></td>
                                <td><c:out value="${filmes.generos}" /></td> 
                                <td><c:out value="${filmes.atores}" /></td>  
                                <td><c:out value="${filmes.diretores}" /></td>
                            </tr>               
                        </c:forEach>
                    </tbody>
                </table>

                    <article>
                        <a href="Home.jsp">Voltar</a>
                    </article>
                
            </div>          
<c:import url="rodape.jsp"/>
                             
<!--id ,titulo,ano , sinopse ,foto ,generos,atores, diretores-->
