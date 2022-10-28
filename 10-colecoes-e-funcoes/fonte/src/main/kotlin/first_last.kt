fun main() {
    val data = geraDados()

    println("Primeira receita: ${data.first().nome}")
    println("Última receita: ${data.last().nome}")

    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())
}