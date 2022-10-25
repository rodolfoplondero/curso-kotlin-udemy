open class Eletronico(var marca: String) {
    private fun ativarCorrente() {
        print("Ativando corrente... ")
    }

    fun ligar() {
        ativarCorrente()
        println("Ligou")
    }

    fun desligar() {
        println("Desligou")
    }
}

class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {}
}

fun main() {

    var c: Computador = Computador("Dell")
    c.ligar()
    c.desligar()
}