/*Montar uma rotina que imprima os números de 1 a 100. Mas caso o número seja múltiplo de 3, imprime “Fizz” no lugar do
número. Caso o número seja múltiplo de 5, imprime “Buzz” no lugar do número. Se for múltiplo de 3 e 5 ao mesmo tempo,
imprime “FizzBuzz”.
Exemplo: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 ...*/

fun main() {
    FizzBuzz()
}

fun FizzBuzz() {

    for (x in 1..100) {
        if (x % 3 == 0 && x % 5 == 0)
            println("FizzBuzz ")
        else if (x % 3 == 0)
            print("Fizz ")
        else if (x % 5 == 0)
            print("Buzz ")
        else
            print("$x ")
    }

}