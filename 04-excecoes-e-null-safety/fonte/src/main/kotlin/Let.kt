fun main() {
    var str: String? = null

    if (str != null) {
        str.lowercase()
        str.length
    }

    str?.let {
        it.lowercase()
        it.length
    }

}