fun main() {
    helloWorld()

    val soma = sum(10, 5)

    println(soma)

    println("A soma de 5 e 1 é ${sum(5, 1)}")
}

fun helloWorld() {
    println("Hello world")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}