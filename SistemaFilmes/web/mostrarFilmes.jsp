 <div class="row-fluid">
            <div class="offset3 span6 offset3 tentando">
                <table class="table  table-hover">

                    <thead>
                        <tr>                                    
                            <th>Titulo</th>
                            <th>Ano</th>
                            <th>Sinopse</th> 
                            <th>Foto</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listaFilmes}" var="filmes">
                            <tr>
                               
                                <td><c:out value="${filmes.titulo}"/></td>                         
                                <td><c:out value="${filmes.ano}" /></td>
                                <td><c:out value="${filmes.sinopse}" /></td> 
                                <td><c:out value="${filmes.foto}" /></td>
                          
                            </tr>               
                        </c:forEach>
                    </tbody>
                </table>

