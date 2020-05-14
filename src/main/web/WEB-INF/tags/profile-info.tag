<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="profile" scope="request" type="com.vadim.resume.entity.Profile"/>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@ attribute name="profile" required="true" type="com.vadim.resume.entity.Profile" %>
<%@ attribute name="showEdit"  required="false" type="java.lang.Boolean" %>


<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">
			<i class="fa fa-info-circle"></i> Additional info
			<a href="/edit/info" class="edit-block">Edit</a>
		</h3>
	</div>
	<div class="panel-body text-justify">
		${profile.info }
	</div>
</div>
