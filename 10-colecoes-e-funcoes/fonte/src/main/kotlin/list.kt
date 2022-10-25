/*
Coleções -> List, Set e Map
 */

fun main() {

    // List
    val lst1: List<Int> = listOf(1, 2, 3, 4, 5)
    val lst2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(lst2[0])
    println(lst2.size)

    lst2.add(8)
    lst2.add(10)
    lst2.remove(8)
    lst2.removeAt(0)

    println(lst2.contains(1))
    lst2.clear()

    println(lst2)

}