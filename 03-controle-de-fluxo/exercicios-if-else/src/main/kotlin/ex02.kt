/**
 * Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo.
 * Informar se é um triângulo equilátero (todos os lados iguais).
 */

fun triangulo(l1: Int, l2: Int, l3: Int) {
    if (l1 == l2 && l2 == l3) {
        println("É um triângulo")
    } else
        println("Não é um triângulo")
}

fun main() {

    print("Informe o lado 1: ")
    val lado1 = readLine()

    print("Informe o lado 2: ")
    val lado2 = readLine()

    print("Informe o lado 3: ")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" &&
        lado2 != null && lado2 != "" &&
        lado3 != null && lado3 != ""
    ) {
        triangulo(lado1.toInt(), lado2.toInt(), lado3.toInt())
    }
}