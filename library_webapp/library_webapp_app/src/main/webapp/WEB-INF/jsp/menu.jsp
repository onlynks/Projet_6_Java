<h1>Bibliothèque de Paris</h1>


<div class="d-flex flex-row-reverse bd-highlight mb-2">

	<c:choose>
	    <c:when test="${empty sessionScope.user}">
	        
				<button type="button" class="btn btn-primary ml-2" >Inscription</button>
				<button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#logInModal">Connection</button>
			
	    </c:when>
	    <c:otherwise>
	    	<a href="logOut"><button type="button" class="btn btn-primary ml-4">Déconnection</button></a>
	        <h4>${sessionScope["user"].firstName} ${sessionScope["user"].lastName}</h4>
	    </c:otherwise>
	</c:choose>

</div>

<nav class="navbar navbar-expand-lg navbar-light bg-light mb-5">

  <a class="navbar-brand" href="home">Accueil</a>

  <div class="collapse navbar-collapse">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="bookList">Livres</a>
      </li>
      <c:if test = "${!empty sessionScope.user}">
	      <li class="nav-item">
	      	<a class="nav-link" href="userBorrowing">Mes emprunts</a>
	      </li>
      </c:if>
      
    </ul>
    
    <form method="post" action="bookResearch" class="form-inline">
      <input class="form-control mr-sm-2" type="search" name="title" id="title" placeholder="Chercher un livre">
      <input type="submit" class="btn btn-outline-success my-2 my-sm-0" value="Go!">
    </form>
  </div>
  
</nav>


<!-- Modal -->
<div class="modal fade" id="logInModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="logInModalLabel">Connection</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      
      
      <form method="post" action="logIn">
      	<div class="modal-body">
		  <div class="row">
		    <div class="col">
		      <input type="text" name="firstName" id="firstName" class="form-control" placeholder="Prénom">
		    </div>
		    <div class="col">
		      <input type="text" name="lastName" id="lastName" class="form-control" placeholder="Nom de famille">
		    </div>
		    <div class="col">
		      <input type="password" name="password" id="password" class="form-control" placeholder="Mot de passe">
		    </div>
		  </div>
		 </div>
		 
		<div class="modal-footer">
	         <input type="submit" class="btn btn-success btn-send" value="OK">
      	</div>
	  </form>      
      
    </div>
  </div>
</div>