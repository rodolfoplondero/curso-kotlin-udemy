fun main() {
    val fig = Figura()

    // Não acessível
    // fig.funcaoProtected()
    // fig.funcaoPrivada()
}

open class Figura {
    protected fun funcaoProtected() {
    }

    private fun funcaoPrivada() {}
}

class Quadrado(lado: Int) : Figura() {
    fun area() {
        funcaoProtected()

        // Não acessível
        // funcaoPrivada()
    }
}