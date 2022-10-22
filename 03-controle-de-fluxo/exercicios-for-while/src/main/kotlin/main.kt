/**
 * Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada: "1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50"
 */
fun ex01() {

    for (i in 1..50) {
        print("$i ")
    }

}

/**
 * Imprima os números de 1 a 50 na mesma linha em ordem decrescente. Saída esperada: “50 49 48 47 .. .. .. 2 1"
 */
fun ex02() {
    for (i in 50 downTo 1) print("$i ")
}

/**
 * Usando a resolução do exercício 1, não imprima os números múltiplos de 5.
 */
fun ex03() {
    for (i in 1..50) {
        if (i % 5 != 0) print("$i ")
    }
}

/**
 * Faça a soma de todos os números no intervalo de 1 a 500
 */
fun ex04() {
    var soma = 0
    for (i in 1..500) soma += i

    print("Soma = $soma")
}

/**
 * Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando o caracter #.
 * Se a entrada do programa for 3, teremos:
 * #
 * ##
 * ###
 * Se a entrada do programa for 5, teremos:
 * #
 * ##
 * ###
 * ####
 * #####
 */
fun ex05(n: Int) {
    var s = ""
    for (i in 1..n) {
        s += "#"
        println(s)
    }
}


fun main() {

    println("Exercício 01")
    ex01()
    println("\nExercício 02")
    ex02()
    println("\nExercício 03")
    ex03()
    println("\nExercício 04")
    ex04()
    println("\nExercício 05")
    ex05(5)
}