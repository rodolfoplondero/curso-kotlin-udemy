import kotlin.math.pow

fun main() {

    convertAno(2)

    val palavra = "Rodolfo"
    val tamanho = countCaracteres(palavra)
    println("A palavra '$palavra' possui $tamanho caracteres")

    calcularCubo(2)

    val milhas = 2.0
    val km = convertDistancia(milhas)
    println("$milhas milhas é igual a $km km")

    convertCaracteres("Amanhã será DIA 18")
}

fun convertAno(anos: Short) {

    val meses = anos * 12
    val dias = anos * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    println("$anos equivalem a: ")
    println("$meses meses")
    println("$dias dias")
    println("$horas horas")
    println("$minutos minutos")
    println("$segundos segundos")
}

fun countCaracteres(word: String) = word.length

fun calcularCubo(numero: Int) {
    val cubo = numero.toDouble().pow(3.toDouble())

    println("O cubo de $numero é $cubo")
}

fun convertDistancia(milhas: Double): Double = milhas * 1.6

fun convertCaracteres(word: String) {

    var res = word.replace("a", "x", ignoreCase = true)
    res = res.uppercase()

    println("$word -> $res")
}