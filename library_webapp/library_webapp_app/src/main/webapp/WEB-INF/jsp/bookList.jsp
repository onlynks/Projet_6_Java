<%@ include file="head.jsp"%>
<%@ include file="menu.jsp"%>

<ul class="list-group">
	<c:forEach var="entry" items="${bookList}" varStatus="loop">

		<li class="list-group-item" id="grid-container${loop.index}">
			<h6 class="title">${entry.key.title}</h6>

			<div class="author">${entry.key.author.firstName}
				${entry.key.author.lastName}</div>

			<div class="quantityBadge">
				<span class="badge badge-primary badge-pill"
					style="right: 2%; top: 10px;">${entry.value} dispos</span>

				<c:if test="${entry.value == 0}">
					<span class="bookList-infos" onclick="hideShow(${loop.index})">i</span>
				</c:if>
			</div>

			<div class="bookingInfo" id="bookingInfo${loop.index}"
				style="opacity: 0; transition: opacity 0.4s;">
				<div>
					Nombre de réservation en cours: <strong>${notAvailableInfos[entry.key.title].getBookingQuantity()}</strong>
				</div>
				<div>
					Prochaine date de retour: <strong>${notAvailableInfos[entry.key.title].getNextReturnDate()}</strong>
				</div>

				<c:if test="${sessionScope['user'] != null}">
					<button type="button" class="btn btn-secondary bookingButton"
						onclick="createBooking('${entry.key.title}', ${loop.index})">Réserver</button>
						
					<div class="modal" tabindex="-1" role="dialog" id="responseModal${loop.index}">
						<div class="modal-dialog" role="document">
							<div class="modal-content">

								<div class="modal-body" id="modalBody${loop.index}">
									<button type="button" class="close" aria-label="Close"
										onclick="closeModal(${loop.index})">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
							</div>
						</div>
					</div>
				</c:if>



			</div>
		</li>


	</c:forEach>
</ul>



<%@ include file="footer.jsp"%>