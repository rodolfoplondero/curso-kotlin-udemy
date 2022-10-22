fun bonusWhen(cargo: String): Float {

    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}

fun main() {
    println(bonusWhen("Coordenador"))
    println(bonusWhen("Coordenador2"))
}