<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="CSS/bootstrap.min.css"/>
        <link rel="icon" href="images/video.ico" type="image/x-icon">
        <script src="js/jQuery.min.js"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <link href="CSS/style2.css" rel="stylesheet" type="text/css"/> 
        <script src ="js/jQuery.min.js" type="text/javascript"></script>
        <script src="js/maskedinput.min.js" type="text/javascript"></script>
    </head>
    <body>

        <div id="allContent">
            <a href="#"><img src="userImages/${usuario.imagem}"></a>
            <button type="button" class="editar btn btn-primary" data-toggle="modal" data-target="#updateImage" >Altere sua foto</button>
            <div id="pageSection">
                <div class="header">
                    <h3>Informações da conta</h3>
                </div>
                <div class="content">               
                    <div class="personData"><h4>Nome completo</h4><span>${usuario.nomeCompleto}</span>
                        <a href="#form" data-toggle="modal" data-target="#updateName" >Editar</a>                        
                    </div><hr>
                    <div class="personData"><h4>Data de nascimento</h4><span>${usuario.dataNascimento}</span>
                        <a href="#" data-toggle="modal" data-target="#updateData">Editar</a>
                    </div><hr>
                    <div class="personData"><h4>Sexo</h4><span>${usuario.sexo}</span>
                        <a href="#" data-toggle="modal" data-target="#updateSexo">Editar</a>
                    </div><hr>
                    <div class="personData"><h4>Apelido</h4><span>${usuario.apelido}</span>
                        <a href="#" data-toggle="modal" data-target="#updateApelido">Editar</a>
                    </div><hr>
                    <div class="personData"><h4>Estado</h4><span>${usuario.estado}</span>
                        <a href="#" data-toggle="modal" data-target="#updateEstado">Editar</a>
                    </div><hr>
                     <div class="personData"><h4>Cidade</h4><span>${usuario.cidade}</span>
                        <a href="#" data-toggle="modal" data-target="#updateCidade">Editar</a>
                    </div><hr>
                    <div class="personData"><h4>Tipo</h4><span>${usuario.tipo}</span><a href="#" data-toggle="modal" data-target="#updateStatus">Editar</a></div>
                </div>
            </div>

            <div id="pageSection">
                <div class="header">
                    <h3>Informações de login</h3>
                </div>
                <div class="content">
                    <div class="personData"><h4>Email</h4><span>${usuario.email}</span>
                        <a href="#"  data-toggle="modal" data-target="#updateEmail">Editar</a>
                    </div><hr>
                    <div class="personData"><h4>Senha</h4><span>********</span>
                        <a href="#" data-toggle="modal" data-target="#updateSenha">Editar</a>
                    </div>
                </div>
            </div>
            <br><br><br>

            <div class="modal fade" id="updateImage" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar imagem de perfil</h4>
                        </div>
                        <div class="modal-body">
                            <form  action="" enctype="multipart/form-data" method="post">
                                <div class="form-group">
                                    <label for="file" class="control-label">Selecione uma imagem</label>
                                    <input type="file" class="form-control" id="file" accept="image/*" required name="file">
                                </div>   
                                <div class="form-group">                                  
                                    <input type="submit" class="btn btn-primary" value="Salvar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal fade" id="updateName" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar nome</h4>
                        </div>
                        <div class="modal-body">
                            <form action="" method="post">
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Nome completo</label>
                                    <input type="text" class="form-control" id="recipient-name" required name="name">                                     
                                </div>
                                <div class="form-group">                                  
                                    <input type="submit" class="btn btn-primary" value="Salvar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal fade" id="updateData" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar data de nascimento</h4>
                        </div>
                        <div class="modal-body">
                            <form action="" method="post">
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Data de nascimento</label>
                                    <input type="text" class="form-control" id = "dataNascimento" pattern="\d{2}/\d{2}/\d{4}" required name="dataNascimento">
                                </div>
                                <div class="form-group">                                  
                                    <input type="submit" class="btn btn-primary" value="Salvar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            
             <div class="modal fade" id="updateSexo" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Sexo</h4>
                        </div>
                        <div class="modal-body">
                            <form action="" method="post">
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Sexo</label>
                                    <input type="text" class="form-control" id="recipient-name" required name="sexo">
                                </div>
                                <div class="form-group">                                  
                                    <input type="submit" class="btn btn-primary" value="Salvar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal fade" id="updateApelido" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar apelido</h4>
                        </div>
                        <div class="modal-body">
                            <form action="" method="post">
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Apelido</label>
                                    <input type="text" class="form-control" id="recipient-name" required name="apelido">
                                </div>
                                <div class="form-group">                                  
                                    <input type="submit" class="btn btn-primary" value="Salvar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
                  <div class="modal fade" id="updateEstado" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar estado</h4>
                        </div>
                        <div class="modal-body">
                            <form action="" method="post">
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Estado</label>
                                    <input type="text" class="form-control" id="recipient-name" required name="estado">
                                </div>
                                <div class="form-group">                                  
                                    <input type="submit" class="btn btn-primary" value="Salvar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal fade" id="updateCidade" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar cidade</h4>
                        </div>
                        <div class="modal-body">
                            <form action="" method="post">
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Cidade</label>
                                    <input type="text" class="form-control" id="recipient-name" required name="cidade">
                                </div>
                                <div class="form-group">                                  
                                    <input type="submit" class="btn btn-primary" value="Salvar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal fade" id="updateStatus" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar status</h4>
                        </div>
                        <div class="modal-body">
                            <form action="" method="post">
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Novo status</label>
                                    <input type="text" class="form-control" id="recipient-name" required name="status">                                     
                                </div>
                                <div class="form-group">                                  
                                    <input type="submit" class="btn btn-primary" value="Salvar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal fade" id="updateEmail" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar email</h4>
                        </div>
                        <div class="modal-body">
                            <form action="" method="post">
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Email</label>
                                    <input type="email" class="form-control" id="recipient-name" required name="email">                                  
                                </div>
                                <div class="form-group">                                  
                                    <input type="submit" class="btn btn-primary" value="Salvar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal fade" id="updateSenha" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar senha</h4>
                        </div>
                        <div class="modal-body">
                            <form name ="mudarSenha" action="" method="post">
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Nova senha</label>
                                    <input type="password" class="form-control" id="recipient-name" required name="senha">                                    
                                </div>
                                <div class="form-group">                                  
                                    <input type="submit" class="btn btn-primary" value="Salvar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>


        </div>
    </body>
</html>
