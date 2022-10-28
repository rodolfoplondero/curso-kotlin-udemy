fun main() {
    val data = geraDados()

    println(listOf<Int>(1, 2).average())

    println(data.map { it.calorias }.average())

}