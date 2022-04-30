fun main() {
helloWorld()
    println("A soma de 10 e 5 é ${sum( a= 10, b= 5)}")
    //divisao (10f, 3.5f)
     divisao (10f, 3.5f)
    println(divisao(10f, 3.5f))
}

fun sum (a: Int, b: Int): Int {
    return (a + b)

    fun sum2 (a: Int, b: Int) = (a + b) // função de uma unica linha
    
}

fun helloWorld () {
    println ("Hello, world!")
}
fun helloWorld2 () = println("Hello, world2!")

//fun divisao (a: Float, b: Float): Float {
    //return (a / b)
//}
fun divisao (c: Float, d: Float) = c / d
