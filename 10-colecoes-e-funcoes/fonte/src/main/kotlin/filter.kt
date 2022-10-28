fun main() {

    val data = geraDados()

    println(data.filter { it.calorias > 500 })
    println(data.any { it.calorias > 500 })
    println(data.count { it.calorias > 500 })
}