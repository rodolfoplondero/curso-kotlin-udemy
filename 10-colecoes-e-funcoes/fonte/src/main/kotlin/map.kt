fun main() {

    // Chave -> Valor
    // Simular aos dicionários do Python
    // Para duas chaves iguais, persiste o último valor definido

    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))

    println(map1)
    println(map1.entries)
    println(map1.values)

    map2["Brasil"] = "Brasilia"

    println(map2)
    println(map2.entries)
    println(map2.values)

    map2.remove("Brasil")
    println(map2)

    map2.contains("Brasil")
    map2.clear()
    println(map2)
}