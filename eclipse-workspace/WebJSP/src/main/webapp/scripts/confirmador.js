/**
 * Confirmar a exclusao de um contato
 * 
 * @author Professor Jose de Assis
 * @param idcon
 */

function confirmar(idlivro) {
	let resposta = confirm("Confirma a exclusão deste título?")
	if (resposta === true) {
		window.location.href = "delete?idLivro=" + idLivro
	}
}