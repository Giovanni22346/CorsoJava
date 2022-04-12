<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenzia Viaggi Caput Mundi</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<link rel="stylesheet" type="text/css" href="static/css/color03.css"/>
</head>
<body>
<script>

$(document).ready(function(){
	 


var a=1;

$("#btn01").click(function() {
	if (a==1) {
		$("#btn01").html ("ho cambiato pulsante");
		a=2;
	}
	else {
		$("#btn01").html ("testo originale");
		
	}
	
	  
	});

$(document).ready(function(){
	  $("button").click(function(){
	    $("#ven").fadeIn();
	    $("#sab").fadeIn("slow");
	    $("").fadeIn(3000);
	  });
	});

</script>

<button type="button" class="btn btn-outline-primary">Lunedi</button>
<button type="button" class="btn btn-martedi">Martedi</button>
<button type="button" class="btn btn-mercoledi">Mercoledi</button>
<button type="button" class="btn btn-giovedi">Giovedi</button>
<button id ="ven" type="button" class="btn btn-venerdi">Venerdi</button>
<button id ="sab" type="button" class="btn btn-sabato">Sabato</button>
<button id = "btn01" type="button" class="btn btn-domenica">Domenica</button>

<div align="right">
<button type="button" class="btn btn-contatti">Contatti</button>
<button type="button" class="btn btn-chisiamo">Chi siamo</button>
<button type="button" class="btn btn-newsletter">Newsletter</button></br>

<br><br>
<button type="button" class="btn btn-primary position-relative">
  Inbox
  <span class="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger">
    99+
    <span class="visually-hidden">unread messages</span>
  </span>
</button>

<ul>
<div align="left">
<li>
<a href = https://www.edreams.com/ title="vai alla pagina Voli edreams" > Prenotazione Voli</a><br>
<li>
<a href = https://www.booking.com/ title="vai alla pagina Hotels di booking.com"  >Prenotazione Hotels</a><br>
<li>
<a href = https://www.negozidiroma.com/specialita-gastronomiche-roma/ title="vai alla pagina negozidiroma"  >Le Specialita' enogastronomiche di Roma e provincia</a><br>

</ul>


<a href = https://www.meteo.it/ title="vai alla pagina di registrazione"  >Registrati</a><br>
<ul>
<div align="right">
<li>
<a href = https://www.meteo.it/ title="vai alla pagina meteo" > Meteo</a><br>
<li>
<a href = https://www.meteo.it/ title="vai alla pagina delle offerte"  >Musei e Mostre</a><br>
</ul>


<h2> </h2>
<form name = "formEsempio" method =GET>


<label for= "nome"> User name </label><br>
<input type ="text" name ="nome" value="" /><br>

<label for= "cognome"> Password </label><br>
<input type ="text" name ="cognome" value="" /><br>

<label for= "email"> Email  </label><br> 
<input type ="text" name ="email" value="" /><br>


<center >
<img src=""<center >
<img src="http://www.gentiepaesi.it/foto/35283gep.jpg"> 

</center> 

</center>





</form>


<h1 align = center class="mia classe"> Agenzia Turistica "Roma Caput Mundi"</h1>
<h2 align = center Style ="color.yellow"> Visite guidate Roma e provincia</h2>


<table>

<thead>


<tbody>






</tbody>
<tfoot>



</tfoot>
</thead>
</table>

<center >
<img src="https://th.bing.com/th/id/R.e61766b8cc562059bcdbc72259136144?rik=CXzylDHIk5SL2A&riu=http%3a%2f%2fwww.turistafaidate.it%2fwp-content%2fuploads%2f2016%2f10%2fRoma.jpg&ehk=KIkBbFltkW0bC9WfW%2fCa62e%2fU03p%2bWa2UcIfb%2fQreso%3d&risl=&pid=ImgRaw&r=0" width="380" height = "250"> 

</center>
 
<div class="accordion accordion-flush" id="accordionFlushExample">
  <div class="accordion-item">
    <h2 class="accordion-header" id="flush-headingOne">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
        Visite a Roma
      </button>
    </h2>
    <div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
      <div class="accordion-body">Le visite in citta' sono disponibili  tutti i giorni incluso i festivi dalle ore 10.00 alle ore 20:00</div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header" id="flush-headingTwo">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
        Visite in provincia
      </button>
    </h2>
    <div id="flush-collapseTwo" class="accordion-collapse collapse" aria-labelledby="flush-headingTwo" data-bs-parent="#accordionFlushExample">
      <div class="accordion-body">Le visite in provincia sono disponibili tutti i festivi e nei weekend dalle ore 10.00 alle ore 20:00</div>
    </div>
  </div>
  <div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="..." class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="..." class="d-block w-100" alt="...">
    </div>
  </div>
</div>




</body>
</html>