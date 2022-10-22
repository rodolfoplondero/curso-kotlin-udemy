fun main() {
    var nomeCompleto: String = "Rodolfo Londero"
    var textoSemValor: String

    val calcado: Byte = 44
    val pib: Long = 1869000000000
    val populacao: Int = 211000000

    println("Nome: $nomeCompleto")
    println("Número: $calcado")
    println("PIB: $pib")
    println("População: $populacao")

    var pipPerCapta = pib.toDouble() / populacao

    println("Pip per capta: $pipPerCapta")
}