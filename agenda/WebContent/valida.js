/**
 * validaçao dos campos obrigatorios
 * 
 * @aothor gabriel silva lins
 */

function validar(){
	// alert("teste");
	// validaçao do campos obrigatorios
	// as linhas abaixo capiturao o coteudo da caixa de texto do formulario e
	// armazenam nas
	// variaveis nome e fone
	
	let  nome = frmcontato.nome.value;
	let  fone = frmcontato.fone.value;
	
	// se nome nao foi preenchido
	
	if (nome == "") {
		alert( "preencha o campo nome");
		frmcontato.nome.focus();
		return false;
	} else if (fone == "") {
		alert("preencha o campo fone");
		frmcontato.fone.focus();
		return false;
	} else{
	
	
	// a linha abaixo envia os documentos para o formulario
		
	document.forms["frmcontato"].submit();
 }
	

}





