<%@ include file="head.jsp" %>
<%@ include file="menu.jsp" %>

<c:if test = "${!empty error}">
	<div id="myModal" class="modal fade" role="dialog">
  		<div class="modal-dialog">
   
    <div class="modal-content">
      
      <div class="modal-body">
        <p>${error}</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
      </div>
    </div>

  </div>
</div>
</c:if>	 

<p>Vous �tes sur la page d'accueil</p>


<%@ include file="footer.jsp" %>