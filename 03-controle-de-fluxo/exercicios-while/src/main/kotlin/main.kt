/**
 * Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água de
 * 7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido?
 */
fun ex01() {

    val qtdeBalao = 7
    var contBaloes = 0

    while (contBaloes * qtdeBalao + qtdeBalao < 2000) {
        contBaloes++
    }
    println("Balões utilizados: $contBaloes")
}

/**
 * FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
a. Quando um número for divisível por 3, imprimir Buzz.
b. Quando um número for divisível por 5, imprimir Fizz.
c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.
 */
fun ex02() {

    var i = 1
    while (i <= 50) {
        if (i % 3 == 0 && i % 5 == 0)
            print("FizzBuzz ")
        else if (i % 3 == 0)
            print("Buzz ")
        else if (i % 5 == 0)
            print("Fizz ")
        else
            print("$i ")
        i++
    }
}

/**
 * Escreva um programa capaz de receber um texto e imprimi-lo invertido.
Entrada: Meu nome é Julius. Saída: .suiluJ é emon ueM
 */
fun ex03(texto: String) {
    var posicao = texto.length

    while (posicao > 0) {
        print(texto[posicao - 1])
        posicao--
    }
}

/**
 * Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e
retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
“xxooox” -> true “xxxxo” -> false “bdefghjij” -> false “ooooxzzzzz” -> false
 */
fun ex04(texto: String): Boolean {
    var i = 0
    var countX = 0
    var countO = 0

    while (i < texto.length) {
        if (texto[i].lowercase() == "x")
            countX++
        else if (texto[i].lowercase() == "o")
            countO++
        i++
    }

    return (countO == countX && countO != 0)
}

fun main() {
    println("Exercício 01")
    ex01()
    println("Exercício 02")
    ex02()
    println("Exercício 03")
    ex03("Meu nome é Rodolfo")
    println("Exercício 04")
    println(ex04("xXooox"))
    println(ex04("xxxxo"))
    println(ex04("bdefghjij"))
    println(ex04("ooooxzzzzz"))
}