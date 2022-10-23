fun main() {
    val p = Pessoa(1985, "Frank")
    p.acordar()
    p.dormir()

    with(p){
        acordar()
        dormir()
        nome
    }

}