<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@attribute name="practics" required="true" type="java.util.List" %>

<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">
			<i class="fa fa-briefcase"></i> Practice Experience <a class="edit-block" href="/edit/practice">Edit</a>
		</h3>
	</div>
	<div class="panel-body">
		<ul class="timeline">
			<c:forEach var="practice" items="${practics }">
			<li>
				<div class="timeline-badge danger">
					<i class="fa fa-briefcase"></i>
				</div>
				<div class="timeline-panel">
					<div class="timeline-heading">
						<h4 class="timeline-title">${practice.position} at ${practice.company }</h4>
						<p>
							<small class="dates"><i class="fa fa-calendar"></i>
								<fmt:formatDate value="${practice.beginDate }" pattern="MMM yyyy"/> -
								<c:choose>
									<c:when test="${practice.finish }">
										<fmt:formatDate value="${practice.finishDate }" pattern="MMM yyyy"/>
									</c:when>
									<c:otherwise>
										<strong class="label label-danger">Current</strong>
									</c:otherwise>
								</c:choose>
							</small>
						</p>
					</div>
					<div class="timeline-body">
						<p>
							<strong>Responsibilities included: </strong> ${practice.responsibilities }
						</p>
						<c:if test="${practice.demo != null }">
							<p>
								<strong>Demo: </strong><a href="${practice.demo }">${practice.demo }</a>
							</p>
						</c:if>
						<c:if test="${practice.src != null }">
							<p>
								<strong>Source code: </strong><a href="${practice.src }">${practice.src }</a>
							</p>
						</c:if>
					</div>
				</div>
			</li>
			</c:forEach>
		</ul>
	</div>
</div>
