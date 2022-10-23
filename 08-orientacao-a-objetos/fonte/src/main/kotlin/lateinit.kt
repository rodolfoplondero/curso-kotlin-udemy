class Receita {
    lateinit var instrucoes: String

    fun geraReceita() {
        instrucoes = "Lave as mãos."
    }

    fun imprimeReceita(): Unit {
        if (!this::instrucoes.isInitialized) {
            instrucoes = "Lave as mãos."
        }
    }
}

fun main() {

    val r: Receita = Receita()

    r.imprimeReceita()
    println(r.instrucoes)

}