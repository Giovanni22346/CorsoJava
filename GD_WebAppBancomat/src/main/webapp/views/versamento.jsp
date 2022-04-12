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
  <form name = "form" method =GET>
 <h1>	
<label for= "nome">Versamento</label><br></h1>
<input type ="text" name ="nome" value="" /><br>
 
  </div>
    <button class="btn btn-primary" type="submit">Invia</button>
     <div class="col-08">
  </div>
</form>
 
 
<div align = center>
<div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
    Taglio
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
    <li><a class="dropdown-item" href="#">10 Euro</a></li>
    <li><a class="dropdown-item" href="#">20 Euro</a></li>
    <li><a class="dropdown-item" href="#">50 Euro</a></li>
  </ul>
</div>
</body>
</html>