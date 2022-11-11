
// { parâmetros -> corpo }

fun abs(x: Int) {

}

fun main() {

    val a = {
        println("Hello")
        println("World")
    }
    receiveA(a)

    val b = { x: Int -> x * x }
    receiveB(b)

    val c = { x: Int, y: Int ->
        println("Executando")
        x * y }

    receiveC(c)
    val teste = c(10, 3)
    println(teste)

    receiveA {
        println("1")
        println("2")
    }

}

// () -> Unit
fun receiveA(lambda: () -> Unit){
    lambda()
}

fun receiveB(tt: (x: Int) -> Int) {
    println(tt)
}

fun receiveC(lamb: (c1: Int, c2: Int) -> Int){

}