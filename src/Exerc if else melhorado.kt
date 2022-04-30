fun exerc1() {
    var n1 = readLine()?.toInt()
    var n2 = readLine()?.toInt()

    if (n1 != null && n2 != null) {
        println("O primeiro número escolhido é: $n1")
        println("O segundo número escolhido é: $n2")
    }
    if (n1 == n2) {
        println("Temos um quadrado")
    } else {
        println("Não temos um quadrado")
    }
}

fun exerc2() {
    var n1 = readLine()?.toInt()
    var n2 = readLine()?.toInt()
    var n3 = readLine()?.toInt()


    if (n1 != null && n2 != null && n3 != null) {
        println("O primeiro número escolhido é: $n1")
        println("O segundo número escolhido é: $n2")
        println("O terceiro número escolhido é: $n3")
    }
    if (n1 == n2 && n1 == n3 && n2 == n3) {
        println("Triangulo equilátero")
    } else {
        println("não é")
    }
}

fun exerc3() {

    println("Bem-vindo ao Evento X")
    println("Por favor, informe a sua idade: ")
    var idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Não é permitido menores.")
            return
        } else {
            println("Ok")
        }
    }
    println("Informe o tipo de convite: ")

    var convite = readLine()?.lowercase()
    if (convite != null && convite != "") {
        if (convite == "comum" || convite == "premium" || convite == "luxo") {
            println("Ok, siga em frente")
        } else {
            println("Negado. Convite inválido")
            return
        }

        println("Por favor, informe os 2 primeiros códigos do seu convite: ")

        var codConvite = readLine()?.uppercase()
        if (codConvite == "XL" && convite == "premium" || convite == "luxo") {
            println("Welcome")
        } else if (codConvite == "XT" && convite == "comum") {
            println("Welcome")
        } else {
            println("Negado. Convite inválido")
            return
        }

    }
}

fun main() {
    exerc1()
}