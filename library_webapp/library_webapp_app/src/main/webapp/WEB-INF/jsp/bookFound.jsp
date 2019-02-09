<%@ include file="head.jsp" %>
<%@ include file="menu.jsp" %>

<c:forEach items="${bookFound}" var="entry">	    
		<div class="card mb-3">
	 		<div class="card-header">
	 			<div class="row">
	 				<div class="col-md-11"><h5><c:out value="${entry.key.title}"/></h5></div>
	 				<div class="col-md-1">
		 				<span class="badge badge-primary">${entry.value} dispo</span>
	 				</div>  
	    		</div>
	  		</div>
	  		<div class="card-body">
		    	<blockquote class="blockquote mb-0 scrollClass">
			      	<c:out value="${entry.key.description}"/>			      	
		    	</blockquote>
		    	<footer class="blockquote-footer"><cite title="Source Title">${entry.key.author.firstName} ${entry.key.author.lastName}</cite></footer>
	  		</div>
		</div>
		  	 
	</c:forEach>

<%@ include file="footer.jsp" %>