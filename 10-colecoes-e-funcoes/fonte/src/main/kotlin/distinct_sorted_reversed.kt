fun main() {
    val data = geraDados()

    val lst = listOf<Int>(0,1, 2, 4, 5, 6, 6, 4, 7, 8, 1, 1, 1)

    println(lst.distinct())
    println(data.distinctBy { it.nome })

    println(lst.sorted())
    println(lst.sortedDescending())

    println(lst.reversed())
}