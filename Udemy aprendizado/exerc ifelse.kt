fun exercQuatro() {
    println("Informe sua idade: ")
    val idade = readLine()
    if (idade != null) {
        if (idade >= 18.toString()) {
            println("Ok, pode entrar")
        } else {
            println("Negado, não é permitido menores")
            return
        }
    }
    println("Qual o seu convite? ")
    var tipoConvite = readLine()
    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo")
            println("Certo")
        else {
            println("Negado. Convite inválido")
            return
        }

        print("Qual o código do convite? ")
        var codigo = readLine()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()
            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
            } else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigo.startsWith("xl"))
                println("Welcome :)")

        } else {
            println("Convite inválido")
        }
    }
}
fun main() {
    exercQuatro()
}

fun exercUm() {
    println("Informe o primeiro número: ")
    val lado1 = readLine()

    println("Informe o segundo número: ")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        if (x == y) {
            println("É um quadrado")
        } else {
            println("Não é um quadrado")
        }
    }
}

fun exercDois() {
    println("Informe o primeiro número:")
    val lado1 = readLine()

    println("Informe o segundo número:")
    val lado2 = readLine()

    println("Informe o terceiro número:")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && x == z && y == z) {
            println("É um triangulo")
        } else {
            println("Não é um triangulo")
        }
    }
}

fun exercTres(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira String")
        else println("Segunda String")

    }
    println("Terceira String")
}
