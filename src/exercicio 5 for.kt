fun ex5(n: Int) {
    for (i in 1..n) {
        for (x in 1..i) {
            print("#")
        }
        println()
    }
}

fun main() {
    ex5(5)
}