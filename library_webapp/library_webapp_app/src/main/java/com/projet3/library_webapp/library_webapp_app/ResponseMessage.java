package com.projet3.library_webapp.library_webapp_app;

import java.util.HashMap;
import java.util.Map;

public class ResponseMessage {
	public Map<String, String> response = new HashMap<String, String>();
	
	public ResponseMessage() {
		response.put("01", "Aucun livre pour ce titre");
		response.put("02", "Le livre est toujours disponible");
		response.put("03", "Vous avez déjà réservé ce livre");
		response.put("04", "Plus de réservation possible pour ce livre, veuillez attendre les prochains retours");
		response.put("CREATED", "Votre réservation a bien été enregistrée, vous pouvez consulter vos réservations dans l'onglet \"Mes réservations\"");
	}

}
