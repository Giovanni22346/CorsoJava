<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<div class="container mt-3">
  <h1>BANCOMAT</h1>
  <ul id="versamento"</ul>
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

<div align="center">
  <h1>	
<label for= "nome"></label><br></h1>
<input type ="text" id ="nominativo" path= "nominativo"  placeholder="Nominativo" name ="nome" value="" /><br>


<div class="p-2">
<div align="left">
 <select class="form-select" id= "taglio" aria-label="Default select example">
 
  <option selected>Taglio</option>
  <option value="1">10</option>
  <option value="2">20</option>
  <option value="3">50</option>
</select>

<label for="customRange1" style="color:black;" class="form-label">Quantitativo Banconote:</label>

<span id="quantita" style="font-weight:bold;color:black;">50</span>
<input type="range" class="slidecontainer" min="0" max="100" step="1" id="rangeValore" >


<script>
var slideCol = document.getElementById("rangeValore");
var y = document.getElementById("quantita");
y.innerHTML = slideCol.value;
slideCol.oninput = function() {
    y.innerHTML = this.value;
}
</script>


</div>

<button  id="invio-versamento"  class="btn btn-primary btn-lg float-right">Invio</button><br>


<footer>
<div align="right">
  <img src="static/images/Logo_white.png"> 
  </footer>
</body>
</html>