<%@ include file="head.jsp" %>
<%@ include file="menu.jsp" %>



<table class="table table-hover text-center">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Titre</th>
      <th scope="col">Auteur</th>
      <th scope="col">Disponibilité</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="entry" items="${bookList}">
		<tr>
		  <td class="text-left"><h6><c:out value="${entry.key.title}"/></h6></td>
		  <td><c:out value="${entry.key.author.firstName}  ${entry.key.author.lastName}"/></td>
		  <td><c:out value="${entry.value}"/></td>
	  	</tr>
	</c:forEach>
  </tbody>
</table>

<%@ include file="footer.jsp" %>