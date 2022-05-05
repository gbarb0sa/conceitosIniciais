fun ex1() {

    val caixa = 2000
    val balao = 7

    var numBaloes = 0
    while ((numBaloes * balao) + balao < caixa) {
        numBaloes++
    }
    println("Cabem $numBaloes na caixa d'água.")

}

fun ex2() {
    var i = 1
    while (i <= 50) {
        if (i % 15 == 0) {
            print("FizzBuzz ")
        } else if (i % 3 == 0) {
            print("Buzz ")
        } else if (i % 5 == 0) {
            print("Fizz ")
        } else {
            print("$i")
        }
        i++
    }
}

fun ex3(str: String) {
    var i = str.length - 1
    while (i >= 0) {
        print(str[i])
        i--
    }

}

fun ex4(str: String): Boolean {
    val strLower = str.lowercase()

    var countX = 0
    var countO = 0

    var i = 0
    while (i < strLower.length) {
        if (str[i] == 'x') {
            countX++
        } else if (str[i] == 'o') {
            countO++

        }
        i++
    }
    return (countX == countO && (countX != 0))
}

fun main() {
    println(ex4("Xxooox"))
    println(ex4("xxxxo"))
    println(ex4("qweeqweeqw"))
    println(ex4("xxxooozzzazxoo"))
}
















