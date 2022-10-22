fun main() {

    var str: String? = null

    if (str == null) {
        println("nulo")
    } else {
        println(str)
    }

    println(str ?: "nulo")

}