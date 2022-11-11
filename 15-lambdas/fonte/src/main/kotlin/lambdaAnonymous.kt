interface EventListener{
    fun click()
}

class Form{
    fun clickJava(e: () -> Unit){}
    fun clickKotlin(e: EventListener) {}
}

class Main{
    fun main(){

        // SAM Conversion - Sigle Abstract Method
        // Só funciona se a interface é implementada em JAVA e tem somente um único método
        Form().clickJava { }
        Form().clickKotlin(object : EventListener{
            override fun click() {
            }
        })
    }
}