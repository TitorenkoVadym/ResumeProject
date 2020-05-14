<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 29.04.2020
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="resume" tagdir="/WEB-INF/tags"%>


<div class="row profiles">
    <div id="profileContainer" class="col-xs-12" data-profile-total="${page.totalPages }" data-profile-number="${page.number }">
        <jsp:include page="fragment/profile-items.jsp" />
    </div>
    <c:if test="${page.number < page.totalPages - 1}">
        <div id="loadMoreContainer" class="col-xs-12 text-center">
            <a href="javascript:resume.moreProfiles('${query }');" class="btn btn-primary">Загрузить еще</a>
        </div>
        <div id="loadMoreIndicator" class="col-xs-12 text-center" style="display:none;">
<%--            <img src="/static/img/large-loading.gif" alt="loading..."/>--%>
        </div>
    </c:if>
</div>
