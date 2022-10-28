fun main() {

    val data = geraDados()

    println(listOf(1, 2, 3).sum())
    println(listOf(1.2, 2.5, 3.0).sum())

    println(data.sumOf { it.calorias })

}