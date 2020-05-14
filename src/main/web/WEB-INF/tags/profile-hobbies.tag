<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@ attribute name="hobbies" required="true" type="java.util.List" %>

<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">
			<i class="fa fa-heart" aria-hidden="true"></i> Hobby
		<a class="edit-block" a href="/edit/hobbies"> Edit </a>
		</h3>
	</div>
	<div class="panel-body">
			<table class="table table-bordered">
				<c:forEach var="hobby" items="${hobbies }">
				<tr>
					<td><i class="fa fa-heart"></i> </td>
					<td> ${hobby.name } </td>
				</tr>
				</c:forEach>
			</table>
	</div>
</div>
