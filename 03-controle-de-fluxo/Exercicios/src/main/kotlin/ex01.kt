/**
 * Escreva um programa capaz de ler dois números inteiros que representam os lados e uma figura geométrica.
 * Informar se formam um quadrado (lados iguais)
 */

fun main() {
    print("Digite o tamanho do lado 1: ")
    val lado1 = readLine()

    print("Digite o tamanho do lado 2: ")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != ""){
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y){
            println("É um quadrado")
        }
        else {
            println("Não é um quadrado")
        }
    }

}