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
  <script src= "static/js/neotech_ajax.js"></script>
  <script src= "static/js/main.js"></script>
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
      <a class="nav-link" href="http://127.0.0.1:8080/GD_WebAppBancomat/prelevamento"><h3>Prelievo</h3></a>
    </li>
    <li class="nav-item">
      <a class="nav-link active" href="http://127.0.0.1:8080/GD_WebAppBancomat/lista_movimenti"><h3>Movimenti</h3></a>
    </li>
  </ul>
 
</div></div> 

<div align = center>
<table 
<!-- TH intestazione 
     TR righe
     TD i campi in orrizontale
-->

<table id="tabella_dati"  class="table table-dark">

   <tr style="text-align:center">
   
   	 <th scope="col">UUID</th>
     <th scope="col">Data e Ora</th>
     <th scope="col">Operazione</th>
     <th scope="col">Nominativo</th>
     <th scope="col">Taglio</th>
     <th scope="col">Quantita'</th>
     <th scope="col">Totale</th>
     <th scope="col">Canc</th>
   	 </tr>
 


<c:set var="numTransazioni" scope="session" value="0"/>
<c:forEach var="transazione" items="${lista_transazioni.listaTransazioniRestituite}">
 <c:set var="numTransazioni" scope="session" value="${numTransazioni+1}"/>
    <tr class ="mia" style="text-align:center">
    
    <td> <c:out value="${transazione.UUID}"/></td>
    <td> <c:out value="${transazione.dataEora}"/></td>
    <td> <c:out value="${transazione.operazione}"/></td>
    <td> <c:out value="${transazione.nominativo}"/></td>  
    <td> <c:out value="${transazione.taglio}"/></td> 
    <td> <c:out value="${transazione.quantita}"/></td>
    <td> <c:out value="${transazione.taglio*transazione.quantita}"/></td>
    <td><a href="elimina-transazione?uuid=<c:out value="${transazione.UUID}"/>"> <input class='btn btn-danger' type="button"  value="Delete"/></a>
    <button onClick='deleteTransazioneBancomat("${transazione.UUID}")' type='button' class='btn btn-danger'>Delete Ajax</button>
    </td>
     
   </tr>     
   </c:forEach>
</table>
 
 <div align = center>
  <form name = "form" method =GET>
 
  <div align = center>
 <h3>	

<span class="d-block p-2 bg-dark text-white" id="saldo" >Saldo:<c:out value="${saldo}"/> </span>

<footer>
  <img src="static/images/Logo_white.png"> 
  </footer>
 
</body>
</html>