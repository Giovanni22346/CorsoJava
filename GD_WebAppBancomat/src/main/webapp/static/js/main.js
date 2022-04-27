$(document).ready(function () {

 
 //  registro evento pulsante invio versamento	
   $('#invio-versamento').click(function (event) {   
    //preparo la request in json
    var requestData = {
	    'transazioneRequest':{
		     'nominativo':$('#nominativo').val(),
			 'taglio':$('#taglio').val(),
			 'quantita':$('#quantita').val(),
	    }
     };

    //chiamo il server---------------
    fire_ajax_post("api/add", requestData);
//    var response_object=response.responseJSON;   //questo torna un oggetto complesso che posso navigare
//
// //elaboro la risposta in formato testo
//    var response_text=response.responseText;   //questo torna una stringa pura
//    $('#text-feedback').text(response_text);
//
// //elaboro la risposta in formato ogetto
//    $("#table-feedback tr.mia").remove();
//    $.each(response_object.listaTransazioniRestituite, function(i, transazione) {
//	     var riga="<tr class='mia'>";
//	     riga+="<td>"+transazione.UUID+"</td>";
//	     riga+="<td>"+transazione.nominativo+"</td>";
//	     riga+="<td>"+transazione.operazione+"</td>";
//	     riga+="<td>"+transazione.taglio+"</td>";
//		 riga+="<td>"+transazione.quantita+"</td>";
//		 riga+="<td><button onClick='deleteTransazioneBancomat(\""+transazione.UUID+"\")' type='button' class='btn btn-danger'>delete</button></td>";
//	     riga+="</tr>";
//         $("#table-feedback").append(riga);
    });
 });

  

   


function deleteTransazioneBancomat(transazioneUUID){
//chiamo il server---------------	
var response=fire_ajax_pathvar("api/delete/"+transazioneUUID);
var response_object=response.responseJSON;

//elaboro la risposta in formato testo
 var response_text=response.responseText;
$('#text-feedback').text(response_text);
    

$("#tabella_dati tr.mia").remove();

 //elaboro la risposta in formato ogetto
$.each(response_object.listaTransazioniRestituite, function(i, transazione) {
   var riga="<tr class='mia'>";
	     riga+="<td>"+transazione.uuid+"</td>";
	     riga+="<td>"+transazione.dataEora+"</td>";
	     riga+="<td>"+transazione.operazione+"</td>";
		 riga+="<td>"+transazione.nominativo+"</td>";
		 riga+="<td>"+transazione.taglio+"</td>";
         riga+="<td>"+transazione.quantita+"</td>";
         riga+="<td>"+transazione.totale+"</td>";
		 riga+="<td><button onClick='deleteTransazioneBancomat("+transazione.UUID+")' type='button' class='btn btn-danger'>Delete Ajax</button></td>";
	    
 
   riga+="</tr>";
   $("#tabella_dati").append(riga);
    });	
}

