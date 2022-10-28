fun main() {
    val data = geraDados()

    data.filter { it.calorias > 500 }
    println(data.map { it.nome })
    println(data.map { Receita(it.nome, it.calorias) })
}