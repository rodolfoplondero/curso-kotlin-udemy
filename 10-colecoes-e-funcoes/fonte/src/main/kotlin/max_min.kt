fun main() {

    val data = geraDados()

    println(data.maxOf { it.calorias })
    println(data.minOf { it.calorias })

    println(listOf(1, 4, 5).maxOf { it })
    println(listOf(1, 4, 5).maxOrNull())

    println(listOf(1, 4, 5).minOf { it })
    println(listOf(1, 4, 5).minOrNull())

    println(data.maxByOrNull { it.calorias })
}