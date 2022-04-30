fun main () {
    val str = "Programação Kotlin"

    println("Tamanho da String ${str.length}")

    println("Posição (index) 0 da string: ${str [0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))

    println(str.substring(2, 5))
    println(str.replace("Kotlin", "Kotlin é brabo!"))
    println(str.lowercase())
    println(str.uppercase())

    println("         AOBA       ".trim())

}