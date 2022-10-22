fun main() {
    println(media(3f, 6f, 3f))
    println(mediaGeneric(true, 3f, 6f, 3f, 2, ""))

    arrayOf(2, 3, 4, 45f, false)
}

/*
Uso do vararg
 */
fun media(vararg notas: Float): Float {
    var soma = 0f

    for (n in notas) {
        soma += n
    }

    return (soma / notas.size)
}

/*
   Generics
 */

fun <T, J> mediaGeneric(abc: J, vararg notas: T): Float {
    var soma = 0f
    var count = 0
    for (n in notas) {
        if (n is Float){
            soma += n
            count++
        }
    }

    return (soma / count)
}