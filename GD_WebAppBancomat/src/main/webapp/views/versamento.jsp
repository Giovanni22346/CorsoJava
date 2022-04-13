<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/color.css"/>
</head>
<body>
 <div align="center">
<div class="container">
  <h1>HOME BANCOMAT</h1>
  <h2>Neotech Bank</h2>
  <ul class="list-inline">
    <li><a href="#">Home</a></li>
    <li><a href="#">Prelevamento</a></li>
    <li><a href="#">Lista Movimenti</a></li>
  </ul>
</div>
 

<form:form id="form_submit" action="registrazione_dati" method="POST" modelAttribute="mapping_dati">
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1"></span>
 <label for= "nome">Versamento</label><br></h1>
  <form:input  id="nominativo" path="nominativo"  class="form-control" placeholder="Nominativo" aria-label="Nominativo" aria-describedby="basic-addon1"/>
 <label for= "nome">Importo</label><br></h3>
  <form:input  id="importo" path="importo"  class="form-control" placeholder="Importo" aria-label="Importo" aria-describedby="basic-addon1"/>
       <form:option value="10 Euro" label="10 Euro"/>
       <form:option value="20 Euro" label="20 Euro"/>
       <form:option value="50 Euro" label="50 Euro"/>  
   </form:select>
</div>
 <form:button type="submit" id="bth-search" class="btn btn-primary btn-lg">Invia</form:button>
</form:form> 
 
 
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
      <ul class="navbar-nav">
        <li class="nav-item dropdown">
         <h3> <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Taglio
          </a>
          <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
            <li><a class="dropdown-item" href="#">10 Euro</a></li>
            <li><a class="dropdown-item" href="#">20 Euro</a></li>
            <li><a class="dropdown-item" href="#">50 Euro</a></li>
          </ul>
        </li>
      </ul>
    </div></h3>
  </div>
</nav>
</body>
</html>