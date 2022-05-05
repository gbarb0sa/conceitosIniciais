/*A série de Fibonacci é uma série iniciada com 0 e 1. Os demais elementos são sempre a soma dos 2 elementos
imediatamente anteriores.
Criar uma rotina que imprima os primeiros N elementos desta série, onde N é um parâmetro. Por exemplo, se n = 10, a
rotina imprime: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 */

fun main() {
    fibonacci(20)
}

fun fibonacci(n: Int) {
    var n1: Long = 0
    var n2: Long = 1

    for (x in 1..n) {
        var sequencia = n1 + n2
        print("$n1 ")
        n1 = n2
        n2 = sequencia

    }

}