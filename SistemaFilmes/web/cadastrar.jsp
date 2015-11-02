<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho.jsp"/>

<body class="templatemo-bg-image-2">
        <div class="container">
        <div class="col-md-12">	
       <form class="form-horizontal templatemo-login-form-2" role="form" action="CadastrarUsuario" method="post">

                    <div class="row">
                        <div class="col-md-12">
                            <h1><strong>Cadastrar</strong></h1>
                        </div>
                    </div>
                    <div class="row">
                        <div class="templatemo-one-signin col-md-12">
                            <div class="form-group">
                                <div class="col-md-12">		          	
                                    <label for="username" class="control-label">Nome completo</label>
                                    <div class="templatemo-input-icon-container">
                                        <i class="fa fa-user"></i>
                                        <input name="nomeCompleto" type = "text"  class="form-control" id="nomeCompleto" placeholder = "nome completo" required>
                                    </div>		            		            		            
                                </div>              
                            </div>
                            <div class="form-group">
                                <div class="col-md-6">		          	
                                    <label for="username" class="control-label">Apelido</label>
                                    <div class="templatemo-input-icon-container">
                                        <i class="fa fa-user"></i>
                                        <input name="apelido" type = "text"  class="form-control" id="apelido" placeholder = "apelido" required>
                                    </div>		            		            		            
                                </div> 
                                <div class="col-md-6">	


                                    <label for="password" class="control-label">Data Nascimento</label>
                                    <div class="templatemo-input-icon-container">
                                        <i class="fa fa-lock"></i>

                                        <input name="dataNascimento" type = "text" class = "form-control" id = "dataNascimento" placeholder = "Data de nascimento" pattern="\d{2}/\d{2}/\d{4}" required>
                                    </div>

                                </div>  
                            </div>


                            <div class="form-group">
                                <div class="col-md-6">
                                    <label for="username" class="control-label">E-mail</label>
                                    <div class="templatemo-input-icon-container">
                                        <i class="fa fa-user"></i>
                                        <input name="email" type = "email"  class="form-control" id="email" placeholder = "e-mail" required>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <label for="password" class="control-label">Senha</label>
                                    <div class="templatemo-input-icon-container">
                                        <i class="fa fa-lock"></i>

                                        <input name="password" type = "password" class = "form-control" id = "password" placeholder = "senha" required>
                                    </div>
                                </div>                      	
                            </div>
                            
                            <div class="form-group">
                                <div class="col-md-6">
                                    <label for="password" class="control-label">Estado</label>
                                    <div class="templatemo-input-icon-container">
                                        <i class="fa fa-lock"></i>

                                        <input name="estado" type = "text" class = "form-control" id = "estado" placeholder = "Estado"  required>
                                    </div>
                                </div>    
                                
                                <div class = "col-md-6">
                                    <label for="password" class="control-label">Cidade</label>
                                    <div class="templatemo-input-icon-container">
                                        <i class="fa fa-lock"></i>

                                        <input name="cidade" type = "text" class = "form-control" id = "cidade" placeholder = "Cidade" required>
                                    </div>
                                </div>
                            </div>
                       
                  

                    <div class="form-group">
                        <div class = "col-md-6">

                            <label  for = "sexo" class = "sexo">Sexo:</label><br>
                            <div class="templatemo-input-icon-container">
                                <i class="fa fa-lock"></i>
                                <input  class = "sexo" type = "radio" name = "sexo" value = "m" id = "m" checked><label for = "m" required> Maculino</label>
                                <input class = "sexo" type = "radio" name = "sexo" value = "f" id = "f" required><label for = "f">Feminino</label>
                            </div>
                        </div>
                    </div>
            </div>

            <div class="form-group">
                <div class="col-md-12">
                    <input type="submit" value="LOG IN" class="btn btn-warning">
                </div>
            </div>

        </div>

</form>		      		      
</div>				 	
</div>

<link rel="icon" href="images/video.ico" type="image/x-icon">

        <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet" type="text/css">
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
        <link href="css/templatemo_style.css" rel="stylesheet" type="text/css">
        <script src ="js/jQuery.min.js" type="text/javascript"></script>
        <script src="js/maskedinput.min.js" type="text/javascript"></script>
        <script>
            $(function ($) {
                $("#dataNascimento").mask("99/99/9999", {placeholder: "dd/mm/aaaa"});
            });
        </script>
        
        
    <c:import url="rodape.jsp"/>