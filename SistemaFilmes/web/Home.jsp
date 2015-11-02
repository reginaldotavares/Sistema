<%-- 
    Document   : Home
    Created on : 29/10/2015, 14:07:42
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>SistemaFilmes</title>     
        <meta charset="UTF-8">
        <meta name="description" content="SistemaFilmes! A nossa rede de filmes">
        <meta name="author" content="Welllington Lins">
        <link rel="icon" href="images/video.ico" type="image/x-icon">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/bootstrap-responsive.css"/>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <nav class="navbar navbar-inverse" role="navigation"> 	
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#acolapsar">
                    <span class="sr-only">Toggle Navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="index.html" class="navbar-brand"><span ><img  height="35" src="images/film1.svg" alt="" /></span></a>
            </div>

            <div class="collapse navbar-collapse" id="acolapsar">
                <ul class="nav navbar-nav">
                    <li><a href="Logout">Logout</a></li> 
                    <li><a href="ParametersDelete.html">Deletar</a></li>
                    <li><a href="updateUsuario.jsp">Update</a></li>     
                    <li><a href="CadastrarFilme.html">Cadastrar Filme</a></li>
                    <li><a href="ListarFilmes">Listar Filme</a></li>

                </ul>
            </div>
        </nav>
        <h1>Você esta loogado</h1>
        <UL>
            <LI><B>First Name:</B> ${usuario.nomeCompleto}
            <LI><B>Apelido</B> ${usuario.apelido}
            <LI><B>Email:</B> ${usuario.email}
            <LI><B>Senha:</B> ${usuario.senha}
            <LI><B>Sexo:</B> ${usuario.sexo}
        </UL>
        <script  src="js/jquery.js"></script>
        <script  src="js/bootstrap.min.js"></script>
    </body>
</html>
