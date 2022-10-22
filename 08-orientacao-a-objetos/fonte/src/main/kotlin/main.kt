class Pessoa(val anoNascimento: Int, var nome: String) {

    fun dormir(){

    }

    fun acordar(){

    }

}

fun main() {

    val pessoa = Pessoa(1992, "Fulano")

    println(pessoa.nome)
    println(pessoa.anoNascimento)

    pessoa.acordar()
    pessoa.dormir()
}