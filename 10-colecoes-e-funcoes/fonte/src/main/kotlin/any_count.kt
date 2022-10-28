fun main() {
    val data = geraDados()

    println("Tenho dados? ${if (data.any()) "sim" else "não"}")
    println("Tenho ${data.count()} elementos")
}