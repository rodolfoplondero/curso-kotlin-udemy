fun main() {

    var i = 0

    /**
     * O Break interrompe o loop
     */
    while (i < 100) {
        if (i == 10) break
        print("$i ")
        i++
    }

    println()
    i = 0

    /**
     * O continue ignora as instruções que executam após sua chamada, indo para o próximo item
     */
    while (i < 100) {
        if (i < 50) {
            i++
            continue
        }
        print("$i ")
        i++
    }

}