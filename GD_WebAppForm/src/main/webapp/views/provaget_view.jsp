<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/test.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" ></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>





</head>
<body>




<form:form id="form_submit" action="inviodati_get" method="POST" modelAttribute="mapping_dati">
 <form:input  id="username" path="username"  class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1"/>
 <form:input  id="password" path="password"  class="form-control" placeholder="Password" aria-label="Password" aria-describedby="basic-addon1"/>
 <form:input  id="email" path="email"  class="form-control" placeholder="Email" aria-label="Email" aria-describedby="basic-addon1"/>
 <form:button type="submit" id="bth-search" class="btn btn-primary btn-lg float right">Invio Dati</form:button>

</form:form>

</body>
</html>