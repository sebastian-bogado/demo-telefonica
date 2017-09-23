/*
function agregarPtoCarga(){
	var lastChild = $("#tableComponentes tr:last-child");
	var newTr = $("#tableComponentes tr:last-child").clone();
	$(".input-posicion",newTr).val("");
	$(".input-id",newTr).val("");
	//Append new element
	$("#tableComponentes tbody").append(newTr);
}

function eliminarComponente(element){
	if(self.document.getElementsByClassName("input-posicion").length > 1){
		$(element).closest("#tableComponentes tr").remove();
	}else{
		return;
	}
}
*/
function sendForm(){
	$("#guardar").attr('disabled', true);
	$("#alta-site-form").submit();
}
/*

function ValidateIPaddress(ipaddress)
{
	if (/^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/.test(ipaddress))
	{
		return (true)
	}
	alert("You have entered an invalid IP address!")
	return (false)
}


*/
