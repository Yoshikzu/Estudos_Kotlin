package business

import entity.Convite

class ConviteBusiness {

    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun codigoValido(convite: Convite) = when(convite.tipo){
        "comum"-> convite.codigo.startsWith("xt")
        "premium","luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }


}