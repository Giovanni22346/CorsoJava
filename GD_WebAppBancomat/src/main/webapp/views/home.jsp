<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=5">
  
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
      <a class="nav-link active" href="http://127.0.0.1:8080/GD_WebAppBancomat/home"><h2>HOME</h2></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="http://127.0.0.1:8080/GD_WebAppBancomat/versamento"><h3>Versamento</h3></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="http://127.0.0.1:8080/GD_WebAppBancomat/prelevamento"><h3>Prelievo</h3></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="http://127.0.0.1:8080/GD_WebAppBancomat/lista_movimenti"><h3>Movimenti</h3></a>
    </li>
  </ul>
  <nav></nav>
</div></div>
<footer>
  <img src="static/images/Logo_white.png"> 
  </footer>
  
</body>

</html>
