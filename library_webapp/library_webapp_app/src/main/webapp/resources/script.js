function hideShow(index) {
	  var info = document.getElementById("bookingInfo" + index);
	  var container = document.getElementById("grid-container" + index);
	  
	  if (info.style.opacity === "0") {
		  info.style.opacity = "100";
		  container.style.height = "125px";
		  container.style.backgroundColor = "rgb(212, 217, 255)";
	  } else {
		  info.style.opacity = "0";
		  container.style.height = "50px";
		  container.style.backgroundColor = "white";
	  }
	}


function createBooking(bookTitle, modalId) {
	var httpRequest = new XMLHttpRequest();	
	httpRequest.open("POST", "createBooking?title=" + bookTitle, true);
	httpRequest.setRequestHeader('Accept', 'application/json, text/javascript');
	
	httpRequest.onload = function (e) {
	  if (httpRequest.readyState === 4) {
	    if (httpRequest.status === 200) {
	    	var modal = document.getElementById("responseModal" + modalId);
	    	modal.style.display = "block";
	    	
	    	var p = document.createElement('p');
	    	p.id = "p" + modalId;
	    	p.innerHTML = httpRequest.responseText;	    	
	    	var modalBody = document.getElementById("modalBody" + modalId);
	    	
	    	modalBody.appendChild(p);
	    } else {
	      console.error(httpRequest.statusText);
	    }
	  }
	};
	httpRequest.onerror = function (e) {
	  console.error(httpRequest.statusText);
	};
	httpRequest.send(null);
}

function closeModal(modalId) {
	document.getElementById("p" + modalId).remove();
	var responseModal = document.getElementById("responseModal" + modalId);
	responseModal.style.display = "none";
}
