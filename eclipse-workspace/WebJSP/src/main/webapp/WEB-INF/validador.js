/**
 * validação de formulário
 * @author Marcos Barreiros
 */

 function validar() {
	 let corpoTexto = insiraCorpoTexto.nome.value;
	 if (corpoTexto === "") {
		 alert('Insira um corpo de texto')
		 corpoTexto = insiraCorpoTexto.nome.focus()
		 return false
	 } else {
		 document.forms["insiraCorpoTexto"].submit()
	 }
	  };