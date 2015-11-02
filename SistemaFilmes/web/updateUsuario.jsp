<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        
        
         <title>SistemaFilmes</title>     

        <meta name="description" content="SisMovies! A nossa rede de filmes">
        <meta name="author" content="Welllington Lins">
        <meta charset="UTF-8">
        <link rel="icon" href="images/video.ico" type="image/x-icon">
        
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">

        <link rel="stylesheet" href="css/style.css">
       	<link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/bootstrap-responsive.css"/>
        <title>Add new user</title>
    </head>
    <body>
        <div class="container">
            <div class="offset3 span6 offset3 tentando">
                <form class="form-signin" role="form" method="POST" action='UpdateUsuario'>
                    <h2 class="form-signin-heading">Insira seus dados</h2>

                    Email: <input type="email" id="email"  class="form-control" placeholder="email" readonly  name="email" ;
                               value="<c:out value="${usuario.email}" />" /> <br /> 

                    Nome completo :    <input type="text" id="nomeCompleto" name="nomeCompleto" class="form-control" placeholder="Nome completo" required autofocus
                                           value="<c:out value="${usuario.nomeCompleto}" />" /> <br /> 

                    Apelido : <input type="text" id="apelido" name="apelido" class="form-control" placeholder="Apelido" required
                                   value="<c:out value="${usuario.apelido}" />" /> <br />

                    Senha : <input type="password" id="senha" name="senha" class="form-control" placeholder="Senha" required
                                   value="<c:out value="${usuario.senha}" />" /> <br />
                    
                    Tipo : <input type="text" id="tipo" name="tipo" class="form-control" placeholder="Tipo" required
                                   value="<c:out value="${usuario.tipo}" />" /> <br />
                    
                    Cidade : <input type="text" id="cidade" name="cidade" class="form-control" placeholder="Cidade" required
                                   value="<c:out value="${usuario.cidade}" />" /> <br />
                    
                    Estado : <input type="text" id="estado" name="estado" class="form-control" placeholder="Estado" required
                                   value="<c:out value="${usuario.estado}" />" /> <br /> 
                    
                    Data de Nascimento : <input type="text" id="dataNascimento" name="dataNascimento" class="form-control" placeholder="Data de Nascimento" required
                                   value="<c:out value="${usuario.dataNascimento}" />" /> <br />
                    
                    Sexo : <input type="text" id="sexo" name="sexo" class="form-control" placeholder="sexo" required
                                   value="<c:out value="${usuario.sexo}" />" /> <br />
                    
                    
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Enviar</button>
                </form>
            </div>
        </div>
    </body>
</html>