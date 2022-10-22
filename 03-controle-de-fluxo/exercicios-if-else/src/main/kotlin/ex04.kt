/**
 * Escreva um programa para ser usado na portaria de um evento.
 * a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são permitidos.”.
 * b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
 *    destes. Mensagem: “Negado. Convite inválido.”.
 * c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
 *    Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
 * d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
 */

fun validaIdade(): Boolean {

    print("Informe sua idade: ")
    val idade: Int? = readln().toIntOrNull()

    return if (idade == null) {
        println("Idade inválida")
        false
    } else if (idade < 18) {
        println("Negado. Menores de idade não são permitidos.")
        false
    } else true

}

fun validaTipoConvite(): String {
    print("Informe o tipo de convite: ")
    val tipoConvite = readln().lowercase()

    return if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {
        tipoConvite
    } else {
        println("Negado. Convite inválido.")
        ""
    }

}

fun validaCodigo(tipoConvite: String): Boolean {
    print("Informe o código do convite: ")
    val codigoConvite = readln().lowercase()

    return if (codigoConvite != "") {
        if ((tipoConvite == "comum" && codigoConvite.startsWith("xl")) ||
            ((tipoConvite == "luxo" || tipoConvite == "premium") && codigoConvite.startsWith("xt"))
        ) {
            true
        } else {
            println("Convite inválido!")
            false
        }
    } else
        false
}

fun main() {
    if (validaIdade()) {
        val tipoConvite = validaTipoConvite()
        if (tipoConvite != "") {
            if (validaCodigo(tipoConvite)) println("Welcome!")
        }
    }
}