<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>SistemaFilmes</title>     

        <meta name="description" content="SistemaFilmes! A nossa rede de filmes">
        <meta name="author" content="Welllington Lins">
        <link rel="icon" href="images/video.ico" type="image/x-icon">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>            
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
  
        <link href="css/bootstrap.min.css" rel="stylesheet">
     
        <link href="css/style2.css" rel="stylesheet" type="text/css"/>        
        <script src ="js/jQuery.min.js" type="text/javascript"></script>
        <script src="js/maskedinput.min.js" type="text/javascript"></script>
   
    </head>
    <body>   

        <div id="allContent">
            <a href="#"><img src="userImages/"></a>
            <button type="button" class="editar btn btn-primary" data-toggle="modal" data-target="#updateImage" >Altere sua foto</button>
            <div id="pageSection">
                <div class="header">
                    <h3>Informações basicas</h3>
                </div>
                <div class="content">               
                    <div class="personData"><h4>Nome completo</h4><span></span>
                        <a href="#form" data-toggle="modal" data-target="#updateName" >Editar</a>                        
                    </div><hr>
                    <div class="personData"><h4>Data de nascimento</h4><span><%=%></span>
                        <a href="#" data-toggle="modal" data-target="#updateData">Editar</a>
                    </div><hr>
                    <div class="personData"><h4>Apelido</h4><span></span>
                        <a href="#" data-toggle="modal" data-target="#updateApelido">Editar</a>
                    </div><hr>
                    <div class="personData"><h4>Cidade</h4><span></span>
                        <a href="#" data-toggle="modal" data-target="#updateCidade">Editar</a>
                    </div><hr>
                    <div class="personData"><h4>Status</h4><span></span><a href="#" data-toggle="modal" data-target="#updateStatus">Editar</a></div>
                </div>
            </div>

            <div id="pageSection">
                <div class="header">
                    <h3>Informações sobre a conta</h3>
                </div>
                <div class="content">
                    <div class="personData"><h4>Email</h4><span></span>
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

            <div class="modal fade" id="updateApelido" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar apelido</h4>
                        </div>
                        <div class="modal-body">
                            <form action="">
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

            <div class="modal fade" id="updateCidade" tabindex="-1" role="dialog" aria-labelledby="form" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Atualizar cidade</h4>
                        </div>
                        <div class="modal-body">
                            <form action="">
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
