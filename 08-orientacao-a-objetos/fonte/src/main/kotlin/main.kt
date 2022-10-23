class Pessoa(val anoNascimento: Int, var nome: String) {

    var doc: String? = null
        get() {
            println("Acesso get")
            return field
        }
        set(value) {
            println("Acesso set")
            field = value
        }


    constructor(anoNascimento: Int, nome: String, doc: String): this(anoNascimento, nome){
        this.doc = doc
    }

    fun dormir(){

    }

    fun acordar(){

    }

}

fun main() {

    val pessoa = Pessoa(1992, "Fulano", "30232")

    println(pessoa.nome)
    println(pessoa.anoNascimento)
    println(pessoa.doc)

    pessoa.doc="123"
    println(pessoa.doc)
}