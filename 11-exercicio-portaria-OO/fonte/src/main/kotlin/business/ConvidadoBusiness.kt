package business

import entity.Convidado

class ConvidadoBusiness {

    private val tipos = listOf<String>("comum", "premium", "luxo")

    fun tipoValido(tipo: String) = tipo in tipos

    fun codigoValido(convite: Convidado) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }

    /*fun codigoValido2(convite: Convite): Boolean {
        return ((convite.tipo == "comum" && convite.codigo.startsWith("xt")) ||
                (convite.tipo == "premium" || convite.tipo == "luxo") && convite.codigo.startsWith("xl"))
    }*/

    fun maiorDeIdade(idade: Int) = idade >= 18
}