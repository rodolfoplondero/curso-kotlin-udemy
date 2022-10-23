enum class Prioridade(val value: Int) {
    baixa(1) {
        override fun toString(): String {
            return "Prioridade baixa $value"
        }
    },
    media(5),
    alta(10)
}

enum class AnimalEnum {
    cachorro, gato, cavalo, vaca
}

fun x(p: Prioridade) {
    println(p.toString())
}

fun main() {

    for (p in Prioridade.values()) {
        println(p)
    }
}