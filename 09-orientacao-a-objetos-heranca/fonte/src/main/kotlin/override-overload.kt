fun main() {
    val comp = Computador2("DELL", 4500f)
    comp.minhaMarca()

    // Kotlin sabe qual das funções chamar, já que as assinaturas são diferentes
    comp.overload("1")
    comp.overload(1)
    comp.overload(1, 2)
}

// Classe base
open class Maquina2(val marca: String) {
    open fun minhaMarca() {
        println("Sou da marca: $marca")
    }
}

// Classe especializada
class Computador2(marca: String, val preco: Float) : Maquina2(marca) {

    override fun minhaMarca() {
        println("Minha marca é $marca e custo R$ $preco.")
    }

    fun overload(a: String) = println("Overload 1")

    fun overload(a: Int) = println("Overload 2")

    fun overload(a: Int, b: Int) = println("Overload 3")
}