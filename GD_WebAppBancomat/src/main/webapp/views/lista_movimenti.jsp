<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</head>
<body>
 
 <div align="center">
<a>
<button type="button" class="btn btn-secondary">Home</button><br>
</a>
<tr>
<a>
<button type="button" class="btn btn-secondary">Versamento</button><br>
</a>
</tr>
<a>
<button type="button" class="btn btn-secondary">Prelevamento</button><br>
</a>
<tr>
<a>
<button type="button" class="btn btn-secondary">Lista movimenti</button><br>
</a>
 <div align = center>
 
 <h1>	
<label for= "nome">Lista Movimenti</label><br></h1>
<input type ="text" name ="nome" value="" /><br>
 
 
  <div align = center>
 <h3>	
<label for= "nome">Saldo</label><br></h3>
<input type ="text" name ="nome" value="" /><br>
 
 
 <table class="table caption-top">
  <caption>List of users</caption>
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
 
 
</body>
</html>