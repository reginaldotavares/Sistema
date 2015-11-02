<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:import url="cabecalho.jsp"/>

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

                        <tr>
                            <td><c:out value="${filme.id}" /></td>
                            <td><c:out value="${filme.titulo}"/></td>                         
                            <td><c:out value="${filme.ano}" /></td>
                            <td><c:out value="${filme.sinopse}" /></td> 
                            <td><c:out value="${filme.foto}" /></td>
                            <td><c:out value="${filme.generos}" /></td> 
                            <td><c:out value="${filme.atores}" /></td>  
                            <td><c:out value="${filme.diretores}" /></td>
                        </tr>               

                    </tbody>
                </table>

                    <article>
                        <a href="Home.jsp">Voltar</a>
                    </article>
                
<c:import url="rodape.jsp"/>
                <!--id ,titulo,ano , sinopse ,foto ,generos,atores, diretores-->
