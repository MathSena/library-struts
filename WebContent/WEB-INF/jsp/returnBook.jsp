<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Devolver Livro</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<s:url value='/css/style.css'/>" />
</head>
<body>
    <!-- Barra de navegação -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Sistema de Biblioteca</a>
    </nav>
    
    <div class="container mt-4">
        <h2 class="mb-4">Devolver Livro</h2>
        
        <!-- Mensagens de sucesso ou erro -->
        <s:if test="hasActionMessages()">
            <div class="alert alert-success" role="alert">
                <s:actionmessage/>
            </div>
        </s:if>
        <s:if test="hasActionErrors()">
            <div class="alert alert-danger" role="alert">
                <s:actionerror/>
            </div>
        </s:if>
        
        <!-- Card do livro -->
        <div class="card mb-4">
            <div class="row no-gutters">
                <div class="col-md-4">
                    <s:url var="imgUrl" value="/image.action">
                        <s:param name="image" value="%{book.image}" />
                    </s:url>
                    <img src="<s:property value="#imgUrl"/>" class="card-img" alt="Capa do Livro">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title"><s:property value="book.title"/></h5>
                        <p class="card-text">ID: <s:property value="book.id"/></p>
                        <p class="card-text">
                            Status: 
                            <s:if test="book.available">
                                <span class="badge badge-success">Disponível</span>
                            </s:if>
                            <s:else>
                                <span class="badge badge-danger">Emprestado</span>
                            </s:else>
                        </p>
                        <a href="<s:url action='listBooks'/>" class="btn btn-secondary">Voltar para a lista</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Scripts do Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
