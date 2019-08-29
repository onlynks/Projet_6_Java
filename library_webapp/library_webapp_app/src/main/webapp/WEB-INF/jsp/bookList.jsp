<%@ include file="head.jsp"%>
<%@ include file="menu.jsp"%>

<table class="table table-hover text-center">
	<thead class="thead-dark">
		<tr>
			<th scope="col">Titre</th>
			<th scope="col">Auteur</th>
			<th scope="col">Disponibilité</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="entry" items="${bookList}" varStatus="loop">
			<tr>
				<td class="text-left"><h6>${entry.key.title}</h6></td>
				<td class="authorColumn">${entry.key.author.firstName}
					${entry.key.author.lastName}</td>
				<td>${entry.value}
					<c:if test="${entry.value == 0}">
						<span class="bookList-infos" onclick="hideShow(${loop.index})">i</span>
						<div class="alert alert-danger" role="alert"
							id="notAvailable${loop.index}" style="display: none">
							A simple danger alert with <a href="#" class="alert-link">an
								example link</a>. Give it a click if you like.
						</div>
					</c:if>
				</td>
			</tr>

		</c:forEach>
	</tbody>
</table>

<%@ include file="footer.jsp"%>