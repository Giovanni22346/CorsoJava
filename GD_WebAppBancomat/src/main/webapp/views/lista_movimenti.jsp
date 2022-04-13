<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
      <a class="nav-link active" href="http://127.0.0.1:8080/GD_WebAppBancomat/prelevamento"><h2>Prelievo</h2></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="http://127.0.0.1:8080/GD_WebAppBancomat/lista_movimenti"><h3>Movimenti</h3></a>
    </li>
  </ul>
 
</div></div> 

<div align = center>
<table style="border:1">
<!-- TH intestazione 
     TR righe
     TD i campi in orrizontale
-->


<c:forEach var="Transazione" items="${lista_movimenti}">
    <tr style="text-align:center">
    <td> <c:out value="${transazione.id}"/></td>
    <td> <c:out value="${transazione.data}"/></td>
    <td> <c:out value="${transazione.operazione}"/></td>
    <td> <c:out value="${transazione.nominativo}"/></td>  
    <td> <c:out value="${transazione.taglio}"/></td> 
    <td> <c:out value="${transazione.quantita}"/></td>
    <td> <c:out value="${transazione.totale}"/></td>
    <td> <img src="<c:out value="${transazione.url_immagine}"/>"/></td>
    <td>
    </td>
   </tr>     
   </c:forEach>
</table>
 
 
 <h2>	
<label for= "nome">Lista Movimenti</label><br></h2>
<input type ="text" placeholder="nominativo" name ="nome" value="" /><br>
 
 
  <div align = center>
 <h3>	
<label for= "nome">Saldo</label><br></h3>
<input type ="text" placeholder="saldo" name ="nome" value="" /><br>
 
 
 <table class="table caption-top">
  <caption></caption>
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Data e Ora</th>
      <th scope="col">Operazione</th>
      <th scope="col">Nominativo</th>
      <th scope="col">Taglio</th>
      <th scope="col">Quantita'</th>
      <th scope="col">Totale</th>
      <th scope="col">Azioni</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>11/4/22</td>
      <td>Versamento</td>
      <td>Giovanni</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>12/4/22</td>
      <td>Prelevamento</th>
      <td>Giovanni</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>12/4/22</td>
      <td>Prelavamento</td>
      <td>Giovanni</td>
    </tr>
  </tbody>
</table>
 </nav>
<footer>
  <img src="static/images/Logo_white.png"> 
  </footer>
 
</body>
</html>