fun bonus(cargo: String): Float {

    var bonus: Float = 0f

    if (cargo == "Gerente") bonus = 2000f
    else if (cargo == "Coordenador") bonus = 1500f
    else if (cargo == "Engenheiro de software") bonus = 1000f
    else if (cargo == "Estagiário") bonus = 500f

    return bonus
}

fun bonusExperiencia(cargo: String, experiencia: Int): Float {

    var bonus: Float = 0f

    if (cargo == "Gerente") bonus = if (experiencia < 2) 2000f else 3000f
    else if (cargo == "Coordenador") bonus = if (experiencia < 1) 1500f else 1800f
    else if (cargo == "Engenheiro de software") bonus = 1000f
    else if (cargo == "Estagiário") bonus = 500f

    return bonus
}

fun main() {
    var bonus = bonus("Gerente")
    println(bonus)

    bonus = bonusExperiencia("Gerente", 3)

    if (bonus == 0f) println("Cargo incorreto")
    else println(bonus)
}