interface Event {
    fun onSuccess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrindo conexões")
        println("Salvando valores")
        println("Sucesso. Conexões fechadas")
        e.onSuccess()
    }
}

//class Evento : Event {
//    override fun onSuccess() {
//        println("onSuccess!")
//    }
//}

fun main() {
    val p = Programa()

    p.salvar(object : Event{
        override fun onSuccess() {
            println("onSucess!")
        }
    })
}