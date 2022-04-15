<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista transazioni</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>


<table>
</tr>
<c:set var = "numTransazioni"  value = "0"/>
<c:forEach var="transazioni" items="${responseTransazioni.listaTransazioniRestituite}">
<c:set var = "numTransazioni"  value = "${numTransazioni+1}"/>
<tr border=1>
    <td border=1><c:out value="${numTransazioni}"/></td>
   <td border=1><c:out value="${transazione.id}"/></td>
   <td border=1><c:out value="${transazione.dataEora}"/></td>
   <td border=1><c:out value="${transazione.operazione}"/></td>
   <td border=1><c:out value="${transazione.nominativo}"/></td>
   <td border=1><c:out value="${transazione.taglio}"/></td>
    <td border=1><c:out value="${transazione.quantita}"/></td>
    <td border=1><a href="elimina-transazione?id=<c:out value="${transazione.id}"/>"><img width="20px" src="https://img.myloview.it/adesivi/red-cross-mark-icon-template-color-editable-symbol-no-or-x-button-for-correct-vote-check-not-approved-error-wrong-and-failed-decision-vector-sign-isolated-on-white-background-700-177725513.jpg"/></a></td>
</tr>


</c:forEach>
</table>


</body>
</html>