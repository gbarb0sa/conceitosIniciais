fun main() {

    for (n in 1..50)
        print("$n ")

    for (x in 50 downTo 1)
        print("$x ")

    for (n in 1..50) {
        if (n % 5 == 0) {
            continue
        }
        print("$n ")
    }

    var soma: Int = 0
    for (y in 1..500) {
        soma += y
        print(soma)
    }
}



