<%@ include file="head.jsp"%>
<%@ include file="menu.jsp"%>

<c:forEach items="${bookFound}" var="entry">
	<div class="card mb-3">
		<div class="card-header">
			<div class="row">
				<div class="col-md-11">
					<h5>
						<c:out value="${entry.key.title}" />
					</h5>
				</div>
				<c:choose>
					<c:when test="${entry.value == 0}">
						<div class="col-md-1">
							<span class="badge badge-danger">indisponible</span>
						</div>
					</c:when>
					<c:otherwise>
						<div class="col-md-1">
							<span class="badge badge-primary">${entry.value} dispo</span>
						</div>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<c:if test="${entry.value == 0}">
			<div class="alert alert-danger" role="alert">
				<div class="row">
					<div class="col-md-4">Nombre de réservation en cours: <strong>${notAvailableInfos[entry.key.title].getBookingQuantity()}</strong></div>
					<div class="col-md-4">Prochaine date de retour: <strong>${notAvailableInfos[entry.key.title].getNextReturnDate()}</strong></div>
					<div class="col-md-4">
						<button type="button" class="btn btn-light bookingButton">Réserver</button>
					</div>
				</div>
			</div>
		</c:if>
		<div class="card-body">
			<blockquote class="blockquote mb-0 scrollClass">
				<c:out value="${entry.key.description}" />
			</blockquote>
			<footer class="blockquote-footer">
				<cite title="Source Title">${entry.key.author.firstName}
					${entry.key.author.lastName}</cite>
			</footer>
		</div>
	</div>

</c:forEach>

<%@ include file="footer.jsp"%>