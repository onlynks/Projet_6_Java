<%@ include file="head.jsp"%>
<%@ include file="menu.jsp"%>

<div class="row">

<c:forEach var="entry" items="${bookingList}" varStatus="loop">
	
		<div class="col-sm-6">
			<div class="card">
				<div class="card-body">
					<h5 class="card-title">${entry.key.getBookTitle()}</h5>
					<p class="card-text">Votre position dans la file d'attente: <strong>${entry.key.getPosition()}</strong></br>
						Date du prochain retour: <strong>${entry.value}</strong></p>
					<a href="deleteBooking?bookTitle=${entry.key.getBookTitle()}" class="btn btn-secondary col-md-12">Annuler ma réservation</a>
				</div>
			</div>
		</div>
	
</c:forEach>

</div>

<%@ include file="footer.jsp"%>
