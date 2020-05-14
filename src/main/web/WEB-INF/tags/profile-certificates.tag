<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@attribute name="certificates" required="true" type="java.util.List" %>

<div class="panel panel-primary certificates">
	<div class="panel-heading">
		<h3 class="panel-title">
			<i class="fa fa-certificate"></i> Certificates
			<a class="edit-block" href="/edit/certificates">Edit</a>
		</h3>
	</div>
	<div class="panel-body">
		<c:forEach var="certificate" items="${certificates }">
		<a class="thumbnail certificate-link" href="#" data-title="${certificate.name }" data-url="${certificate.largeUrl }">
			<img class="img-responsive" src="${certificate.smallUrl }" alt="${certificate.name }">
			<span>${certificate.name }</span>
		</a>
		</c:forEach>
	</div>
</div>
