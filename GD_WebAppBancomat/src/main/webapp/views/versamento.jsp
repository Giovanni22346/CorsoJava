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
      <a class="nav-link active" href="http://127.0.0.1:8080/GD_WebAppBancomat/versamento"><h3>Versamento</h3></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="http://127.0.0.1:8080/GD_WebAppBancomat/prelevamento"><h3>Prelievo</h3></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="http://127.0.0.1:8080/GD_WebAppBancomat/lista_movimenti"><h3>Movimenti</h3></a>
    </li>
  </ul>
 
</div></div>
 
<tr></tr>

<form:form id="form_submit" action="generaTransazioni" method="get" modelAttribute="transazione">

<div align="center">
  <h1>	
<label for= "nome"></label><br></h1>
<input id ="nominativo" path= "nominativo" type ="text" placeholder="nominativo" name ="nome" value="" /><br>


<div class="p-2">
<div align="left">
 <select class="form-select" aria-label="Default select example">
 
  <option selected>Taglio</option>
  <option value="1">10</option>
  <option value="2">20</option>
  <option value="3">50</option>
</select>

<label for="customRange1" style="color:black;" class="form-label">Quantitativo Banconote:</label>

<span id="importo" style="font-weight:bold;color:black;">50</span>
<input type="range" class="slidecontainer" min="0" max="100" step="1" id="customRange1" >


<script>
var slideCol = document.getElementById("customRange1");
var y = document.getElementById("valoreNumericoImporto");
y.innerHTML = slideCol.value;
slideCol.oninput = function() {
    y.innerHTML = this.value;
}
</script>


</div>

<!-- Invio Importo -->

<button  type="submit" id="bth-search" class="btn btn-primary btn-lg float-right">Invio</button><br>




</form:form>
 

<footer>
  <img src="static/images/Logo_white.png"> 
  </footer>


</body>
</html>