<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Biblioteca - Lista de Livros</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- CSS customizado se necessário -->
    <link rel="stylesheet" type="text/css" href="<s:url value='/css/style.css'/>" />
</head>
<body>
    <!-- Barra de navegação -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Sistema de Biblioteca</a>
    </nav>
    
    <div class="container mt-4">
        <h2 class="mb-4">Livros Disponíveis</h2>
        
        <!-- Mensagens de sucesso ou erro -->
        <s:if test="actionMessages.size() > 0">
            <div class="alert alert-success" role="alert">
                <s:actionmessage/>
            </div>
        </s:if>
        <s:if test="actionErrors.size() > 0">
            <div class="alert alert-danger" role="alert">
                <s:actionerror/>
            </div>
        </s:if>
        
        <table class="table table-striped table-hover">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Título</th>
                    <th>Imagem</th>
                    <th>Status</th>
                    <th>Ação</th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="books">
                    <tr>
                        <td><s:property value="id"/></td>
                        <td><s:property value="title"/></td>
                        <td>
                            <s:url var="imgUrl" value="/image.action">
                                <s:param name="image" value="%{image}"/>
                            </s:url>
                            <img src="<s:property value="#imgUrl"/>" alt="Imagem do Livro" class="img-thumbnail" width="100"/>
                        </td>
                        <td>
                            <s:if test="available">
                                <span class="badge badge-success">Disponível</span>
                            </s:if>
                            <s:else>
                                <span class="badge badge-danger">Emprestado</span>
                            </s:else>
                        </td>
                        <td>
                            <s:if test="available">
                                <s:url var="borrowUrl" action="borrowBook">
                                    <s:param name="bookId" value="%{id}"/>
                                </s:url>
                                <a class="btn btn-primary btn-sm" href="<s:property value="#borrowUrl"/>">Emprestar</a>
                            </s:if>
                            <s:else>
                                <s:url var="returnUrl" action="returnBook">
                                    <s:param name="bookId" value="%{id}"/>
                                </s:url>
                                <a class="btn btn-warning btn-sm" href="<s:property value="#returnUrl"/>">Devolver</a>
                            </s:else>
                        </td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
    </div>
    
    <!-- Scripts do Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
