document.addEventListener("DOMContentLoaded", function(event) { 

	console.log("Iniciando correctamente");
	var request = new XMLHttpRequest();
	request.open('GET', 'http://localhost:8091/restejemplo/saludo', true);
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

	const btnActivar = document.getElementById("btnActivar");
	btnActivar.textContent = "Activar";

	function activarDatos(){
		alert("Función activarDatos")
		var solicitud = new XMLHttpRequest();
		solicitud.open('GET', 'http://localhost:8091/restejemplo/datos', true);
		solicitud.onload = function() {
			if (solicitud.status >= 200 && solicitud.status < 400) {
				var resp = solicitud.responseText;
				document.getElementById("respuestaDatos").textContent=resp;
			}else {
				document.getElementById("respuestaDatos").textContent=resp;
			}
		};
		solicitud.onerror = function() {
			document.getElementById("respuestaDatos").textContent="Ha ocurrido un error";
		};
		solicitud.send();
	}

	btnActivar.addEventListener("click",()=>{
		activarDatos();
	});
  
});


