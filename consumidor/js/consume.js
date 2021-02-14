document.addEventListener("DOMContentLoaded", function(event) { 

	console.log("Iniciando correctamente");
	var request = new XMLHttpRequest();
	request.open('GET', 'http://localhost:8091/restejemplo/saludos', true);
	request.onload = function() {
		if (request.status >= 200 && request.status < 400) {
			var resp = request.responseText;
			document.getElementById("respuesta").textContent=resp;
		}else {
			document.getElementById("respuesta").textContent=resp;
		}
	};
	request.onerror = function() {
		document.getElementById("Error").textContent="Ha ocurrido un error";
		document.getElementById("Error").style.display="block";
		document.getElementById("Error").style.color="red";
	};
	request.send();

  
});


