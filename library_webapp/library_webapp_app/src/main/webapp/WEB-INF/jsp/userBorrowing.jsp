<%@ include file="head.jsp" %>
<%@ include file="menu.jsp" %>

	<c:forEach items="${borrowedBooks}" var="entry">	    
		<div class="card mb-3">
	 		<div class="card-header">
	 			<div class="row">
	 				<div class="col-md-10">
	 					<h5><c:out value="${entry.key.book.title}"/></h5>
		 				<span class="badge badge-primary">${entry.value.Beginning}</span>
		 				<i class="arrow right"></i>
		 				<span class="badge badge-primary">  ${entry.value.Ending}</span>
	 				</div>
	 				
    				<jsp:useBean id="today" class="java.util.Date" />					
	 				<c:if test = "${!entry.key.extended && today gt entry.key.getEndingDate().toGregorianCalendar().getTime() }">
         				<div class="col-md-2">	 					
	 					<a href="extendBorrowing/${entry.key.book.id}"><button type="button" class="btn btn-primary">Prolonger d'un mois</button></a>
	 					</div> 
      				</c:if>	 				 
	    		</div>
	  		</div>
	  		<div class="card-body">
		    	<blockquote class="blockquote mb-0 scrollClass">
			      	<c:out value="${entry.key.book.description}"/>			      	
		    	</blockquote>
		    	<footer class="blockquote-footer"><cite title="Source Title">${entry.key.book.author.firstName} ${entry.key.book.author.lastName}</cite></footer>
	  		</div>
		</div> 
	</c:forEach>

<%@ include file="footer.jsp" %>
