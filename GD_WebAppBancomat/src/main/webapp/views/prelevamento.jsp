<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  
    <link rel="stylesheet" type="text/css" href="static/css/color.css"/>
 <style>
  footer {
  background-color: #777;
  padding: 20px;
  text-align: center;
  color: white;
}
nav {
  float: center;
  width: 100%;
  height: 400px; /* only for demonstration, should be removed */
  padding: 20px;
}
  </style>

</head>
<body>

<div align="center">
<div class="container mt-3">
  <h1>BANCOMAT</h1>
  <h3>La mia banca e' differente</h3>
  <ul class="nav nav-pills nav-justified">
  
    <li class="nav-item">
      <a class="nav-link" href="http://127.0.0.1:8080/GD_WebAppBancomat/home"><h3>HOME</h3></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="http://127.0.0.1:8080/GD_WebAppBancomat/versamento"><h3>Versamento</h3></a>
    </li>
    <li class="nav-item">
      <a class="nav-link active" href="http://127.0.0.1:8080/GD_WebAppBancomat/prelevamento"><h3>Prelievo</h3></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="http://127.0.0.1:8080/GD_WebAppBancomat/lista_movimenti"><h3>Movimenti</h3></a>
    </li>
  </ul>
 
</div></div>

 <nav>
 <div align = center>
  <form name = "form" method =GET>
  <h1>	
<label for= "nome"></label><br></h1>
<input type ="text" placeholder="nominativo" name ="nome" value="" /><br>

 <h3>	
<label for= "nome">Importo</label><br></h3>

<input type ="text" placeholder="importo" name ="nome" value="" /><br>
 

 
  </div>
  <div align = center>
    <button class="btn btn-primary" type="submit">Invia</button>
     <div class="col-08">
  </div>
</form>
 

<footer>
  <img src="static/images/Logo_white.png"> 
  </footer>
 
</body>
</html>