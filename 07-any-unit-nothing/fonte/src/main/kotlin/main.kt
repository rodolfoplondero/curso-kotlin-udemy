fun main() {
    // Any, Unit e Nothing
    anyFun(true)
    unitFun(true)
    nothingFun(true)

}

fun anyFun(value: Any){
    println(value)
}

fun unitFun(value: Any): Unit{
    // Unit = função sem retorno
    println(value)
}

fun nothingFun(value: Any): Nothing {
    // Usado para lançamento de exceções
    TODO("Não implementado")
}