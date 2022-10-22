fun main() {

    var i = 0

    /**
     * Do-While executa pelo menos uma vez, verifica a condição após executar o Do
     */
    do {
        print("$i ")
        i++
    } while (i < 10)

    println()

    /**
     * Útil para solicitar entrada de dados
     */
    do {
        print("Informe seu nome: ")
        val value = readln()
    } while (value == "")

}