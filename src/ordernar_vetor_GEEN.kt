fun main() {
    var lista: IntArray = intArrayOf(1, 2, 4, 10, 6, 5, 8, 9, 3, 7)
    println("Lista desorganizada: ")
    for (i in lista) print("$i ")
    ordenacao(lista)
    //lista.sort() usaria o sort, mas por intuito de conhecimento preferi desevolver o codigo utilizando o simple sort.
    println()
    println()
    println("Lista organizada")
    for (i in lista) print("$i ")
    println()
    println()
    println("Posição dos primos: ")
    lista.forEachIndexed { index, element ->
        if (numerosPrimos(element)) {
            print("$index ")
        }
    }

}

fun numerosPrimos(x: Int): Boolean {
    var primo = true
    for (i in 2..x - 1) {
        if (x % i == 0)
            primo = false
    }
    return primo

}

fun ordenacao(lista: IntArray) {
    var n = lista.size
    var temp: Int

    for (x in 0..n - 1) {
        var inicialOrdenacao = x
        for (y in n - 1 downTo x) {
            if (lista[y] < lista[inicialOrdenacao])
                inicialOrdenacao = y

            if (x != inicialOrdenacao) {
                temp = lista[x]
                lista[x] = lista[inicialOrdenacao]
                lista[inicialOrdenacao] = temp
            }
        }

    }
}

